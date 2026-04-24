package com.fawry.challenge;
public class CarFactory {
    public static Car createCar(EngineType type) {
        switch (type) {
            case GAS: return new Car(new GasEngine());
            case ELECTRIC: return new Car(new ElectricEngine());
            case HYBRID: return new Car(new HybridEngine());
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}