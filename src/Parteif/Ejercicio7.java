package Parteif;

import java.util.Scanner;

public class Ejercicio7 {
    //Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
    //• En caso afirmativo el usuario responderá true
    //• En caso contrario responderá false.
    //Si el usuario responde true se le responderá “a la cárcel”. En caso contrario, “¡a casa!”.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica con un true o false si eres culpable o no");
        boolean v= sc.nextBoolean();
        if (v==false){
            System.out.println("Puedes irte");
        }else
            System.out.println("Pa la carcel");
    }
}
