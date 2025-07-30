package org.example.collections;
import java.util.*;

public class ArrayListDemo {

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<5;i++){
            list.add(i);
        }


//        The Other Part


        System.out.println("List is " + list);

       while(true){

           System.out.println("Enter Element to Remove");
           Scanner sc = new Scanner(System.in);
           int index = sc.nextInt();

           if(index<list.size()){
               list.remove(index);

               if (list.contains(index)) {

                   System.out.println("Do you Want to Delete the index " + index);

               }
               System.out.println("List is " + list);
           }else{
               System.out.println("No List Found");
           }


           System.out.println("Enter Element to Check");
           int ele = sc.nextInt();
           if(list.contains(ele)){
               System.out.println("we have Element Exist");
           }else{
               System.out.println("We dont have ele Exists");
           }

           if(index == -1){
               System.exit(0);
           }
       }



       }
}
