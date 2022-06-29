package com.company;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;



public class Week8Assgn {
    public static void main(String[] args) {
        File file=new File("file.txt");
        FileOutputStream fileOutputStream=null;
        PrintStream printStream=null;
        try {
            fileOutputStream=new FileOutputStream(file);
            printStream=new PrintStream(fileOutputStream);

            //Print String
            printStream.println("Leroy");

            printStream.println(" Assignments =  ");

            //print percentage
            printStream.print( 10);


            printStream.println("Midterm =");

            //Print double value
            printStream.print(45.50);

            //Print newline
            printStream.println();

            //Print String
            printStream.println("  Overall Mark");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
                if(printStream!=null){
                    printStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


