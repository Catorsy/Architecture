package com.company.ArchitectureHW.HW3;

public class MotoArendaFactory implements ArendaFactory{

    public MotoArendaFactory(){
        System.out.println("Запускаю приложение для мотоцикла...");
    }

    @Override
    public DrawSchema createDrawSchema() {
        System.out.println("Я нарисовал тебе мотоцикл.");
        return new MotoSchema();
    }

    @Override
    public MarcScratches createMarcScratches() {
        System.out.println("Отметь на деталях мотоцикла дефекты.");
        return new MotoMarcScratches();
    }

    @Override
    public Rules createRules() {
        System.out.println("Я выслал тебе памятку по уходу за мотоциклом.");
        return new MotoRules();
    }
}
