package org.java;

import java.util.Scanner;

import static java.lang.System.out;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class NegativeAgeException extends RuntimeException {
    public NegativeAgeException(String message) {
        super(message);
    }
}
public class CustomException {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        out.print("Enter age:");
        var age = s.nextInt();
        try{
            validateAge(age);
        }
        catch(InvalidAgeException ex){
            out.println("Caught the exception, inside catch block:: "+ex.getMessage());
        } catch (NegativeAgeException e) {
            out.println("Caught the exception, inside catch block::"+e.getMessage());
        }
        //ex.getLocalizedMessage() or ex.getMessage() - Caught the exception, inside catch block of age is not valid to vote
        //ex - Caught the exception, inside catch block of org.example.InvalidAgeException: age is not valid to vote
    }

    static void validateAge(float age) throws InvalidAgeException, NegativeAgeException {
        if(age>0 && age<18)
            throw new InvalidAgeException("age is not valid to vote");
        else if(age<0)
            throw new NegativeAgeException("Age is below zero");
        else
            out.println("Welcome to vote");
    }
}
