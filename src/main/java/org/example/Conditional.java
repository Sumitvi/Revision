package org.example;

public class Conditional {

    public static void main(String args[]){


        System.out.println("=====Conditional Statements====");
        int a = 18;

        if(a>15){
            System.out.println("You Can Walk and Talk");
        }else{
            System.out.println("You Can'nt");
        }

        int age = 21;

        if(age<21){
            System.out.println("You are less than 21");

        }else if(age>21){
            System.out.println("You are greater than 21");
        }else{
            System.out.println("You are 21");
        }

        switch (age){
            case 2:
                System.out.println("The value is 2");
                break;

            case 3:
                System.out.println("Value is 3");
                break;
            case 20:
                System.out.println("Value is 21");
                break;

            default:
                System.out.println("Value not Found");
        }



    }
}
