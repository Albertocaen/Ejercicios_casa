package Parteif;

import java.util.Scanner;

public class Ejercicio3 {
    //Escribe un programa que pida dos números e indique si el primero es mayor que el
    //segundo o no.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Primer Numero");
        int n1= sc.nextInt();
        System.out.println("Segundo Numero");
        int n2= sc.nextInt();
        if (n1<n2){
            System.out.println("Este numero es menor  "+n1);
        }else System.out.println("Este numero es menor  "+n2);
    }
}
