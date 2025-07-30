package org.example.oops;

//  Hierarchical Inheritance


class Animal1{
    void eats(){
        System.out.println("Eating");
    }
}

class Dog1 extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Puppy1 extends Animal1{
    void sound(){
        System.out.println("Weep");
    }
}



public class Hierarchical {
    public static void main(String args[]){

        Puppy1 p1 = new Puppy1();
        p1.sound();
        p1.eats();

        Dog1 d1 = new Dog1();
        d1.sound();
        d1.eats();

    }
}
