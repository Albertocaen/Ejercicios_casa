package Parteif;

import java.util.Scanner;

public class Ejercicio6 {
    //A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de
    //mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una
    //fiesta de la marmota exitosa tendrá entre 10 y 20 tazas de mantequilla de cacahuete,
    //ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25
    //tazas.
    //Escribe un programa que lea dos valores:
    //• El primero es el número de tazas de mantequilla de cacahuete que hay en la
    //fiesta.
    //• El segundo es un booleano que indica si es fin de semana.
    //El programa debe imprimir si la fiesta tiene éxito o no (true o false).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Número de tazas de mantequilla de cacahuete");
        int taza= sc.nextInt();
        System.out.println("Es fin de Semana indica true or false");
            boolean finde= sc.nextBoolean();
        if (taza >=10 && taza<=20&& finde==false){
            System.out.println("EXITO= "+true);

        } else if (taza>=15&& taza<=25 && finde==true) {
            System.out.println("EXITO= "+true );

        }else System.out.println("Valor indicado Incorrecto;");
    }
}
