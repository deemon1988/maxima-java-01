package org.example;

public class App {

    public static void main(String[] args) {

        int a = 10;
        byte b = 20;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int x;
        x = b;
        b = (byte) a;
        a = x;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
