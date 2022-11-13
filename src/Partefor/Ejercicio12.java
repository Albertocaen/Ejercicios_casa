package Partefor;

import java.util.Scanner;

public class Ejercicio12 {
    //Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
    //el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Numero ");
        int numero= sc.nextInt();
       int guardar=1;
        for (int i = numero; i >0 ; i--) {
            guardar = guardar*i;
        }
        System.out.println("Factorial : " + guardar);
    }
}
