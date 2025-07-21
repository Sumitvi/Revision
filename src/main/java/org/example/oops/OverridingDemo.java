package org.example.oops;


// This is For Overriding

class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drwaing Circle");
    }
}

public class OverridingDemo {
    public static void main(String args[]){


    }
}
