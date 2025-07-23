package org.example.corejava;

public class FinallyKeyword {
    public static void main(String args[]){

        try{
            System.out.println("Inside try Block");
            int res = 10/0;
            System.out.println(res);
        }catch(Exception e){

             e.printStackTrace();

        }
        
        finally{
            System.out.println("Finally Block Excuted Weather the Exception Occurs or Not");
        }
    }
}
