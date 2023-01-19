public class Main {
    public static void main(String[] args) {
        Member Mother = new Member("Петрова Ольга Викторовна");
        Member Son = new Member("Петров Николай Иванович");
        Member Daughter = new Member("Смирнова Елена Ивановна");
        Member Grandson = new Member("Петров Никита Николаевич");
        Member Grandson_2 = new Member("Смирнов Максим Дмитриевич");
        Member Granddauter = new Member("Петрова Вера Николаевна");
        Member Granddauter_2 = new Member("Иванова Марина Дмитриевна");
        Member Grandgranddauter = new Member("Иванова Кристина Сергеевна");
        Mother.addName(Son);
        Mother.addName(Daughter);
        Son.addName(Grandson);
        Son.addName(Granddauter);
        Daughter.addName(Granddauter_2);
        Daughter.addName(Grandson_2);
        Granddauter_2.addName(Grandgranddauter);
        FamilyTies.treeView(Mother,0);

    }
}
