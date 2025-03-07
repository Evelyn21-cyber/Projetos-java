package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int numero1 = 10;
        int numero2 = 7;

        System.out.println("O número " + numero1 + " é par? " + ePAr(numero1));
        System.out.println("O número " + numero2 + " é par? " + ePAr(numero2));
    }
    public static boolean ePAr (int num) {
        return num % 2 == 0;
}


}
