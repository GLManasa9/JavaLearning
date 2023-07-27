package org.java;

import java.util.List;
import java.util.stream.Collectors;

public class VarClass {
    public static void main(String[] args) {
        /* Understand usage of vars feature */
        var Roland = new Person("Ronald", "Deschain");
        var Susan = new Person("Susan", "Delgado");
        var Eddie = new Person("Eddie", "Dean");
        var Detta = new Person("Detta", "Walker");
        var Jake = new Person("Jake", "Chambers");

        //this returns list of person based on filter applied, will have data of both fname and lname
        var filteredPersons =
                List.of(Roland, Susan, Eddie, Detta, Jake).stream().filter(x->x.getFname().contains("Jake"))
                        .collect(Collectors.toList());

        filteredPersons.stream().map(Person::getLname).forEach(System.out::println);

        System.out.println("=====================================");

        //this returns list of first names based on filter applied
        var filteredFirstNames =
                List.of(Roland, Susan, Eddie, Detta, Jake).stream().map(x->x.fname).filter(name->name.startsWith("J"))
                        .collect(Collectors.toList());

        filteredFirstNames.forEach(System.out::println);

        System.out.println("=====================================");

        /* Understand usage of method reference */
        Car tiago = new Car("5000");
        Car honda = new Car("15000");

        var Cars = List.of(tiago,honda).stream().map(Car::getKms).collect(Collectors.toList());
        Cars.forEach(System.out::println);

        System.out.println("=====================================");

        // this returns first names based on map using method reference
        filteredFirstNames = List.of(Roland, Susan, Eddie, Detta, Jake).stream().map(Person::getFname).collect(Collectors.toList());
        filteredFirstNames.forEach(System.out::println);

        System.out.println("=====================================");

        // this returns first names based on map using method reference
        var appendNames = List.of(Roland, Susan, Eddie, Detta, Jake).stream().map(Person::appendFnameLname).collect(Collectors.toList());
        appendNames.forEach(System.out::println);
    }
}

class Person {
    String fname;
    String lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public String appendFnameLname() {
        return fname+"-"+lname;
    }
}

class Car {
    String kms;
    public Car(String kms){
        this.kms = kms;
    }
    public String getKms() {
        return kms;
    }

}