package com.company;

import java.util.Scanner;

public class Week3Assgn3 {


    public static void main(String[] args) {
        int price1;
        String name1;
        int price2;
        String name2;
        int pay;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of the item1: ");
        name1 = input.next();
        System.out.print("Enter the price of item1: ");
        price1 = input.nextInt();
        System.out.print("Enter name of item2: ");
        name2 = input.next();
        System.out.print("Enter the price of item2: ");
        price2 = input.nextInt();
        System.out.print("Enter amount you want to pay: ");
        pay = input.nextInt();
        if ((price1 + price2) <= pay)
            System.out.println("Your change is "+ (pay - (price1 + price2)));
        else
            System.out.println("Not Enough Money!");



    }
}
