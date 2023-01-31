package Homework.CatsDogs;

import java.time.LocalDate;
import java.util.ArrayList;


public class Persona {

     String FullName;
    public TGender Gender;
    String FamilyStatus;
    LocalDate DateB;
    Integer Age;

    enum TGender  {male, female};

    Boolean AtHome;


public Persona(String Name, TGender gender, String familyStatus, LocalDate dateb, Boolean atHome){//

    this.FullName = Name;
    this.Gender = gender;
    this.FamilyStatus = familyStatus;
    this.DateB = dateb;
    this.AtHome = atHome;




}


    ArrayList<Persona> personaArrayList = new ArrayList<>();
    public Persona addToList(ArrayList<Persona> personaArrayList) {
        personaArrayList.add(this);
        return this;

    }
    }


