package com.fawry.challenge;
public class Car{
    private int speed = 0;
    private Engine engine;
    private boolean isRunning= false;
    public Car(Engine engine){
        this.engine= engine;
    }
    public void setEngine(Engine engine){
        this.engine =engine;
    }
    public void start(){
        this.isRunning=true;
        this.speed=0;
    }

    public void accelerate(){
        if(!isRunning) {
         System.out.println("Start the engine first");
            return;
        }
        if(speed + 20<=200){
            speed+=20;
            engine.updateStatus(speed);
            for(int i=0 ; i<20;i++){
                engine.increase();
            }
        }else{
            System.out.println("Can't increase than 200 ");
        }
    }
    public void brake() {
        if (speed - 20 >= 0) {
            speed -= 20;
            engine.updateStatus(speed);
            for (int i = 0; i < 20; i++) engine.decrease();
        }else{
            System.out.println("Car is already at 0 km/h.");
        }
    }

    public void stop() {
        if (speed == 0) {
            this.isRunning = false;
        }else{
            System.out.println("Speed should be 0 use brake first");
        }
    }

    public int getSpeed() { return speed; }
    public Engine getEngine() { return engine; }


}