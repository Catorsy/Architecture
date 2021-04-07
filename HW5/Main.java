package com.company.ArchitectureHW.HW5;

// идея: умный дом и пульт к нему
// начало паттерна "команда" - создание execute, interface Command. Его будут реализовывать все объекты команд.
// далее нужно создать классы устройств, которые нам подчиняются. Мы умеем включать свет, подогревать пол и ставить чайник.
// создаем классы, которые реализуеют все наши команды. Они принимают на вход объект и реализуют интерфейс комманд
// создаем пульт, который будет вызывать команды, по сути являясь слепым посредником
// создаем класс-реализацию
// а потом пробуем ещё добавить в код операция "отмена" (undo)


public class Main {
    public static void main(String[] args) {
        Light light = new Light(); //создаем объекты в доме
        Floor floor = new Floor();
        Teapot teapot = new Teapot();

        Command onCommand = new LightOnCommand(light); //создаем команды и передаем им объекты
        Command offCommand = new LightOfCommand(light);
        Command onHeatCommand = new FloorHeatingCommand(floor);
        Command offHeatCommand = new FloorCoolingCommand(floor);
        Command onTeapot = new TeapotOnCommand(teapot);
        Command offTeapot = new TeapotOffCommand(teapot);

        Pult pult = new Pult(onCommand, offCommand, onHeatCommand, offHeatCommand, onTeapot, offTeapot); //загружаем команды в пульт

        pult.undoOperation(); //проверим, что будет, если тыкнуть отмену, когда нечего отменять
        pult.lightOn();
        pult.lightOff();
        pult.floorCools();
        pult.floorHeats();
        System.out.println("Передумали и отменяем последнюю операцию. В доме слишком жарко:");
        pult.undoOperation();
        pult.teapotOn();
        pult.teapotOff();
        System.out.println("Жалко чайник... Передумали и отменяем последнюю операцию:");
        pult.undoOperation();
    }
}
