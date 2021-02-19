package com.cognytetask.demo.entities;

public class Request {

    static Long nextId = 0L;
    Long id;
    int maxLoopCounter;
    int sleepBetweenLoops;
    String text;

    public Request() {
        this.id = nextId++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxLoopCounter() {
        return maxLoopCounter;
    }

    public void setMaxLoopCounter(int maxLoopCounter) {
        this.maxLoopCounter = maxLoopCounter;
    }

    public int getSleepBetweenLoops() {
        return sleepBetweenLoops;
    }

    public void setSleepBetweenLoops(int sleepBetweenLoops) {
        this.sleepBetweenLoops = sleepBetweenLoops;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
