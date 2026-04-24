package com.fawry.challenge;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- CASE 1: Factory Creation & Basic Acceleration ---");
        Car gasCar = CarFactory.createCar(EngineType.GAS);
        gasCar.start();
        gasCar.accelerate();
        System.out.println("Car Speed: " + gasCar.getSpeed());
        System.out.println("Gas Engine Internal Speed: " + gasCar.getEngine().getInternalSpeed());

        System.out.println("\n--- CASE 2: Engine Replacement ---");
        gasCar.setEngine(new HybridEngine());
        System.out.println("Engine successfully swapped to Hybrid.");

        System.out.println("\n--- CASE 3: Hybrid Engine ---");
        gasCar.accelerate(); // 40 (Electric)
        gasCar.accelerate(); // 60 (Switches to Gas)
        System.out.println("Speed is now " + gasCar.getSpeed() + " km/h. Hybrid should now use Gas Engine.");

        System.out.println("\n--- CASE 4: Brake and Stop Requirement ---");
        gasCar.brake(); // 40
        gasCar.stop(); // Should fail
        System.out.println("Current speed: " + gasCar.getSpeed() + ". Trying to stop...");


        gasCar.brake(); // 20
        gasCar.brake(); // 0
        gasCar.stop();
        System.out.println("Speed is " + gasCar.getSpeed() + ". Car stopped successfully.");

        System.out.println("\n--- CASE 5: Max Speed Limit ---");
        gasCar.start();
        for(int i = 0; i < 15; i++) gasCar.accelerate(); // Try to exceed 200
        System.out.println("Final speed after excessive acceleration: " + gasCar.getSpeed() + " km/h");
    }
}