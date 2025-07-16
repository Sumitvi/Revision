package org.example;

public class Loops {
    public static void main(String[] args) {

//        there are three types of loop
        System.out.println("Print number from 1 to 10 using loops");
//        1 . For Loop

//        for(int i=1;i<=10;i++){
//            System.out.println("Numbers " +" " + i);
//        }


//        2. while Loop
        int num =1;
//        while (num<=10){
//            System.out.println("Numbers " + num);
//            num++;
//        }
//        3. Do While Loop

        do{
            System.out.println("Numbers " + num);
            num++;
        }while(num<=10);

    }
}
