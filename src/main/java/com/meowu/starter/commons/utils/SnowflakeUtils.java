package com.meowu.starter.commons.utils;

import java.util.concurrent.atomic.AtomicLong;

public class SnowflakeUtils{

    // 1992-08-29 23:00:00.000
    private static final long TW_EPOCH = 715100400000L;

    private static final long WORKER_ID_BITS = 5L;
    private static final long CENTER_ID_BITS = 5L;
    private static final long SEQUENCE_BITS  = 12L;

    private static final long MAX_WORKER_ID = ~(-1L << WORKER_ID_BITS);
    private static final long MAX_CENTER_ID = ~(-1L << CENTER_ID_BITS);

    private static final long WORKER_ID_SHIFT = SEQUENCE_BITS;
    private static final long CENTER_ID_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS;
    private static final long TIMESTAMP_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS + CENTER_ID_BITS;

    private static final long SEQUENCE_MASK = ~(1L << SEQUENCE_BITS);

    private final long centerId;
    private final long workerId;

    private final AtomicLong sequence = new AtomicLong(0);
    private final AtomicLong lastTimestamp = new AtomicLong(0);

    public SnowflakeUtils(long centerId, long workerId){
        if(centerId > MAX_CENTER_ID || centerId < 0){
            throw new IllegalArgumentException("Snowflake: CENTER_ID must be less than " + MAX_CENTER_ID + " or greater than 0");
        }
        if(workerId > MAX_WORKER_ID || workerId < 0){
            throw new IllegalArgumentException("Snowflake: WORKER_ID must be less than " + MAX_WORKER_ID + " or greater than 0");
        }

        this.centerId = centerId;
        this.workerId = workerId;
    }

    public synchronized long nextId(){
        long currentTimestamp = System.currentTimeMillis();

        if(currentTimestamp < this.lastTimestamp.get()){
            throw new IllegalArgumentException("Snowflake: Clock moved backwards");
        }

        if(currentTimestamp == this.lastTimestamp.get()){
            this.sequence.compareAndSet(SEQUENCE_MASK, 0);
            this.sequence.incrementAndGet();

            if(this.sequence.get() > SEQUENCE_MASK){
                currentTimestamp = System.currentTimeMillis();
            }
        }else{
            this.sequence.set(0);
        }

        // update last timestamp
        this.lastTimestamp.set(currentTimestamp);

        return ((currentTimestamp - TW_EPOCH) << TIMESTAMP_SHIFT)
                | (this.centerId << CENTER_ID_SHIFT)
                | (this.workerId << WORKER_ID_SHIFT)
                | this.sequence.get();
    }
}
