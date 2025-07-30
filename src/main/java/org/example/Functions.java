package org.example;

public class Functions {

    public static int getAvg(int a, int b){
       int avg = (a+b)/2;
       return avg;
    }

    public static int factorial(int b){
        int fact = 1;
        for(int i=1;i<=b;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]){

        System.out.println(getAvg(10,20));;

        System.out.println("Factorial of 5 is " + factorial(5));
        System.out.println("Factorial of 20 is " + factorial(10));


    }
}
