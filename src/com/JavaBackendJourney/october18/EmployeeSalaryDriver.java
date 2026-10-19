package com.JavaBackendJourney.october18;

import java.util.Scanner;

class EmployeeSalaryDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n =sc.nextInt();
        sc.nextLine();
        if(n<=0) {
            System.out.println("Enter valid employee number ");
            sc.close();
            return;
        }
        EmployeeSalaryData[] employees = new EmployeeSalaryData[n];
        for(int i = 0; i<n;i++) {
            System.out.println("\nEmployee "+(i+1));
            System.out.print("Enter EmpID: ");
            String id = sc.nextLine();
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            double salary;
            do {
                System.out.print("Enter Basic Salary: ");
                salary=sc.nextDouble();

                if(salary<0) {
                    System.out.println("Enter valid Salary");
                }
            } while(salary<0);

            double bonus;
            do {
                System.out.print("Enter bonus: ");
                bonus=sc.nextDouble();
                sc.nextLine();
                if(bonus<0) {
                    System.out.println("Bonus cannot be negetive");
                }
            } while(bonus<0);
            employees[i]= new EmployeeSalaryData(id, name, salary, bonus);
        }
        int hightestIndex=0;

        for(int i =1;i<n;i++) {
            if(employees[i].getGrossSalary() > employees[hightestIndex].getGrossSalary()) {
                hightestIndex=i;
            }
        }
        System.out.println("\n Highest Paid Employee is: ");
        employees[hightestIndex].displayDetails();
        sc.close();
    }
}
