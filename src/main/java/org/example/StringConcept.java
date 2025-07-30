package org.example;

public class StringConcept {

    public static void main(String args[]){

        System.out.println("String , StringBuilder & StringBuffer");

//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1.equals(s2));
//
//        String a1 = new String("Sumit");
//        String a2 = new String("Sumit");
//
//        System.out.println(a1==a2);

        String s1 = new String("Sumit");
        String s2 = "Sumit";
        System.out.println(s1.equals(s2));
        String s3 = "Sumit";
        System.out.println(s2.equals(s1));
        String s = new String("Sumit");
        System.out.println(s1.equals(s));

        String st = "Hello";
        String st1 = "Hello";
        System.out.println(st.equals(st1));

        StringBuilder sb = new StringBuilder();
        System.out.println(s1.equals(sb));
        sb.append("Rahul");
        sb.append(" Chopra");
        System.out.println(sb);
        sb.append("Khalnayak");
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(sbf);
        sbf.append(" Sumit");
        System.out.println(sbf);
        System.out.println(sbf.length());


    }
}
