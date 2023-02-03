package Homework.CatsDogs;

public class Dog extends Animals implements Animals.AskWalkPet{
    public Dog(String name, String breed, String color, String birthday, int weight) {

        this.Name = name;
        this.Breed = breed;
        this.Color = color;
        this.Birthday = birthday;
        this.Weight = weight;
    }
    @Override
    void Voice() {
        System.out.println("Spike 'gav-gav'");
    }
    @Override
    void AskFood() {
        Voice();
    }

    @Override
    public void AskWalk() {
        Voice();
        System.out.println("Spike машет хвостом");
    }
}
