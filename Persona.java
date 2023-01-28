import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persona extends Human{
    //public String FullName;
    public PetList persPet;

    public Persona(String Name, String Gender, int Age, String PersPet){
        SetName(Name);
        SetGender(Gender);
        SetAge(Age);
        this.persPet = new PetList(PersPet);
    }

    ArrayList <Persona> listName = new ArrayList<>();

    public void AddName(Persona persona){
        listName.add(persona);
    }

    public ArrayList<Persona> getListName(){
        return listName;
    }



}

