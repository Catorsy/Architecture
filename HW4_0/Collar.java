package com.company.ArchitectureHW.HW4.HW4_0;

public class Collar implements fastenable{
    private  Dog dog;
    public Collar (Dog dog){
        this.dog = dog;
    }

    @Override
    public void fast() {
        Dog.setReady(true); //я не уверена, должен ли адаптер быть ТОЛЬКО адаптером и должен ли он не иметь своих собственных действий.
        //Если адаптеру запрещено иметь свои действия, то эту строчку - убрать, иф из собаки убрать. Оно сделано исключительно для наглядности и функционала не несёт.
        this.dog.walk();
    }
}
