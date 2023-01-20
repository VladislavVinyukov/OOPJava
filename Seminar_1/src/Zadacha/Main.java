package Zadacha;

public class Main {
    public static void main(String [] args){
    Persona father = new Persona("John");
    Persona son = new Persona("Davad");
    Persona sister = new Persona("Marta");
    Persona granddaughter = new Persona("Lena");
    Persona vnuk = new Persona("Garik");

    father.addName(son);
    father.addName(sister);
    sister.addName(granddaughter);
    son.addName(vnuk);

    Tree.view(father, 0);
    }
}
