package com.company;

import java.util.Scanner;

public class Week4Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        int percent =input.nextInt();
        System.out.println("Enter your grade");

        if (percent >= 90)
            grade = "A";
        else if (percent >= 80)
            grade = "B";
        else if (percent >= 70)
            grade = "C";
        else if (percent >= 60)
            grade = "D";
        else if (percent <= 50)
            grade = "F";
        else
            grade = "Invalid";

        System.out.print("Grade:" + grade);
    }
}









