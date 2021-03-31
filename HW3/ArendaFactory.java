package com.company.ArchitectureHW.HW3;

public interface ArendaFactory {
    DrawSchema createDrawSchema();
    MarcScratches createMarcScratches();
    Rules createRules();
}