package org.example.corejava;


public class ExceptionDemo {

    public static void main(String args[]){

//        Exception is an undwanted event that disturbance excution of program
//        There are Two Types of Exceptions
//        Checked Exception -- Exception Which Force Compiler to Check Explicitly , thrown at compile time
//        Unchecked Exception -- thrown at run time

//        Arithmetic Exception
//
//        try{
//            System.out.println(10/0);
//        }catch( ArithmeticException e){
//            e.printStackTrace();
//        }

//        int arr[] = {1,2,3};
//
//        try{
//            System.out.println(arr[5]);
//        }catch(ArrayIndexOutOfBoundsException e ){
//            System.out.println("Array Index out of bond");
//        }

//        try{
//            throw new ArithmeticException("Request Fail Due to Technical Error");
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        try{

            System.out.println(10/0);

        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }






    }
}
