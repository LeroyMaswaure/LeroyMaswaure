package com.company;

import java.util.Scanner;

public class Week3Lab2 {

    public static void main(String[] args) {
	// write your code here
        float height, bmi;
        int weight;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height (meter):");
        height = input.nextFloat();
        System.out.print("Enter the weight (kg):");
        weight = input.nextInt();
        bmi = weight/(height*height);
        System.out.print("Current BMI :" + bmi);

    }
}
