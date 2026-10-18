package com.kodewala.Inheritance.Basics;

class EmployeeData {
    String name = "Amit";
    String address = "Bangalore";

    private String empCode = "IC1234";
    public void markIn(String empId)
    {
        System.out.println("Marking IN : "+empId);
    }
}

class Manager extends EmployeeData //Manager IS-A Employee
{
    public void doSomething()
    {
        System.out.println(name);
        System.out.println(address);
        markIn(address);
    }
}
