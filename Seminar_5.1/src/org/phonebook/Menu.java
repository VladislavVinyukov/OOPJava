package org.phonebook;

import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Display the directory");
        System.out.println("2 - Upload data");
        System.out.println("3 - Upload data");
        System.out.println(". ".repeat(15)+".");
        System.out.print("Select an action: ");
        int input = in.nextInt();

        org.phonebook.Filemanager run = new org.phonebook.Filemanager();
        org.phonebook.Addressbook phones = new org.phonebook.Addressbook();
        phones.Addressbook();

        switch (input) {
            case 1:
                phones.showAddressBook();
                break;
            case 2:
                phones.Addressbook();
                run.fileExport(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                phones.Addressbook();
                run.fileImport(phones.pb);
                phones.showAddressBook();
                break;
        }
    }
}
