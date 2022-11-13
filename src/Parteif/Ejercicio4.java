package Parteif;

import java.util.Scanner;

public class Ejercicio4 {
    //Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios  ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
    //a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
    //bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
    //b. false, en caso contrario.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Edad");
        int edad= sc.nextInt();
        System.out.println("Nivel de estudios:\n0 - Sin estudios\n1 - Educación primaria\n2 - ESO\n3 - Grado medio\n4 - Estudios superiores");
       int  nivel= sc.nextInt();
        System.out.println("Indique ingresos");
        int ingresos= sc.nextInt();
        boolean jasp;
        if (edad<=28&& nivel>3 || edad <30 && ingresos>28000){
            jasp=true;
        }else  jasp=false;
        if (jasp){
            System.out.println("Eres un Joven preparado");
        }else System.out.println("No lo eres");

    }
}
