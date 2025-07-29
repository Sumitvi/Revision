package org.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String args[]){

//        Here the Elements are to be not based on insertion but on their insertion order
//        no thread safe
//        duplicate allow

        PriorityQueue<Integer> pq = new PriorityQueue<>();  // this is min heap
        pq.add(1);
        pq.add(30);
        pq.offer(20);
        pq.add(2);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        System.out.println(pq);

//        iterations in priority queue

        for(int num : pq){
            System.out.println(num);
        }
     }
}
