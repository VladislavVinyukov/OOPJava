package Homework.CatsDogs;

//Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
//        Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому,
//        чтобы продумать логику взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)
//        Подумать как описать логику взаимодействия человека и домашнего питомца.
//        Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. Какое ещё взаимодействие может быть?


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static Homework.CatsDogs.Persona.TGender.female;
import static Homework.CatsDogs.Persona.TGender.male;

public class Main {
    public static void main(String[] args) {
        Family Smith = new Family();
        Smith.members.add(new Persona("Ilon",
                male,
                "father",
                LocalDate.of(1979,5,16),false));

        Smith.members.add(new Persona("Ada",
                female,
                "mother",
                LocalDate.of(1980,10,30),
                true));
        Smith.members.add(new Persona("Vitalik",
                male,
                "son",
                LocalDate.of(2006,6,23),
                false));
        Smith.members.add(new Persona("Wendy",
                female,
                "doughter",
                LocalDate.of(2009,12,12),
                true));//, 2009-12-12);

        Cat Tom = new Cat("Tom","Siam","Red","22.06.2020", 12);
        Tom.AskFood();
        Smith.FeedPets(Tom);
        Dog Spike = new Dog("Spike","Bulldog","white","22/12/2018",18);
        Spike.AskWalk();

        rabbit Roger = new rabbit("Roger","rabbit","red-white","12.11.2020",13);
        Smith.WalkPets(Spike);

    }
}