package Partefor;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // y también quiero hacer: 1 * 2 * 3 * 4 * .... * 30 (no podemos meter el 0 en el producto porque se nos anula to-do siempre
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese numero");
        double numero= sc.nextDouble();
        for (int i = 1; i <=30 ; i++) {
            numero*=i;
            
        }
        System.out.println("Producto= "+numero);
    }
}
