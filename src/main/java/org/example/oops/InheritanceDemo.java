package org.example.oops;

class Car{
    private int price;
    private int model;

    public void carPrice(int price){
        System.out.println(price);
    }

    public void carMode(int model){
        System.out.println(model);
    }
}

class Maruti extends Car{

    private String name;
    public void CarName(){
        System.out.println("Maruti Suzuki");
    }

}



public class InheritanceDemo {
    public static void main(String args[]){

        Maruti m1 = new Maruti();
        m1.CarName();
        m1.carMode(1300);
        m1.carPrice(1000000);

    }
}
