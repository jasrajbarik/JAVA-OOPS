package com.kodewala.Polymorphism.DownCasting;
class Person {
    String name;
    public Person(String _name) {
        super();
        this.name= _name;
    }
    @Override //here this method is overriding the Object class .equals method...
    public boolean equals(Object obj) {
        Person p = (Person) obj; //downcasting the object
        return p.name.equals(this.name);
    }
}
public class Driver {
    public static void main(String[] args) {
        Person p1 = new Person("Jasraj");
        Person p2 = new Person("Jasraj");
        System.out.println(p1.equals(p2));
    }
}
