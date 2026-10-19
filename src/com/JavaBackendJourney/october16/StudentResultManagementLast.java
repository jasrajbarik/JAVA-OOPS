package com.JavaBackendJourney.october16;


import java.util.Scanner;

public class StudentResultManagementLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Number of students must be positive.");
            sc.close();
            return;
        }

        String[] names = new String[n];
        int[] ages = new int[n];
        int[] totals = new int[n];
        double[] averages = new double[n];
        boolean[] results = new boolean[n];

        // Taking input for n students
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            do {
                System.out.print("Enter age: ");
                ages[i] = sc.nextInt();

                if (ages[i] <= 0) {
                    System.out.println("Age must be positive.");
                }
            } while (ages[i] <= 0);

            int m1, m2, m3;

            do {
                System.out.print("Enter marks for subject 1: ");
                m1 = sc.nextInt();

                System.out.print("Enter marks for subject 2: ");
                m2 = sc.nextInt();

                System.out.print("Enter marks for subject 3: ");
                m3 = sc.nextInt();

                if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
                {
                    System.out.println("Marks must be between 0 and 100.");
                }
            } while (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100);

            totals[i] = m1 + m2 + m3;
            averages[i] = totals[i] / 3.0;

            results[i] = m1 >= 40 && m2 >= 40 && m3 >= 40;

            sc.nextLine();
        }

        // Printing the results of all students
        System.out.println("\n========== STUDENT RESULTS ==========");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Total: " + totals[i]);
            System.out.printf("Average: %.2f%n",averages[i]); //printf statement
            System.out.println("Result: " + (results[i] ? "Pass" : "Fail"));
            System.out.println("Grade: " + calculateGrade(averages[i]));
        }

        // Find student with highest average and highest total marks
        int highestAverageIndex = 0;
        int highestMarksIndex = 0;

        for (int i = 1; i < n; i++)
        {
            if (averages[i] > averages[highestAverageIndex]) {
                highestAverageIndex = i;
            }

            if (totals[i] > totals[highestMarksIndex]) {
                highestMarksIndex = i;
            }
        }

        // Printing highest performers
        System.out.println("\n========== TOP PERFORMERS ==========");

        System.out.println("Student with highest average: " + names[highestAverageIndex]);
        System.out.printf("Highest average: %.2f%n", averages[highestAverageIndex]); //printf statement
        /*
                 Common printf() format specifiers
            Specifier   	Purpose         	Example
            %s          	String	            Rahul
            %d	            Integer	            25
            %f	        Floating-point number	85.500000
            %.2f	    Two decimal places	    85.50
            %c          	Character	        A
            %b          	Boolean         	true
            %n          	New line        	Moves to next line
            %%	        Percentage symbol	    %
            */

        System.out.println("\nStudent with highest marks: " + names[highestMarksIndex]);
        System.out.println("Highest total marks: " + totals[highestMarksIndex]);

        sc.close();
    }

    static String calculateGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}
