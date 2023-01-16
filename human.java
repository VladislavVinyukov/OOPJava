import java.time.Year;
import java.util.ArrayList;

public class human {
    enum atHome {
        Yes, No

    }
    {
        atHome yes = atHome.Yes;

    }
    String name;
    String gender;
    String married;
    String mother;
    String father;
    String status;
    String hasChildren;
    String spouse;
    private atHome state;

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
    public void spousetAtHome(){
        if(this.state == atHome.No ){
            System.out.println("the spouse is not at home");
            this.childrenAtHome();
        }
        else {
            System.out.println("children take out Trash");
            this.childrenAtHome();
            this.toDo();
            this.comeHome();
            this.finisht();
            return;
        }
    }

    public void childrenAtHome(){
        if(this.state == atHome.No ){
            System.out.println("the children is not at home");
            System.out.println("Okay then I'll");
            this.myself();
            this.comeHome();
            this.finisht();

        }
        else {
            System.out.println("yes Mom im, getting dressed");
            this.toDo();
            this.comeHome();
            this.finisht();
            return;
        }
    }
    public void myself(){
        toDo();
        comeHome();
        finisht();
    }

    public void takeOutTrash(){
        System.out.println("Need take out of Trash");
        this.spousetAtHome();
    }
    public void toDo(){
        this.gettingDressed();
        this.leaveHome();
        this.gone();

    }
    public void gettingDressed(){
        System.out.println("I'm getting dressed already");
    }
    public void leaveWork (){
        System.out.println("Darling, I am leave at work");
        this.toDo();
    }
    public void leaveSchool(){
        System.out.println("Mom, I am leave at school");
        this.toDo();
    }
    public void leaveHome(){
        System.out.println("I'm leaving home");
        this.state = atHome.No;
    }
    public void comeHome(){
        System.out.println("I came home");
        this.state = atHome.Yes;
    }
    public void gone(){

        System.out.println( "is gone ");
    }
    public void finisht(){
        System.out.println("I threw out the trash");
        return;
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

