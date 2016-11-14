package com.epam.training.app;

import java.util.Comparator;

public class BirthdayPersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return second.getBirthday().compareTo(first.getBirthday());
    }
}
