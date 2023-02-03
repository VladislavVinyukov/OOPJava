public class Family {
    public static void treeView(Human root, int b) {
        String line = "   ".repeat(b);
        if (b==1){
            line += "[children] ";
        } else if(b >= 2) {
            line += "["+"great- ".repeat(b-2)+"grandson] ";
        }
        line += root.FullName;
        if (root.listName.size()!=0){
            System.out.println(line);
            System.out.println(" ".repeat(line.length()) + "|");
        } else {
            System.out.println(line );
        }
        for (Human a : root.getListName()) {
            treeView(a, b+1);
            if (!a.equals(root.getListName().get(root.getListName().size()-1))){
                System.out.println(" ".repeat(line.length()) + "|");
            }
        }
    }

}