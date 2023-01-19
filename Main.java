public class Main {
    public static void main(String[] args){
        Persona Mother = new Persona("Mary");
        Persona Father = new Persona("John");
        Persona Son = new Persona("Peter");
        Persona Daughter = new Persona("Lisa");
        Persona Son_2 = new Persona("Mike");
        Persona Grandson = new Persona("Tom");
        Persona Grandson_2 = new Persona("Ben");
        Persona Granddaughter = new Persona("Lili");
        Persona Grandgrandson = new Persona("Alex");
        Father.AddName(Mother);
        Mother.AddName(Son_2);
        Mother.AddName(Son);
        Mother.AddName(Daughter);
        Daughter.AddName(Grandson);
        Son.AddName(Grandson_2);
        Grandson.AddName(Granddaughter);
        Granddaughter.AddName(Grandgrandson);
        FamilyTree.treeView(Father, 0);

    }
}
