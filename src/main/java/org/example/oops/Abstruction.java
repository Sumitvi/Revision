package org.example.oops;

// THis is Called Abstruction


abstract class Payment{

    private String appName;
    abstract void makePayment();

    public void AppUsed(String appName){
        System.out.println(appName);
    }
}

class BHIM extends Payment{

    @Override
    void makePayment() {
        System.out.println("Paid Rs 12000");

    }

    void AppUsed(){
        System.out.println("BHIM UPI");
    }
}


class Paytm extends Payment{

    @Override
    void makePayment(){
        System.out.println("Paid Rs 50000");
    }

    void AppUsed(){
        System.out.println("PayTm");
    }
}


public class Abstruction {

    public static void main(String args[]){

       BHIM b1 = new BHIM();
       b1.AppUsed();
       b1.makePayment();

       Paytm p1 = new Paytm();
       p1.AppUsed();
       p1.makePayment();

    }
}
