import java.util.ArrayList;

public class Member {
    public String FullName;
    public Member(String Name){
        this.FullName=Name;
    }
    ArrayList <Member> listName = new ArrayList<>();
    public void addName(Member persona) {
        listName.add(persona);
    }
    public ArrayList<Member> getListName() {
        return listName;
    }
}