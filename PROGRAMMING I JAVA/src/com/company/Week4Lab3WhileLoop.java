package com.company;

import java.util.Scanner;

public class Week4Lab3WhileLoop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String evenOdd;
        //while loop
        int count = 0;
        while(count<3);{
            System.out.println("Please Enter an Integer");
            int input = console.nextInt();
            if(input % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }


    }


}


