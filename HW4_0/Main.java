package com.company.ArchitectureHW.HW4.HW4_0;

//идея: взять собаку на поводок. Но втыкать поводок прямо в собаку было бы слишком жестоко!
//итак, у нас в наличии собака и желаемый интерфейс "пристегнуть"
//пишем адаптер, чтобы собака могла быть пристёгнутой. Т.е. по сути создаём ошейник.
//пристёгиваем поводок к ошейнику-адаптеру.

public class Main {
    public static void main(String[] args) {
        fastenable collar = new Collar(new Dog());
        collar.fast();
    }
}
