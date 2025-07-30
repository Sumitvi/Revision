package org.example.multithreading;

class Test implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println("Thread is running: " + i);
        }
    }
}

public class UsingRunnable {

    public static void main(String args[]){

        Test t1 = new Test();
        Thread thread1 = new Thread(t1);
        thread1.start();

        for(int i=0;i<5;i++){
            System.out.println("Main Thread is running: " + i);
        }

    }
}
