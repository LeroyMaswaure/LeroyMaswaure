package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Week4Lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        out.println("Enter a number");
        int user = input.nextInt();

        String rating = "";
        switch (user){
            case 5:
                rating = "Very Bad";
                break;
            case 4:
                rating = "Bad";
            case  3:
                rating = "Normal";
                break;
            case 2:
                rating = "Good";
            case 1:
                rating = "Very Good";
                break;
            default:
                rating = "Invalid";


        }
        System.out.println(rating);

    }

}
