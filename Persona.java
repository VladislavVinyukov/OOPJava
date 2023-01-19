import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persona {
    public String FullName;

    public Persona(String Name){
        this.FullName=Name;
    }

    ArrayList <Persona> listName = new ArrayList<>();

    public void AddName(Persona persona){
        listName.add(persona);
    }

    public ArrayList<Persona> getListName(){
        return listName;
    }
}

