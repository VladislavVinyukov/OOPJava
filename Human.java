import java.util.ArrayList;

public class Human {
    public String FullName;
    public Human(String Name){
        this.FullName=Name;
    }
    ArrayList <Human> listName = new ArrayList<>();
    public void addName(Human persona) {
        listName.add(persona);
    }
    public ArrayList<Human> getListName() {
        return listName;
    }
}