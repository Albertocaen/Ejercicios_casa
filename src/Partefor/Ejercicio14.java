package Partefor;

import java.util.Scanner;

public class Ejercicio14 {
    //33. Escribe un programa que, dados dos números, uno real (base) y un entero positivo
    //(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
    //método Math.pow().
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Base");
        int n1= sc.nextInt();
        System.out.println("Exponente");
        int n2= sc.nextInt();
        int resultado=1;
        for (int i = 0; i <n2; i++) {
            resultado=resultado*n1;
        }
        System.out.println("Potencia = "+resultado);
    }
}
