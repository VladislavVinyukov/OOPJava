//package Homework.Tree;
//
//import java.util.HashMap;
//
//public class viewTree {
//   // ArrayList<Persona> listName = new ArrayList<>();
//
//
//    public static void  view(Persona root, int countFamily){
//        if (countFamily <0){
//            return;
//        }
//
//        HashMap<Integer,String> FamilyConnect = new HashMap<>();
//        FamilyConnect.put(0,"");
//        FamilyConnect.put(1,"child");
//        FamilyConnect.put(2,"grandchildren");
//        FamilyConnect.put(3,"great-grandchildren");
//        String line = "__".repeat(countFamily);
//        System.out.println(line + root.FullName+ "  "+root.Age + " " + FamilyConnect.get(countFamily));
//
//        for (Persona i: root.Children) {
//            view(i,countFamily+1);
//
//
//        }
//
//    }
//
//
//}
