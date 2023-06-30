package org.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ComparisonExample_2 {
    public static void main(String[] args) {
        /* Understand usage of vars feature */
        var Roland = new NPerson("Ronald", "Deschain",90);
        var Susan = new NPerson("Susan", "Delgado",23);
        var Eddie = new NPerson("Eddie", "Dean",35);
        var Detta = new NPerson("Detta", "Walker",21);
        var Jake = new NPerson("Jake", "Chambers",56);
        var personList = List.of(Roland, Susan, Eddie, Detta, Jake).stream().collect(Collectors.toList());
        //sorting elements on the basis of name
        Comparator<NPerson> cm1 = Comparator.comparing(NPerson::getfName);
        Collections.sort(personList,cm1);
        personList.stream().forEach(out::println);

        out.println("==================================");

        cm1 = Comparator.comparing(NPerson::getAge);
        Collections.sort(personList,cm1);
        personList.stream().forEach(out::println);
    }
}