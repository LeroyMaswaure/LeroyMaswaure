package com.company;

import java.util.Scanner;

public class Week4Lab3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String evenOdd;
        //for loop
        for(int i = 0; i < 3; i++){
            System.out.println("Please Enter an Integer");
            int input = console.nextInt();
            if(input % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }


    }


}
