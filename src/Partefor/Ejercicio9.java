package Partefor;

import java.util.Scanner;

public class Ejercicio9 {
//29. Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de
//multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas
//puedes usar el tabulador \t). Ejemplo:
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Numero Entero positivo ");
    int numero= sc.nextInt();
    for (int i = 1; i <numero ; i++) {
        System.out.printf("\n"+"Tabla del "+i+":");
        for (int j =1; j <=10 ; j++) {
            System.out.printf("\t"+j*i);

        }

    }
}
}
