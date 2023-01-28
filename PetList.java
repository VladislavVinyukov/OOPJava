import java.util.ArrayList;
class PetsList{
    public String pKind;
   public String pBreed;
   public String pGender;
   public String pName;
   public int pAge;
}
public class PetList extends Pet {
    public String PetName;

    public PetList(String petName){
        this.PetName = petName;
    }

    ArrayList<PetsList> listPet = new ArrayList<>();
    public void AddPet(String kind, String breed, String gender, String name, int age){
        PetsList pl = new PetsList();
        SetKind(kind);
        SetBreed(breed);
        SetGender(gender);
        SetName(name);
        SetAge(age);
        pl.pKind = GetKind();
        pl.pBreed = GetBreed();
        pl.pGender = GetGender();
        pl.pName = GetName();
        pl.pAge = GetAge();
        listPet.add(pl);
    }

    public ArrayList<PetsList> getPetList(){
        return listPet;
    }

}
