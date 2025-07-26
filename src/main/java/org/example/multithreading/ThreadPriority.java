package org.example.multithreading;

class Demo implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread())
        }
    }
}

public class ThreadPriority {

    public static void main(String args[]){

    }
}
