package org.phonebook;

import java.util.ArrayList;


public class Addressbook {

    public ArrayList<org.phonebook.Phonebook> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new org.phonebook.Phonebook("Ivanov Ivan Ivanovich", "1234567890", "Moscov"));
        pb.add(new org.phonebook.Phonebook("Sidorov Sergey Sergeevich", "0987654321", "Piter"));
    }

    public void showAddressBook(){
        for(org.phonebook.Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}
