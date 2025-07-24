package org.example.corejava;

public class NewConcept {

    public static void main(String args[]){


//        There are Three Types of Keyword Used in Java
//        1. Final -- where if we declare anything final we can't modify that
//        2. Finally -- Block of Code Used with Error Handling Code
//        3. Finalize -- Used in Garbage Collector
        
        try{
            System.exit(0);
            System.out.println("Try Block Excuted");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("LIC Zindagi Ke Saath Bhi Aur Zindagi ke Baad Bhi");
        }

//        System.exit is More PowerFul than finally if we want to exit the code
    }
    
}
