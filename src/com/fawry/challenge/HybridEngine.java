package com.fawry.challenge;
public class HybridEngine implements Engine {
    private final Engine gas = new GasEngine();
    private final Engine electric = new ElectricEngine();
    private Engine activeEngine;

    public HybridEngine() {
        this.activeEngine = electric;
    }

    @Override
    public void updateStatus(int speed) {
        if (speed < 50) {
            this.activeEngine = electric;
            System.out.println("Hybrid Status: Below 50 -> Switching to Electric.");
        } else {
            this.activeEngine = gas;
            System.out.println("Hybrid Status: 50 or Above -> Switching to Gas.");
        }
    }

    @Override
    public void increase() {
        activeEngine.increase();
    }

    @Override
    public void decrease() {
        activeEngine.decrease();
    }

    @Override
    public int getInternalSpeed() {
        return activeEngine.getInternalSpeed();
    }
}
