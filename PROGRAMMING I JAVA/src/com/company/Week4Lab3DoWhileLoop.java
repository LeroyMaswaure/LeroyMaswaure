package com.company;

import java.util.Scanner;

public class Week4Lab3DoWhileLoop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a;
        do {
            System.out.print("Please put in a number(type-1 to stop: ");
            a = console.nextInt();

            if (a % 2 == 0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        }
        while (a!=-1);
        System.out.println("end");
    }
}