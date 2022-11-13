package Partefor;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        double suma=0;
        double contenedor=0;
        for (int i = 0; i <10 ; i++) {
           int notas= sc.nextInt();
            suma=suma+notas;
        }contenedor=suma/10;
        System.out.println("Las notas son "+contenedor);
    }
}
