package com.company;
import java.util.Scanner;

public class LabTest1  {
    public static void main(String[] args) {
        String symbol = null;
        String mychar = null;
        System.out.print("Enter the character :");
        Scanner input = null;
        assert false;
        input.next().charAt(0);
        System.out.print("Enter number of "+ symbol + " :");
        int level =  input.nextInt();
        for(int i=1; i<=level; i++) {
            for(int j=1; j<=level-i; j++) {
                System.out.print(" ");
            }

            System.out.println(mychar+ " ");
        }
    }
}

/////code has one error tried to debug but failed







