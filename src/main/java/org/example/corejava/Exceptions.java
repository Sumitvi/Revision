package org.example.corejava;

class Methods{

    void m1() throws ArithmeticException{
        System.out.println(10/0);
    }

    void m2() throws ArithmeticException{
        m1();
    }

    void m3() throws ArithmeticException{
        m2();
     }
    void m4() throws ArithmeticException{
        m3();
    }
    void m5() throws Exception{
        m4();
     }
}

public class Exceptions {
    public static void main(String args[]) {
        Methods m1 = new Methods();
       try{
           m1.m5();
       }catch(Exception e){
           System.out.println("Exception Delegated rn main class handled Exception");
       }

    }
}
