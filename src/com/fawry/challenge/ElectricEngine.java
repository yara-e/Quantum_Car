package com.fawry.challenge;
public class ElectricEngine implements Engine {
    private int internalSpeed = 0;

    @Override
    public void increase() {
        internalSpeed++;
    }

    @Override
    public void decrease() {
        internalSpeed--;
    }

    @Override
    public void updateStatus(int speed) {
        System.out.println("Electric Engine received update: Car is moving at " + speed + " km/h.");
    }

    @Override
    public int getInternalSpeed() {
        return internalSpeed;
    }
}
