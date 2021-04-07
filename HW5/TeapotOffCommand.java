package com.company.ArchitectureHW.HW5;

public class TeapotOffCommand implements Command{
    Teapot teapot;

    public TeapotOffCommand(Teapot teapot){
        this.teapot = teapot;
    }

    @Override
    public void execute (){
        teapot.teapotOff();
    }

    @Override
    public void undo() {
        teapot.teapotOn();
    }
}
