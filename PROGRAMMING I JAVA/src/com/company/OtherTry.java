package com.company;
import java.io.*;
import java.util.Scanner;



public class OtherTry {

    public static void main(String[] args) {
        File file = new File("stu.txt");
        FileOutputStream fileOutputStream = null;
        PrintStream printStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            printStream = new PrintStream(fileOutputStream);

            String name;
            int id, attendance, assignments, projects, midterm, finalexam;

            Scanner SC = new Scanner(System.in);

            System.out.println("---------My student grading program------------");

            System.out.println("Enter Student Name and Surname: ");
            name = SC.nextLine();
            System.out.print("Enter Student ID Number: ");
            id = SC.nextInt();
            System.out.println("Enter Attendance Percentage /100:");
            attendance = SC.nextInt();
            System.out.println("Enter Assignments Percentage /100:");
            assignments = SC.nextInt();
            System.out.println("Enter Projects Percentage /100:");
            projects = SC.nextInt();
            System.out.println("Enter Midterm Percentage /100:");
            midterm = SC.nextInt();
            System.out.println("Enter Final exam Percentage /100:");
            finalexam = SC.nextInt();

/////calculation
            int total = (int) ((attendance * .10) + (assignments * .20) + (projects * .15) + (midterm * .25) + (finalexam * .30));
            double perc = (double) total / 100 * 100;
            printStream.println("STUDENTS");
            printStream.println("NAME:" + name + " ID NUMBER:" + id + "Subject" + " TOTAL:" + total + " PERCENTAGE:" + perc);

///////Grade Calculation and print stream
            if (perc >= 90) {
                System.out.println("\n Grade A");
                printStream.println("\n Grade A");
            } else if (perc >= 80) {

                System.out.println("\n Grade B");
                printStream.println("\n Grade B");
            } else if (perc >= 70) {
                System.out.println("\n Grade C");
                printStream.println("\n Grade C");
            } else if (perc >= 60) {
                System.out.println("\n Grade D");
                printStream.println("\n Grade D");
            } else if (perc >= 40) {
                System.out.println("\n Grade E");
                printStream.println("\n Grade E");
            } else {
                System.out.println("\n Fail");
                printStream.println("\n Fail");
            }
            File L = new File("/Users/leroymaswaure/Documents/SCHOOL/ITE221/stu.txt");
            read(L);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (printStream != null) {
                    printStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();


            }
        }
    }
    static void read(File file) throws FileNotFoundException {
        System.out.println("name  id  attendance  Assignments  Midterm  Final");
        System.out.println("--------------------------------");

        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            System.out.println(read.nextLine());
            System.out.println("--------------------------------");


        }
    }
}




