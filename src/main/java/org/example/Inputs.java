package org.example;
import java.util.*;

public class Inputs {
    public static void main(String[] args) {

        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>17){
            System.out.println("You Can Drive");
        }else{
            System.out.println("You Can not Drive");
        }

//        write a program to check the avarage of two numbers

        System.out.println("Enter a1 & b1");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int avg = (a1 + b1)/2;
        System.out.println(avg);

    }
}
