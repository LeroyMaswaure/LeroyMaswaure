package com.company;
import java.util.*;

public class Week7Lab3 {



        public static int a;
        public static int b;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner console = new Scanner(System.in);

        System.out.print("What height of pyramid you want? \n");
        int a = console.nextInt();
        System.out.print("\n The height of pyramid you want is " + a + ".");
        console.nextLine();

        System.out.print("\n What character do you want? \n");
        String b = console.nextLine();
        System.out.println("\n The character you chose is " + b);

        pyramid(a,b);
        console.close();

    }

    public static void pyramid(int a , String b) {

        for(int i=0;i<a;i++) {
            for(int j=0;j<a-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print(b);
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}



