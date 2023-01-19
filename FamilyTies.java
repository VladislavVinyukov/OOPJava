public class FamilyTies {
    public static void treeView(Member root, int b) {
        String line = "   ".repeat(b);
        if (b==1){
            line += "[ребенок] ";
        } else if(b >= 2) {
            line += "["+"пра- ".repeat(b-2)+"внук] ";
        }
        line += root.FullName;
        if (root.listName.size()!=0){
            System.out.println(line);
            System.out.println(" ".repeat(line.length()) + "|");
        } else {
            System.out.println(line );
        }
        for (Member a : root.getListName()) {
            treeView(a, b+1);
            if (!a.equals(root.getListName().get(root.getListName().size()-1))){
                System.out.println(" ".repeat(line.length()) + "|");
            }
        }
    }

}
