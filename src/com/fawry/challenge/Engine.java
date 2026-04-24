package com.fawry.challenge;
public interface Engine{
    void increase();
    void decrease();
    void updateStatus(int currentCarSpeed);
    int getInternalSpeed();
}

