public class Main {
    public static void main(String[] args) {
        Human Mother = new Human("James");
        Human Son = new Human("John");
        Human Daughter = new Human("Ronert");
        Human Grandson = new Human("Mary");
        Human Grandson_2 = new Human("Linda");
        Human Granddauter = new Human("Stefen");
        Human Granddauter_2 = new Human("Karen");
        Human Grandgranddauter = new Human("Mark");
        Mother.addName(Son);
        Mother.addName(Daughter);
        Son.addName(Grandson);
        Son.addName(Granddauter);
        Daughter.addName(Granddauter_2);
        Daughter.addName(Grandson_2);
        Granddauter_2.addName(Grandgranddauter);
        Family.treeView(Mother,0);

    }
}