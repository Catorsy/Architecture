package com.company.ArchitectureHW.HW4.HW4_3;

public class Cookie extends DecoratorCaffee{
    Coffee coffee;

    public Cookie (Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName() + " + cookie";
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 20;
    }
}
