package it.develhope.ifStatement3;


import java.util.Random;

public class Student extends Random {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void guessingAge(){
        Random num = new Random();
        int guessingAge = num.nextInt(35);
        System.out.println("I generated the random number " + guessingAge + " for student " + this.name);
        if(guessingAge == age){
            System.out.println("Random number is equal: " + guessingAge);
        }else if(guessingAge < age){
            System.out.println("Random number in lower: " + guessingAge);
        }else{
            System.out.println("Random number is greater: " + guessingAge);
        }
    }
}
