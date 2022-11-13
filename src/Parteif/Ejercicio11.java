package Parteif;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //11. Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si
        //es un número divisible por 4, pero no si es divisible por 100, excepto que también
        //sea divisible por 400.
        System.out.println("Año");
        int ano=sc.nextInt();
        if (ano%4==0 && ano % 100 !=0 || ano%400==0){
            System.out.println("Es bisiesto");
        }else System.out.println("No lo es");
    }
}
