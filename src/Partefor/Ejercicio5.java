package Partefor;

import java.util.Scanner;

public class Ejercicio5 {
    //26. Hacer un programa que pida diez números por teclado y calcule su media.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese 10 Numeros");
       double suma=0;
        double div=0;
        double[]notas=new double[10];
        for (int i = 0; i <10 ; i++) {
            notas[i]= sc.nextInt();
        }
        for (int i = 0; i <10 ; i++) {
            suma=suma+notas[i];
        }
        div=suma/10;
        System.out.println("La media es  "+div);


        }

        }
