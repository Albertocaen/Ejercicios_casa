package Partefor;

import java.util.Scanner;

public class Ejercicio13 {
    //32. Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n
    //un número introducido por el usuario.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero= sc.nextInt();
        for (int i = 1; i <=numero ; i++) {
            if (i % 5 ==0 || i==1){
                System.out.println(i+"");
            }
        }
    }
}
