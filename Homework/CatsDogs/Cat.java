package Homework.CatsDogs;

import javax.naming.Name;
import java.util.Date;

public class Cat extends Animals  {
    public Cat(String name, String breed, String color, String birthday, int weight){

        this.Name = name;
        this.Breed= breed;
        this.Color = color;
        this.Birthday = birthday;
        this.Weight = weight;
    }
    @Override
    void Voice() {
        System.out.println("Tom 'Meow-meow'");
    }
    @Override
    void AskFood() {
        Voice();
    }
}

