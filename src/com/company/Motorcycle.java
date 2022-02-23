package com.company;

public class Motorcycle {

    String model;
    String color;
    boolean engineState = false;

    void startEngine() {
        if (engineState == true)
            System.out.println("The engine is already on");
        else {
            engineState = true;
            System.out.println("The engine is now on");
        }

    }

    void showAttr(){
        System.out.println("This motorcycle is a " + color + " " +model);
        if (engineState == true) {
            System.out.println("The engine is on.");
        }else
            System.out.println("The engine is off.");
    }

    public static void main (String[] args) {
        Motorcycle motor = new Motorcycle();
        motor.model = "Yamaha";
        motor.color = "Red";
        System.out.println("Calling showAttr...");
        motor.showAttr();
        System.out.println("--------------------");
        System.out.println("Starting engine...");
        motor.startEngine();
        System.out.println("--------------------");
        System.out.println("Starting engine");
        motor.startEngine();

    }


}
