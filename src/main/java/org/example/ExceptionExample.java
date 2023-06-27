package org.example;

import java.util.List;

public class ExceptionExample {

    public static class Person {
        String fName;
        String lName;
        int age;

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public Person(String fname, String lname, int age){
            this.fName = fname;
            this.lName = lname;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String appendFnameLname() {
            return fName +"-"+ lName;
        }
    }

    public static void main(String[] args) {
        var Roland = new Person("Ronald", "Deschain",32);
        var Susan = new Person("Susan", "Delgado",11);
        var Eddie = new Person("Eddie", "Dean",54);
        var Detta = new Person("Detta", "Walker",65);
        var Jake = new Person("Jake", "Chambers",10);

//        var ageMoreThanEighteen = List.of(Roland, Susan, Eddie, Detta, Jake).stream().filter(x->x.getAge()>17).collect(Collectors.toList());
//        ageMoreThanEighteen.stream().map(Person::getFname).forEach(System.out::println);

        for(Person p:List.of(Roland, Susan, Eddie, Detta, Jake)){
            if(p.age<18)
                throw new ArithmeticException("Age is less than 18 for "+p.fName);
            else
                System.out.println(p.fName +" is eligible");
        }

        int a=10;
        int b=2;
        if(b==0)
            throw new ArithmeticException("Divided by zero not possible");
        else
            System.out.println("a/b="+a/b);
    }
}
