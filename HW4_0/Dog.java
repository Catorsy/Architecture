package com.company.ArchitectureHW.HW4.HW4_0;

//собака может гулять, если будет пристегнута

public class Dog {
    private static boolean ready;
    public static void walk () {
        if (ready){
            System.out.println("Гав-гав! Я могу идти гулять!");
        }
    }

    public static void setReady(boolean ready) {
        Dog.ready = ready;
    }
}
