package com.company.ArchitectureHW.HW5;

public class LightOfCommand implements Command {
    Light light;

    public LightOfCommand (Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
