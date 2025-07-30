package org.example.oops;

// Overloading means same method name but diffrent Arguements
class Test{
    public int add(int a , int b){
        return a+b;
    }

    public int add(int a , int b , int c){
        return a+b+c;
    }

    public float add(int a , int b, int c , int d){

        return a+b+c+d;

    }
}



public class OverLoadingDemo {

    public static void main(String args[]){

        Test t1 = new Test();
        System.out.println(t1.add(10 , 20));
        System.out.println( t1.add(20 , 30 , 40));
        System.out.println(t1.add(10 , 20 , (int) 30., (int) 30.));

    }
}
