package org.example;

import java.util.Scanner;

public class InputArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Elements Are");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(" \"Java\" is a platform independent language");
        System.out.println("May not \"realize\" if they’ve \"left\" the app or \"lost\" attention");
    }
}
