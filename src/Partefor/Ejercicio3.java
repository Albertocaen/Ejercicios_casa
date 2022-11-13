package Partefor;

import java.util.Scanner;

public class Ejercicio3 {
    //24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
    //menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
    //ambos inclusive.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa numero ");
        int a= sc.nextInt();
        System.out.println("Ingrese numero");
        int b =sc.nextInt();
        int suma=0;
        for (int i = a; i <=b ; i++) {
            suma=suma+i;
            System.out.println(suma);
        }
    }
}
