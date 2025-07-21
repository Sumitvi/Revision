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
        System.out.println("Meowing...");
    }
}


public class AbstructClass {

    public static void main(String args[]){

        Dog d1 = new Dog();
        d1.sound();
        d1.sleep();

        Cat c1 = new Cat();
        c1.sound();
        c1.s

    }
}
