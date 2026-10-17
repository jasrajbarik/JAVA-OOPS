package JavaBackendJourney.october16;


import java.util.Scanner;

public class StudentResultManagement {

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
        double[] averages = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            int age;
            do {
                System.out.print("Enter age: ");
                age = sc.nextInt();

                if (age <= 0) {
                    System.out.println("Age must be positive.");
                }
            } while (age <= 0);

            int m1, m2, m3;

            do {
                System.out.print("Enter marks for subject 1: ");
                m1 = sc.nextInt();

                System.out.print("Enter marks for subject 2: ");
                m2 = sc.nextInt();

                System.out.print("Enter marks for subject 3: ");
                m3 = sc.nextInt();

                if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                    System.out.println("Marks must be between 0 and 100.");
                }
            } while (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100);

            int total = m1 + m2 + m3;
            averages[i] = total / 3.0;

            boolean passed = m1 >= 40 && m2 >= 40 && m3 >= 40;

            System.out.println("\nName: " + names[i]);
            System.out.println("Total: " + total);
            System.out.println("Average: " + averages[i]);
            System.out.println("Result: " + (passed ? "Pass" : "Fail"));
            System.out.println("Grade: " + calculateGrade(averages[i]));

            sc.nextLine();
        }

        int highestIndex = 0;

        for (int i = 1; i < n; i++) {
            if (averages[i] > averages[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("\nStudent with highest average: " + names[highestIndex]);
        System.out.println("Highest average: " + averages[highestIndex]);

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
