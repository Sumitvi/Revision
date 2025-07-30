package org.example.oops;

// MultiLevel Inheritance

abstract class Animal{
    void eats(){
        System.out.println("Eating");
    }

    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Puppy extends Dog{
    void sound(){
        System.out.println("Weep");
    }
}


public class MultiLevelDemo {
    public static void main(String args[]){
        Puppy c1 = new Puppy();
        c1.sound();
        c1.eats();

        c1.sound();

    }
}
