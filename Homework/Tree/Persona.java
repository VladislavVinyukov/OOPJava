//package Homework.Tree;
//
//import java.util.ArrayList;
//
//public class Persona {
//    enum enumSex {male, female}
//
//    public String FullName;
//    public int Age;
//
//    public enumSex Sex;
//
//    public ArrayList<Persona> Spouses;
//
//    public ArrayList<Persona> Children;
//    public ArrayList<Persona> Parents;
//
//
//    public Persona(String Name, int age, Persona mam, Persona fath, enumSex sex) {
//        this.FullName = Name;
//        this.Age = age;
//        this.Sex = sex;
//        this.Parents = new ArrayList<>();
//        this.Children = new ArrayList<>();
//        this.Spouses = new ArrayList<>();
//        if (mam != null) {
//            this.Parents.add(mam);
//            mam.Produce(this);
//        }
//        if (fath != null) {
//            this.Parents.add(fath);
//            fath.Produce(this);
//        }
//    }
//
//    //    add child to parent
//    public void Produce(Persona child) {
//        this.Children.add(child);
//
//    }
//
//    //    add spouse to Persona
//    public void Marry(Persona spouse) {
//        this.Spouses.add(spouse);
//    }
//
//
//}
