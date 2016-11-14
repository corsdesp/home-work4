package com.epam.training.app;

import java.util.Date;

public class Person {
    private String name;
    private Date birthday;
    private int passport;

    public Person(String name, Date birthday, int passport) {
        this.name = name;
        this.birthday = birthday;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (passport != person.passport) return false;
        if (!name.equals(person.name)) return false;
        return birthday.equals(person.birthday);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + passport;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", passport=" + passport +
                '}';
    }
}
