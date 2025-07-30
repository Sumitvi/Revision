package org.example.corejava;

class Person{
    private String name = "Rahul Gandhi";  // accessable within same class only
    int age = 50;      // acccessable withing same class , package

    public void getName(){      // public is accessable in same class , package , subclass , outside package
        System.out.println("Name is " + name);
    }

    protected void getAge(){   // accessable in same class , package , subclass
        System.out.println("Age is " + age);
    }


}



public class AccessModifiers {
    public static void main(String args[]){

//        There are 3 types of access modifiers

        Person p1 = new Person();
        p1.getName();
//        p1.getAge();
        p1.age = 30;
        p1.getAge();
    }
}
