package com.company.ArchitectureHW.HW4.HW4_3;

public class Sugar extends DecoratorCaffee{
    Coffee coffee;

    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName() + " + sugar";
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 5;
    }
}
