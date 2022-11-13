package Partefor;

import java.util.Scanner;

public class Ejercicio8 {
//28. Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
//rectángulo en que la base sea el número mayor y la altura el número menor, con un
//carácter también introducido por teclado.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese primer base");
    int n1= sc.nextInt();
    System.out.println("Ingrese Segundo altura ");
     int n2= sc.nextInt();
    System.out.println("Ingrease Caractar");
    char caracter=sc.next().charAt(0);
    for (int i = 0; i <n1; i++) {
        for (int j = 0; j <n2; j++) {
            System.out.print(" " +caracter);
        }
        System.out.println(" ");
   }

    }
}


