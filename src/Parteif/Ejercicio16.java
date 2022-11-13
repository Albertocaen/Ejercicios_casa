package Parteif;

import java.util.Scanner;

public class Ejercicio16 {
    //16. Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una
    //cadena que represente una casa (puedes asociarla a un número para hacer más fácil
    //la entrada por teclado) y que obtenga lo siguiente:
    //• si es "gryffindor" , salida "valentía" ;
    //• si es "hufflepuff" , salida "lealtad" ;
    //
    //4
    //• si es "slytherin" , salida "astucia" ;
    //• si es "ravenclaw" , salida "intelecto" ;
    //• de lo contrario, la salida "no es una casa válida" .
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Selecciona una casa");
        System.out.println("1-gryffindor   2-hufflepuff   3-slytherin  4-ravenclaw");
        String casas= sc.nextLine();
        if (casas.equals("1")||casas.equals("gryffindor")){
            System.out.println("valentía");
        } else if (casas.equals("2")||casas.equals("hufflepuff")) {
            System.out.println("lealtad");
        } else if (casas.equals("3")||casas.equals("slytherin")) {
            System.out.println("astucia");
        } else if (casas.equals("4")||casas.equals("ravenclaw")) {
            System.out.println("intelecto");
        }else
            System.out.println("No es una casa valida");
    }
}
