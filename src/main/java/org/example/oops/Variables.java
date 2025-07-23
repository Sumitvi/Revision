package org.example.oops;

class Person{
    String name;
     int age;


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public  void setAge(int age){
        this.age = age;
    }

    public  void setName(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name + " is " + age + " years old.");
    }
}


public class Variables {

    public static void main(String args[]){

        Person p1 = new Person();

        p1.setAge(20);
        p1.setName("Sumit");

        p1.display();
        

    }
}
