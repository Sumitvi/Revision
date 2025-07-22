package org.example.oops;

abstract class Animal2{
    abstract void sound();

    void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog2 extends Animal{

    @Override
    void sound(){
        System.out.println("Barking...");
    }
}

class Cat2 extends Animal{

    @Override
    void sound(){
        System.out.println("Meowing...");
    }
}


public class AbstructClass {

    public static void main(String args[]){

        Dog2 d1 = new Dog2();
        d1.sound();



        Cat2 c1 = new Cat2();
        c1.sound();

    }
}
