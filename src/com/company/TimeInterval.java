package com.company;

public class TimeInterval {
    private TimeInterval interval;

    public TimeInterval(int time)
    {
    }
    public boolean overlapsWith(TimeInterval interval)
    {
        return (this.interval == interval);
    }
}
