package org.example;

class Fruits{
    private int weight;
    private String name;

    public void FruitName(String name){
        System.out.println(name);
    }

    public int FruitWeight(int weight){
        return weight;
    }
}

class Apple extends Fruits{
    public void Name(){
        System.out.println("Apple");
    }
}

class Banana extends Fruits{
    public void Name(){
        System.out.println("Banana");
    }
}


public class EncapsulationDemo {

    public static void main(String args[]){
        Apple a1 = new Apple();
        a1.Name();
        a1.FruitName("Mausami");
        a1.Name();

        Banana b1 = new Banana();
        b1.

    }
}
