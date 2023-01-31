package Homework.CatsDogs;

public class Dog extends Animals{

    String Name;
    String Breed;
    String Color;
    String Birthday;
    Integer Weight;
    public Dog(String name, String breed, String color, String birthday, int weight) {

        this.Name = name;
        this.Breed = breed;
        this.Color = color;
        this.Birthday = birthday;
        this.Weight = weight;
    }
    @Override
    void Voice() {
        System.out.println("gav-gav");
    }
    @Override
    void AskFood() {
        Voice();
    }
}
