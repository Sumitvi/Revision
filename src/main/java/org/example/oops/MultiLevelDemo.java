package org.example.oops;

class Animal{
    void eats(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meaw");
    }
}


public class MultiLevelDemo {
    public static void main(String args[]){
        Cat c1 = new Cat();
        c1.sound();
        c1.eats();

        Dog d1 = new Dog();
        d1.sound();
        d1.eats();

    }
}
