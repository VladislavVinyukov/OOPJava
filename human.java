import java.util.ArrayList;

public class human {
    String name;
    String gender;
    String married;
    String mother;
    String father;
    String status;
    String hasChildren;
    String spouse;

    public human(String name, String mother, String father, String status, String hasChildren, String gender,
                 String married){
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.status = status;
        this.hasChildren = hasChildren;
        this.gender = gender;
        this.married = married;

    }
    public human(String name, String mother, String father, String status, String hasChildren, String gender,
                 String married, String spouse){
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.status = status;
        this.hasChildren = hasChildren;
        this.gender = gender;
        this.married = married;
        this.spouse = spouse;

    }

    public String getInfoHuman() {
        //String newStatus ;
        String info = null;
        String gen = (gender.equalsIgnoreCase("man")? "hi":"she");
        String gen2 = (gender.equalsIgnoreCase("man")? "him":"her");
        String fatherStatus = (hasChildren.equalsIgnoreCase("yes")&&
                gender.equalsIgnoreCase("man")?status+" and father" : status);
        String motherStatus = (hasChildren.equalsIgnoreCase("yes")&&
                gender.equalsIgnoreCase("woman")?status+" and mother" : status);

        if(hasChildren.equalsIgnoreCase("yes")&& gender.equalsIgnoreCase("man")) {
            //newStatus = "son and father";
            info = "Meet me, this is: " + name + ", " + gen + " is: " + fatherStatus +
                    ", "+gen2+" mother: " + mother + " and father: "+ father;
        }
        if(hasChildren.equalsIgnoreCase("yes")&& gender.equalsIgnoreCase("woman")) {
           //newStatus = "daughter and mother";
            info = "Meet me, this is: " + name + ", " + gen + " is: " + motherStatus +
                    ", "+gen2+" mother: " + mother + " and father: " + father;
        }
        if (hasChildren.equalsIgnoreCase("no")) {
            info = "Meet me, this is: " + name + ", " + gen + " is: " + status +
                    ", " + gen2 + " mother: " + mother + " and father: " + father;
        }
        String s = ", "+ gen + " is married, " + gen2 + " spouse: " + spouse;
        info = (married.equalsIgnoreCase("yes")? info + s: info);
        return info;

    }

    public String getSpouse() {
        return spouse;
    }

    public String getName() {
        return name;
    }

    public String getMarried() {
        return married;
    }

    public String getFather() {
        return father;
    }
    ArrayList<human> family = new ArrayList<>();
    public void addHuman(human Name){
        family.add(Name);

    }

    public ArrayList <human> getFamily(){
        return family;
    }
}

