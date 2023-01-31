package Homework.CatsDogs;

import java.util.ArrayList;

public class Family {

    public void  sortFamily(){
        ArrayList<Persona> personaArrayList = new ArrayList<>();

    }
    ArrayList<Persona> members = new ArrayList<>();

    public void FeedPets(Cat pet){ // усли класс анимал то иня нулл
        for (Persona i:members) {
            if (i.AtHome){
                System.out.println(i.FullName +" " + "feed"+ " " + pet.Name);
                return;
            }
        };
    }
}
