package com.company.ArchitectureHW.HW3;
import java.util.Scanner;

//идея: приложения для осмотра ТС пере тем, как его взять в аренду. Разные классы ТС имеет смысл подвести под общий знаменатель.
//Если фирма решит сдавать ещё, например, самокаты, добавить функционал будет очень просто!

//1. Определим интерфейсы, что программа умеет. DrawSchema, MarcScratces, Rules.
//2. Создаем реализацию для наших ТС. Скажем, пока мы умеем сдавать только машины и мотоциклы. Для каждого ТС прописываем наследственности.
//3. Создаем абстрактную фабрику, которая свяжет все элементы воедино. ArendaFactory
//4. Создаем различные реализации нашей фабрики для каждого ТС. CarArendaFactory, MotoArendaFactory
//5. Пишем класс формы. TransportForm
//6. Наконец, пишем ифы, определяющие, по какому пути должно идти приложение.


public class HW3AbstractFactory {
    private TransportForm transportForm;

    public void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Что арендуем? Введите moto или auto.");
        String typeOfTransport = sc.nextLine();

        ArendaFactory arendaFactory;

        if(typeOfTransport.equals("auto")){
            arendaFactory = new CarArendaFactory();
        }else if (typeOfTransport.equals("moto")){
            arendaFactory = new MotoArendaFactory();
        }else {
            System.out.println("Вы ввели что-то не то!");
            return;
        }
        transportForm = new TransportForm(arendaFactory);
    }

    public static void main(String[] args) {
        HW3AbstractFactory myApp = new HW3AbstractFactory();
        myApp.check();
    }
}
