package com.company.ArchitectureHW.HW5;

public class FloorCoolingCommand implements Command{
    Floor floor;

    public FloorCoolingCommand (Floor floor){
        this.floor = floor;
    }

    @Override
    public void execute(){
        floor.coolFloor();
    }

    @Override
    public void undo() {
        floor.heatFloor();
    }
}

