package com.epam.training.app;

import java.util.Comparator;

public class PassportPersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        if (first.getPassport() > second.getPassport()) {
            return 1;
        } else if (first.getPassport() < second.getPassport()) {
            return -1;
        }
        return 0;
    }
}
