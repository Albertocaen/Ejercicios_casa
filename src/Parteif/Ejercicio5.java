package Parteif;

import java.util.Scanner;

public class Ejercicio5 {
    //Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
    //de ellos.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese 10 Numeros");
        int guardado=0;
        for (int i=0; i<10;i++){
            int ingrese= sc.nextInt();
            if (ingrese>guardado){
                guardado=ingrese;
            }
        }
        System.out.println("El numero mayor es  "+ guardado);

    }
}
