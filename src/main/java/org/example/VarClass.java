package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class VarClass {

    public static class Person {
        String fname;
        String lname;
        public Person(String fname, String lname){
            this.fname = fname;
            this.lname = lname;
        }
    }

        public static void main(String[] args) {
            var Roland = new Person("Ronald", "Deschain");
            var Susan = new Person("Susan", "Delgado");
            var Eddie = new Person("Eddie", "Dean");
            var Detta = new Person("Detta", "Walker");
            var Jake = new Person("Jake", "Chambers");

            //this returns list of person based on filter applied, will have data of both fname and lname
            var filteredPersons =
                    List.of(Roland, Susan, Eddie, Detta, Jake).stream().filter(x -> x.fname.contains("Jake"))
                            .collect(Collectors.toList());

            filteredPersons.stream().map(x->x.lname).forEach(System.out::println);

            //this returns list of first names based on filter applied
            var filteredFirstNames =
                    List.of(Roland, Susan, Eddie, Detta, Jake).stream().map(x->x.fname).filter(name->name.startsWith("J"))
                            .collect(Collectors.toList());

            filteredFirstNames.stream().forEach(System.out::println);
        }
}