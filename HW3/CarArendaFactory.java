package com.company.ArchitectureHW.HW3;

public class CarArendaFactory implements ArendaFactory{

    public CarArendaFactory(){
        System.out.println("Запускаю приложение для автомобиля...");
    }

    @Override
    public DrawSchema createDrawSchema() {
        System.out.println("Я нарисовал тебе схему автомобиля.");
        return new CarSchema();
    }

    @Override
    public MarcScratches createMarcScratches() {
        System.out.println("Отметь на деталях автомобиля дефекты.");
        return new CarMarcScratches();
    }

    @Override
    public Rules createRules() {
        System.out.println("Я выслал тебе памятку по уходу за автомобилем.");
        return new CarRules();
    }
}
