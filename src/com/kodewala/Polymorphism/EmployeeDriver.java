package com.kodewala.Polymorphism;

class Employee {
    public void markIn() {
        System.out.println("Employee.markIn......");
    }
}
class HRManager extends Employee {
   @Override
    public void markIn() {
        System.out.println("HRManager.markIn.....");
    }
}
public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.markIn();
        Employee e2 = new HRManager(); //parent class refering child class's object
        e2.markIn(); /* Same method will behave differently based on the actual object.
                        1. At the time of compilation, it will check the method's existence in the class Employee
                        2. At the time of execution (while running), it will call the method on actual object */

    }
}
