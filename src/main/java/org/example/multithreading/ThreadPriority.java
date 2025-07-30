package org.example.multithreading;

class Demo implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("Child Thread");
        }
    }
}

public class ThreadPriority {

    public static void main(String args[]){

        Thread t1 = new Thread(new Demo());
        Thread t2 = new Thread(new Demo());

        t1.start();
        t2.start();
//        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.setPriority(Thread.NORM_PRIORITY);

        for(int i=0;i<5;i++){
            System.out.println("Parent Thread");
        }



    }
}
