package Parteif;

import java.util.Scanner;

public class Ejercicio8 {
    //Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
    //“no” (en vez de true/false).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica si eres culpable S/N");
        String culpable = sc.nextLine();
        if ( culpable.equals("S")){
            System.out.println("A la carcel");
        } else if (culpable.equals("N")) {
            System.out.println("Pa fuera");
        }else
            System.out.println("Ingrese correcto un valor S o N");


    }
}
