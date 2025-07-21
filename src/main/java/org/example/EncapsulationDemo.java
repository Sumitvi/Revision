package org.example;

class Fruits{
    private int weight;
    private String name;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        a1.setName("Mausami");
        System.out.println( a1.getName());

//        Banana b1 = new Banana();
//        b1.Name();
//        b1.FruitName("Orange");
//        b1.FruitWeight(3);

    }
}
