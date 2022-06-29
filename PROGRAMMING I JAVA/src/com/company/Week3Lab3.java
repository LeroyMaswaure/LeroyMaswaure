package com.company;

import java.util.Scanner;

public class Week3Lab3 {

    public static void main(String[] args) {

        int num1;
        System.out.println("Input 1:");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        if ( num1 % 2 == 0 )
            System.out.println("Result 1 : even");
        else
            System.out.println("Result 1 :  odd");

        int num2;
        System.out.println("Input 2:");
        Scanner input1 = new Scanner(System.in);
        num2 = input1.nextInt();
        if ( num2 % 2 == 0 )
            System.out.println("Result 2 : even");
        else
            System.out.println("Result 2 : odd");

        int num3;
        System.out.println("Input 3:");
        Scanner input2 = new Scanner(System.in);
        num3 = input2.nextInt();
        if ( num3 % 2 == 0 )
            System.out.println("Result 3 : even");
        else
            System.out.println("Result 3 : odd");
    }
}


