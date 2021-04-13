package MVC.HW7;
//это то, что видит пользователь

public class PieView {

    public void drawPie(String dough, String filling, String decoration, int weight){
        System.out.println("Спасибо за заказ! Вот ваш пирожок: из " + dough + " теста с начинкой " + filling + ", с посыпкой " + decoration + ", весом " + weight + " грамм.");
    }

    //было бы приколько реализовать тут визуальные кнопки-картинки, тыкнуть на нужную функцию) дорастём)
}