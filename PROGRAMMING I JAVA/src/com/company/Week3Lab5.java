package com.company;

import java.util.Scanner;

public class Week3Lab5 {

    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        System.out.print("Enter Number 1:");
        int num1 = info.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = info.nextInt();
        double avg = ((double)num1+num2)/2;
        System.out.println("========================================");
        System.out.println("Your first number is " + num1);
        System.out.println("Your second number is " + num2);
        System.out.println("========================================");
        System.out.println("Sum is " + (num1+num2));
        System.out.println("Average is " + avg);
        System.out.println("========================================");
        if (num1 <= num2) {
            System.out.println("Number 1 is more than number 2.");
        }
        else {
            System.out.println("Number 2 is more than number 1.");
        }
    }
}
