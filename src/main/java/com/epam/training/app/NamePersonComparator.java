package com.epam.training.app;

import java.util.Comparator;

public class NamePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getName().compareTo(second.getName());
    }
}
