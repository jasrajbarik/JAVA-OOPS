package com.JavaBackendJourney.october18;

class EmployeeSalaryData {
    private String empId;
    private  String name;
    private double basicSalary;
    private double bonus;

    EmployeeSalaryData(String _empId, String _name, double _basicSalary, double _bonus) {
        this.empId=_empId;
        this.name=_name;
        setBasicSalary(_basicSalary);
        setBonus(_bonus);
    }
    public void setBasicSalary(double salary) {
        if(salary>=0) {
            this.basicSalary=salary;
        }
    }
    public void setBonus(double bonus_) {
        if(bonus_>=0) {
            this.bonus=bonus_;
        }
    }
    public double getGrossSalary() {
        return basicSalary+bonus;
    }
    public void displayDetails() {
        System.out.println("Emp Id: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Gross Salary: "+getGrossSalary());
    }

}
