package Partefor;

import java.util.Scanner;

public class Ejercicio7 {
 // 27. Escribe un programa que, dado un número n introducido por teclado, dibuje un
   // cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
          //  Ejemplo:
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Ingrese dimen");
     int n= sc.nextInt();
     System.out.println("Caracter");
     char caracter=sc.next().charAt(0);
     for (int i = 0; i <n; i++) {
         for (int j = 0; j <n ; j++) {
             System.out.print(" " +caracter);
         }
         System.out.println(" ");
     }
 }

}
