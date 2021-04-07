package com.company.ArchitectureHW.HW5;

public class FloorHeatingCommand implements Command{
    Floor floor;

    public FloorHeatingCommand(Floor floor){
        this.floor = floor;
    }

    @Override
    public void execute(){
        floor.heatFloor();
    }

    @Override
    public void undo() {
        floor.coolFloor();
    }
}
