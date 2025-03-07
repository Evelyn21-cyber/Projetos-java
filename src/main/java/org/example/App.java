package org.example;


public class App
{
    public static void main( String[] args )
    {
        int a = 5;
        int b = 3;
        int resultado = add(a,b);
        System.out.println("A soma de " + a + " e " +b+ " é " +resultado);
    }
 public static int add(int num1, int num2){
    return num1 + num2;
}

}
