package org.example;

public class App {


    public static void main(String[] args) {

       System.out.println(fibo((byte) 6));

    }
    public static long fibo (byte n)
    {
        return n == 0 ? 0 : n == 1 ? 1 : fibo((byte) (n - 1)) + fibo((byte) (n - 2)); // выводит N-ый член последовательности Фибоначи

    }


}
