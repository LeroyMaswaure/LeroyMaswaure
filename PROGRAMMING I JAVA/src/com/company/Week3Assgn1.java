package com.company;

import java.util.Scanner;

public class Week3Assgn1 {
    public static void main(String[] args) {
        // write your code here
        Scanner input=new Scanner (System.in);
        String Name, Location, Hobby, Food;
        int age;
        double gpa;
        System.out.println(" What is  your name?");
        Name=input.next();
        System.out.println("How old are you?");
        age=input.nextInt();
        System.out.println("Where are you from?");
        Location=input.next();
        System.out.println("What is your hobby?");
        Hobby=input.next();
        System.out.println("What is your favourite food?");
        Food=input.next();
        System.out.println("What is your current GPA?");
        gpa=input.nextDouble();
        System.out.print("My name is " + Name + " and i am " +age +  " Iam from " + Location + " my hobby is " + Hobby + " I love to eat " + Food + " My current GPA is " + gpa);


    }
}



