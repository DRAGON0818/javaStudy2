package com.dlx.chapter06.thisLambda;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String name;
    private String middleName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", laseName='" + lastName + '\'' +
                ", age = "+age +'\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String laseName) {
        this.lastName = laseName;
    }

    public Person(String name, String middleName, String laseName,int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = laseName;
        this.age=age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;}

    public Person(){}

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
