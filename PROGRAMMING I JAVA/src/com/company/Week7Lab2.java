package com.company;

import java.util.*;

public class Week7Lab2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        // list of variables
        int sum = 0;
        int avg;
        int min;
        int max;
        int number;

        System.out.print("How long is your number?  \nMy total number is ");
        number = input.nextInt();
        int[] array = new int [number];

        for(int i = 0; i < number; i++) {
            System.out.print("Input number "+(i+1) + ": ");
            array[i] = input.nextInt();
            sum += array[i];
        }

        Arrays.sort(array);
        min = array[0];
        max = array[number - 1];
        avg = sum/(number);


        System.out.println("The minimun number is: "+ min);
        System.out.println("The maximun number is: "+ max);
        System.out.println("The average number is: "+ avg);

        input.close();
    }

}


