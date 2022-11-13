package Parteif;

import java.util.Scanner;

public class Ejercicio2 {
    //Realiza un programa que pida por teclado el sueldo anual de una persona, si supera
   // los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar
    //impuestos. Si no lo supera, que indique que no debe abonarlos.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Su sueldo Anual");
        double sueldo= sc.nextDouble();
        if (sueldo<=9000){
            System.out.println("no tiene que abonar  Impuestos");
        }else System.out.println("Debe abonar impuesto ");
    }
}
