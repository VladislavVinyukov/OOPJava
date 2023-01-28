public class Main {
    public static void main(String[] args){
        Persona Mother = new Persona("Mary", "W", 65, "mom's pet");
        Persona Father = new Persona("John", "M", 67, "daddy's pet");
        Persona Son = new Persona("Peter","M", 45, "son's pet");
        Persona Daughter = new Persona("Lisa", "W", 43, "daughter's pet");
        Persona Son_2 = new Persona("Mike","M", 35, "son's_2 pet");
        Persona Grandson = new Persona("Tom", "M", 23, "grandson's pet");
        Persona Grandson_2 = new Persona("Ben", "M", 10, "grandson's_2 pet");
        Persona Granddaughter = new Persona("Lili", "W", 3, "granddaughter's pet");
        Father.persPet.AddPet("dog", "not", "M", "Miki", 5);
        Son.persPet.AddPet("cat", "not", "W", "Mi", 2);
        Grandson.persPet.AddPet("dog", "taksa", "M", "Wolf", 8);
        Granddaughter.persPet.AddPet("hamster", "not", "W", "Mimi", 1);
        Grandson_2.persPet.AddPet("ferret", "not", "W", "Lima", 1);
        Father.AddName(Mother);
        Mother.AddName(Son_2);
        Mother.AddName(Son);
        Mother.AddName(Daughter);
        Daughter.AddName(Grandson);
        Son.AddName(Grandson_2);
        Grandson.AddName(Granddaughter);
        FamilyTree.treeView(Father, 0);
        FamilyTree.petView(Father);


    }
}
