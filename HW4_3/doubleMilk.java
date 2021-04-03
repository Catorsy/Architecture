package com.company.ArchitectureHW.HW4.HW4_3;

public class doubleMilk extends DecoratorCaffee {
    Coffee coffee;

    public doubleMilk (Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName() + " + doubleMilk";
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 10;
    }
}
