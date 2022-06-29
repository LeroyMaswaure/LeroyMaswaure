package com.company;
import java.io.*;
import java.util.Scanner;

public class Week8Lab1 {


    public static class Week8Assgn1 {

        //read file
        public static void readFile(){
            try {
                System.out.println("----- The inside of the file -----");
                File f = new File("Assgn8.txt");
                Scanner myReader = new Scanner(f);
                while(myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            //back to start menu
            startMenu();

        }

        //write text on sample.txt
        public static void writeFile(){
            Scanner sn = new Scanner(System.in);
            System.out.println("----- Type what you want to add -----");
            String letters = sn.nextLine();
            try {
                FileWriter writer = new FileWriter("Akeef.txt", true);
                writer.write(letters + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //back to start menu
            startMenu();
        }


        public static void startMenu(){
            Scanner sn = new Scanner(System.in);

            System.out.println("----- Start menu -----");

            //menus
            String[] menus = {
                    //#0
                    "Read sample.txt",
                    //#1
                    "Write text on sample.text",
                    //#2
                    "Exit"
            };

            //print menus
            for(int i = 0; i < menus.length; i++){
                System.out.println(i + "." + menus[i]);
            }

            //user input
            System.out.print("Please enter index number: ");
            int decision = sn.nextInt();

            //when user select one of the number, call those methods
            switch(decision){
                case 0:
                    readFile();
                    break;
                case 1:
                    writeFile();
                    break;
                case 2:
                    System.out.println("The program stopped");
                    break;
                default:
                    System.out.println("Invalid number");

            }

        }


        public static void main(String[] args) {
            //call method to start menu
            startMenu();
        }

    }

}
