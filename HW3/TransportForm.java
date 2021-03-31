package com.company.ArchitectureHW.HW3;

public class TransportForm {
    private final DrawSchema rightSchema;
    private final MarcScratches rightScratches;
    private final Rules rightRules;

    public TransportForm (ArendaFactory factory){
        System.out.println("Приложение запускается...");
        rightSchema = factory.createDrawSchema();
        rightScratches = factory.createMarcScratches();
        rightRules = factory.createRules();
    }
}
