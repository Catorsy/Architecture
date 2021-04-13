package MVC.HW7;
//MVC имеет три слоя: модель, представление и контроллер.
//идея: сделать модификатор пирожочков для столой. Приложение-конструктор для заказов. В идеале я бы добавила туда хранителя, но пока не успеваю...
//для начала давайте сделаем представление.
//далее бизнес-логика. Там делают наш пирожок.
//и пишем контроллер. А потом код для пользователя.

import MVC.example.Course;

public class Main {
    public static void main(String[] args) {
        PieView view = new PieView();
        CookingPie model = new CookingPie();

        PieController controller = new PieController(model, view);
        controller.setDoughType("сырного");
        controller.setFillingType("мясо и лучок");
        controller.setDecoration("побольше соли");
        controller.setWeight(500);
        controller.makePie();
        }
}
