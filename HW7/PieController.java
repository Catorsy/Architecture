package MVC.HW7;

//наш контроллер должен уметь, поймав клиентский запрос, обратиться к модели (собрать на кухне пирожок), а потом
//обновить вьюшку. Здесь же и всякие проверки.

import MVC.example.Course;
import MVC.example.CourseView;

public class PieController {
    private CookingPie kitchen; //=model
    private PieView view;
    public PieController(CookingPie kitchen, PieView view){
        this.kitchen = kitchen;
        this.view = view;
    }

    public void setDoughType(String dType){
        kitchen.setDough(dType);
    }

    public void setFillingType(String fType){
        kitchen.setFilling(fType); //нет, нет, здесь мы собираем не такие f-type...
    }

    public void setDecoration(String decor){
        kitchen.setDecoration(decor);
    }

    public void setWeight(int weight) {
        if (weight >= 100  & weight <=1000){
            kitchen.setWeight(weight);
        }else{
            System.out.println("Этот вес нас совсем не устраиваает...");
        }
    }

    public void makePie(){
        view.drawPie(kitchen.getDough(), kitchen.getFilling(), kitchen.getDecoration(), kitchen.getWeight());
    }
}