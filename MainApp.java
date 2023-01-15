public class MainApp {
    public static void main(String[] args) {
        human Tom = new human("Tom", "Julia", "Richard", "son", "no", "man" ,
                "no");
        human Julia = new human("Julia", "Sara", "Genrih", "daughter", "yes",
                "woman", "yes", "Richard");
        human Richard = new human("Richard", "Oliviya", "Garry", "son", "yes",
                "man", "yes", "Julia");
        human Rebeca = new human("Rebeca", "Julia", "Richard", "daughter",
                "no", "woman", "yes", "Piter");
        human Piter = new human("Piter", "Monica", "Jon", "son-in-law", "no",
                "man","yes", "Rebeca");

        System.out.println(Tom.getInfoHuman());
        System.out.println(Richard.getInfoHuman());
        System.out.println(Julia.getInfoHuman());
        System.out.println(Rebeca.getInfoHuman());
        System.out.println(Piter.getInfoHuman());
        Richard.addHuman(Julia);
        Richard.addHuman(Tom);
        Richard.addHuman(Rebeca);
        Rebeca.addHuman(Piter);
        View.view(Richard, 0);


    }


}
