package Zadacha;

public class Tree {
    public static void view(Persona root, int num){
        String Line = "_".repeat(num);
        System.out.println(Line + root.getName());
        for (Persona a: root.ListName){
            view(a, num + 1);
        }
    }
}
