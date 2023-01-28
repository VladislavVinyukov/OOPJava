import java.util.ArrayList;

public abstract class Pet {
    private String Kind;
    private String Breed;
    private String Gender;
    private String Name;
    private int Age;

    public void SetKind(String kind) {
        this.Kind = kind;
    }

    public void SetBreed(String breed) {
        this.Breed = breed;
    }

    public void SetGender(String gender) {
        this.Gender = gender;
    }

    public void SetName(String name) {
        this.Name = name;
    }

    public void SetAge(int age) {
        this.Age = age;
    }

    public String GetKind() {
        return Kind;
    }

    public String GetBreed() {
        return Breed;
    }

    public String GetGender() {
        return Gender;
    }

    public String GetName() {
        return Name;
    }

    public int GetAge() {
        return Age;
    }
}
