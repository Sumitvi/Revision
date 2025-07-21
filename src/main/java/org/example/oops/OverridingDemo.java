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

class Traingle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Triangle");
    }
}

public class OverridingDemo {
    public static void main(String args[]){

        Shape s1 = new Shape();
        s1.draw();

        Traingle t1 = new Traingle()

    }
}
