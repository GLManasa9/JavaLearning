package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ComparatorExample {
    public static void main(String[] args) {
        /* Understand usage of vars feature */
        var Roland = new NPerson("Ronald", "Deschain",90);
        var Susan = new NPerson("Susan", "Delgado",23);
        var Eddie = new NPerson("Eddie", "Dean",35);
        var Detta = new NPerson("Detta", "Walker",21);
        var Jake = new NPerson("Jake", "Chambers",56);
        var personList = List.of(Roland, Susan, Eddie, Detta, Jake).stream().collect(Collectors.toList());
        Collections.sort(personList,new AgeComparator());
        personList.stream().forEach(out::println);
        out.println("==================================");
        Collections.sort(personList,new NameComparator());
        personList.stream().forEach(out::println);
    }
}

class NPerson {
    String fName;
    String lName;
    int age;
    public String getfName() {
        return fName;
    }

    public int getAge() {
        return age;
    }

    public NPerson(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fName + '\'' +
                ", lname='" + lName + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<NPerson> {

    @Override
    public int compare(NPerson s1, NPerson s2) {
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<NPerson> {

    @Override
    public int compare(NPerson o1, NPerson o2) {
        return o1.fName.compareTo(o2.fName);
    }
}