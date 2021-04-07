package com.company.ArchitectureHW.HW5;

public class Pult {
    private Command onLightCommand;
    private Command offLightCommand;

    private Command onHeatCommand;
    private Command onCoolCommand;

    private Command onTeapotCommand;
    private Command offTeaporCommand;

    private Command undoCommand; //будем запоминать здесь последнюю команду; надо для поддержки отмены

    public Pult(Command onCommand, Command offCommand, Command onHeatCommand, Command onCoolCommand, Command onTeapotCommand, Command offTeaporCommand) {
        this.onLightCommand = onCommand;
        this.offLightCommand = offCommand;
        this.onHeatCommand = onHeatCommand;
        this.onCoolCommand = onCoolCommand;
        this.onTeapotCommand = onTeapotCommand;
        this.offTeaporCommand = offTeaporCommand;
    }


    public void lightOn(){
        onLightCommand.execute();
        undoCommand = onLightCommand;
    }

    public void lightOff(){
        offLightCommand.execute();
        undoCommand = offLightCommand;
    }

    public void floorHeats(){
        onHeatCommand.execute();
        undoCommand = onHeatCommand;
    }

    public void floorCools(){
        onCoolCommand.execute();
        undoCommand = onCoolCommand;
    }

    public void teapotOn(){
        onTeapotCommand.execute();
        undoCommand = onTeapotCommand;
    }

    public void teapotOff(){
        offTeaporCommand.execute();
        undoCommand = offTeaporCommand;
    }

    public void undoOperation(){
        try {
            undoCommand.undo();
        } catch (NullPointerException e){
            System.out.println("Вы ещё ничего не сделали! Нечего отменять.");
        }
    }
}
