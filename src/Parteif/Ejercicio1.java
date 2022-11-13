package Parteif;

import java.util.Scanner;

public class Ejercicio1 {
    //Escribe un programa que pida un número e indique si es par o impar (un número es
    //par si al dividirlo entre 2 el resto es 0).//
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique Numero");
        int n1= sc.nextInt();
        if (n1 % 2==0){
            System.out.println("Numero Par");
        }else System.out.println("Es Impar");
        }
    }

