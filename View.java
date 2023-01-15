public class View {
    public static void view(human a, int n) {
        String line  = "_".repeat(n);
        System.out.println(line + a.name);

        String gen = (a.gender.equalsIgnoreCase("man")? "hi":"she");
        String gen2 = (a.gender.equalsIgnoreCase("man")? "him":"her");
        System.out.print(a.married.equalsIgnoreCase("yes")? gen +" is married, " +
                gen2 + " spouse: "+ a.spouse: "no married ");
        System.out.println(a.hasChildren.equalsIgnoreCase("yes")? " "+ gen +" has Children" :" "+
                gen2+ " not Children ");
        for (human i : a.getFamily()){
            view(i, n++);
        }
    }
}
