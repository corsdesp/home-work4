package com.epam.training.app;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Webby", new GregorianCalendar(1986, 1, 20).getTime(), 55555),
                new Person("Huey", new GregorianCalendar(1986, 1, 20).getTime(), 22222),
                new Person("Dewey", new GregorianCalendar(1987, 1, 20).getTime(), 33333),
                new Person("Scrooge", new GregorianCalendar(1950, 1, 20).getTime(), 99999),
                new Person("Louie", new GregorianCalendar(1986, 1, 20).getTime(), 44444),
        };

        Arrays.sort(persons, new BirthdayPersonComparator().thenComparing(new PassportPersonComparator()));
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        Arrays.sort(persons, new NamePersonComparator());
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
