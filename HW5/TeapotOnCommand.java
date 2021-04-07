package com.company.ArchitectureHW.HW5;

public class TeapotOnCommand implements Command{
    Teapot teapot;

    public TeapotOnCommand (Teapot teapot){
        this.teapot = teapot;
    }

    @Override
    public void execute(){
        teapot.teapotOn();
    }

    @Override
    public void undo() {
        teapot.teapotOff();
    }
}
