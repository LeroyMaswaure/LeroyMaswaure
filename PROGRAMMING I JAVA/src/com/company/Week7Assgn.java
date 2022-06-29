package com.company;
import java.util.Scanner;

public class Week7Assgn {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] myFav={"iphone", "samsung", "sony", "htc", "google"	};
        for(int i=0;i<5;i++) {
            System.out.println(i+1+": " +myFav[i] + " ");
        }
        input(myFav);
        //changeArray(index,myFav);

    }
    public static void input(String[] myFav){
        Scanner console = new Scanner(System.in);
        System.out.println("Which number do you like to change: ");
        int  index=console.nextInt();
        console.nextLine();
        System.out.println("What do you want to put in place of " + myFav[index-1]);
        String newChange=console.nextLine();
        changeArray(index,myFav,newChange);
    }

    public static void changeArray(int index, String[] myFav,String newChange) {
        System.out.println("This is the new change: ");
        for(int i=0;i<5;i++) {
            if (i==index-1)
                System.out.println(index+ ": " + newChange);
            else
                System.out.println(i+1+": " +myFav[i] + " ");
        }



    }

}


