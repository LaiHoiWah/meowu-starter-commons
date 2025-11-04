package com.meowu.starter.commons.utils;

public class TimerUtils{

    private long startTime;
    private long endTime;

    public TimerUtils(){
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
