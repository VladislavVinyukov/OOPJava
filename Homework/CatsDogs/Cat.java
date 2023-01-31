package Homework.CatsDogs;

import javax.naming.Name;
import java.util.Date;

public class Cat extends Animals{
    String Name;
    String Breed;
    String Color;
    String Birthday;
    Integer Weight;

    public Cat(String name, String breed, String color, String birthday, int weight){

        this.Name = name;
        this.Breed= breed;
        this.Color = color;
        this.Birthday = birthday;
        this.Weight = weight;
    }

    @Override
    void Voice() {
        System.out.println("Meow-meow");
    }

    @Override
    void AskFood() {
        Voice();
    }
}

