package Zadacha;


import java.util.ArrayList;

public class Persona{
    private String Fullname;
    public Persona (String Name){
        this.Fullname = Name;
    }
    ArrayList<Persona> ListName = new ArrayList<>();

    public void addName(Persona persona){
        ListName.add(persona);
    }
    public String getName(){
        return Fullname;
    }

    public ArrayList<Persona> getListName() {
        return ListName;
    }
}
