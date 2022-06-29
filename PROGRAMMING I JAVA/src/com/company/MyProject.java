package com.company;

import java.util.Scanner;

public class MyProject {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        int name = in.nextInt();
        System.out.println("Please enter your first assignment grade: ");
        int assgn1 = in.nextInt();
        System.out.println("Please enter your second assignment grade: ");
        int assgn2 =  in.nextInt();
        System.out.println("Please enter your midterm exam: ");
        int midtermExam =  in.nextInt();
        System.out.println("Please enter your final exam score: ");
        int finalExam =  in.nextInt();
        StudentRecord sr = new StudentRecord(name,assgn1,assgn2,midtermExam,finalExam);
        System.out.println(sr.toString());
    }
}
class StudentRecord
{
    private int name;
    private int assgn1;
    private int assign2;
    private int midTermExam;
    private int finalExam;
    private double finalScore;
    private char grade;
    public StudentRecord(int n, int a1, int a2, int mt, int fe)
    {
        name = n;assgn1 = a1;assign2 = a2;midTermExam = mt;finalExam = fe;
        calculateGrade();
    }
    private void calculateGrade()
    {
        finalScore = ((assgn1+assign2)*1.25) + (midTermExam*.25) + (finalExam*.50);
        if (finalScore >= 90) grade = 'A';
        else if (finalScore >= 80) grade = 'B';
        else if (finalScore >= 70) grade = 'C';
        else if (finalScore >= 60) grade = 'D';
        else grade = 'F';
    }
    public String toString()
    {
        return "Student name: "+name+" First assignment score: "+assgn1+" Second assignment score:  "+assign2+
                " Midterm Exam score: "+midTermExam+" Final Exam score: "+finalExam+
                "Final score: "+new java.text.DecimalFormat("0.00").format(finalScore)+" Grade: "+grade;
    }

}



