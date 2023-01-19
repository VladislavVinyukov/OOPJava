public class FamilyTree {
    public static void treeView(Persona root, int num){
        String line = "  ".repeat(num);
        if (num==2){
            line += "[ребенок] ";
        } else if(num >= 3) {
            line += "["+"пра- ".repeat(num-2)+"внук] ";
        }
        line += root.FullName;
        if (root.listName.size()!=0){
            System.out.println(line);
            System.out.println(" ".repeat(line.length()) + "|");
        } else {
            System.out.println(line );
        }
        for (Persona a: root.getListName()){
            treeView(a, num+1);
            if (!a.equals(root.getListName().get(root.getListName().size()-1))){
                System.out.println(" ".repeat(line.length()) + "|");
            }
        }
    }
}
