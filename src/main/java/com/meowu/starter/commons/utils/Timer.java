package com.meowu.starter.commons.utils;

import java.util.function.Function;
import java.util.function.Supplier;

public class Timer{

    private long startTime;
    private long endTime;

    public Timer(){
        this.startTime = 0;
        this.endTime = 0;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public void resume(){
        this.startTime = 0;
        this.endTime = 0;
    }

    public long getDuration(){
        // never started
        if(this.startTime == 0){
            this.endTime = 0;
        }
        return (this.endTime - this.startTime);
    }
}
