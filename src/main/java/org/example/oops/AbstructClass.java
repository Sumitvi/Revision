package org.example.oops;

abstract class Animal{
    abstract void sound();

    void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("")
    }
}


public class AbstructClass {

    public static void main(String args[]){

    }
}
