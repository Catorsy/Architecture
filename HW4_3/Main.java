package com.company.ArchitectureHW.HW4.HW4_3;

//идея: формировать счет посетителю кофейни исходя из набранной еды.
//сначала напишем класс с кофе, абстрактный, чтобы был в нашем меню не один "базовый" напиток
//напишем к нему декоратор
//напишем пару классов кофе
//напишем тройку классов дополнительных опций
//считаем, что мы заказали

public class Main {
    public static void main(String[] args) {
        Coffee forAnna = new Cappuchino();
        System.out.println("Анна заказала: " + forAnna.getName() + " " + forAnna.getPrice());
        forAnna = new Cookie(forAnna);
        System.out.println("Анна посидела и заказала ещё: " + forAnna.getName() + " " + forAnna.getPrice());

        Coffee forAnton = new Mocha();
        forAnton = new Cookie((new doubleMilk(forAnton)));
        System.out.println("Антон хочет и молоко, и печеньку: " + forAnton.getName() + " " + forAnton.getPrice());

        Coffee forBrus = new Cappuchino();
        forBrus = new Cookie(new doubleMilk(new Sugar(forBrus)));
        System.out.println("А Брюс сластёна и заказал всё и сразу: " + forBrus.getName() + " " + forBrus.getPrice());
    }
}
