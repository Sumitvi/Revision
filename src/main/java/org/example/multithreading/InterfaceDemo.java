package org.example.multithreading;

interface Car{
    static void demo(){
        System.out.println("Static Method Can be Defined in Interface");
    }

   public int speed();
    public void model();

}


class Honda implements Car{
    @Override
    public int speed() {
        return 20;
    }

    @Override
    public void model() {
        System.out.println("Honda-120");
    }


}

class Suzuki implements Car{
    @Override
    public int speed(){
        return 120;
    }

    @Override
    public void model(){
        System.out.println("Yamaha-200");
    }
}

public class InterfaceDemo {

    public static void main(String args[]){

//        Prefer Method in OOP to Call the interface Implemented class
        Car c1 = new Honda();
        System.out.println(c1.speed());
        c1.model();

        Car c2 = new Suzuki();
        System.out.println(c2.speed());
        c2.model();


////        We can also call like this
//        Honda h1 = new Honda();
//        System.out.println(h1.speed());
//        h1.model();

    }
}
