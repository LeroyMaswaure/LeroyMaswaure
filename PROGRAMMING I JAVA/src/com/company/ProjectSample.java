package com.company;

import java.io.*;
import java.util.*;

public class ProjectSample {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/com/programming/subjects.txt");

        Scanner in = new Scanner(System.in);
        int choice;
        double [] grade = {0, 0, 0, 0};
        do {
            System.out.println("Select the number of your choice (type -0 to quit):");
            System.out.println("1. Read sample.txt");
            System.out.println("2. Write sample.txt");
            System.out.println("3. Create a subject");
            System.out.println("4. Delete a subject");


            choice = in.nextInt();
            in.nextLine();
            if (choice == 3){
                String name;
                int numOfStudents;
                String[] Students= {"stu  stu  stu  stu  stu  stu"};
                int[] WorkWeights = {0, 0, 0, 0, 0};

                //Enter subject name
                System.out.println("Enter the subject name:");
                name = in.nextLine();

                /* checkExistingSubject(name);*/

                //Enter num of categories
                System.out.println("How many categories of grade you want?");
                numOfStudents = in.nextInt();
                in.nextLine();

                //Enter category name
                String[] students = new String[0];
                for(int i = 0; i < numOfStudents; i++){
                    System.out.println("Enter the name of the " + (i+1) + " category:");
                    students[i] = in.nextLine();
                    System.out.println("Enter the weight of this category:");
                    WorkWeights[i] = in.nextInt();
                    in.nextLine();
                }
                System.out.println("Name: " + name);
                System.out.println("Num Of Students: " + numOfStudents);
                for(int i = 0; i < Students.length; i++){
                    System.out.println("Category: " +  students[i]);
                    System.out.println("Weight: " + WorkWeights[i]);
                }

                createSubject(name, students, WorkWeights, f);
            }

            else if (choice == 4){
                String[] subjects;
                subjects = listSubject(f);
                System.out.println("Select the subject you would like to delete:");
                for(int i = 0; i < subjects.length; i++){
                    if (subjects[i] != null)
                        System.out.println((i + 1) + ". " + subjects[i]);

                }
                int deleteChoice = 0;
                deleteChoice = in.nextInt();
                in.nextLine();
                deleteSubject(subjects[deleteChoice-1]);
            }

//
//
//            if (choice == 1) {
//                File f = new File("src/com/programming/sample.txt");
//                read(f);
//            } else if (choice == 2) {
//                System.out.println("Specify the ID");
//                int ID = in.nextInt();
//                in.nextLine();
//                System.out.println("Specify the Name");
//                String name = in.nextLine();
//                System.out.println("Specify the participation % (out of 10)");
//                grade[0] = in.nextDouble();
//                if(grade[0] > 10){
//                    System.out.println("Your participation exceeds 10%, specify again:)");
//                    grade[0] = in.nextDouble();
//                }
//                System.out.println("Specify the assignment % (out of 20)");
//                grade[1] = in.nextDouble();
//                System.out.println("Specify the midterm % (out of 30)");
//                grade[2] = in.nextDouble();
//                System.out.println("Specify the final % (out of 40)");
//                grade[3] = in.nextDouble();
//                write(grade, ID, name);
//            }
        } while (choice != -0);
    }

    static void deleteSubject(String name) throws FileNotFoundException{
        File f = new File("src/com/programming/subjects.txt");

        File tempFile = new File("myTempFile.txt");
        PrintStream ps = new PrintStream(
                new FileOutputStream(tempFile, true));

        Scanner read = new Scanner(f);
        String stu;
        while (read.hasNextLine()) {
            String line = read.nextLine();
            Scanner lineScan = new Scanner(line);
            stu = lineScan.next();
            if(stu.equals(name)) continue;  //this will skip the next line
            ps.println(line);
        }
        boolean successful = tempFile.renameTo(f);
    }

    static String[] listSubject(File f) throws FileNotFoundException
    {
        String[] subjects = new String[50];
        int i = 0;
        Scanner read = new Scanner(f);
        while (read.hasNextLine()) {
            String line = read.nextLine();
            Scanner lineScan = new Scanner(line);
            subjects[i] = lineScan.next();
            i+=1;
        }
        return subjects;
    }

    static void  createSubject(String subjectName, String[] students, int[] weight, File f)
    {
        try {
            PrintStream ps = new PrintStream(
                    new FileOutputStream(f, true));
            ps.print(subjectName + " ");
            for (int i = 0; i < 5; i++) {
                ps.print(students[i] + " ");
                ps.print(weight[i] + " ");
            }
            ps.print(" \n");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }



    static void write ( double[] grade, int ID, String name ){

        try {
            PrintStream ps = new PrintStream(
                    new FileOutputStream("src/com/programming/sample.txt", true));
            ps.print(ID + " ");
            ps.print(name + " ");
            for (int i = 0; i <= 3; i++) {
                ps.print(grade[i] + " ");
            }
            ps.print(" \n");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }

    static void read (File file) throws FileNotFoundException {
        System.out.println("ID  Name  Par%  Ass%  Mid%  Fin%");
        System.out.println("--------------------------------");

        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            System.out.println(read.nextLine());
        }

        System.out.println("--------------------------------");
    }
}