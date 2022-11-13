package Parteif;

import java.util.Scanner;

public class Ejercicio15 {
    //15. Tenemos un programa que pregunta a los estudiantes qué lenguaje de
    //programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
    //Java, Kotlin, Scala o Python
    //Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
    //el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
    //correcta es Java (obviamente).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Que lenguaje de programacion estas estudiando?");
        System.out.println("Ingrese el nombre como esta escrito en pantalla");
        System.out.println("JAVA/Kotlin/Scala/Python");
        String r= sc.nextLine();
        if (r.equals("JAVA")){
            System.out.println("¡Sí! ");
        } else if (r.equals("Kotlin")||r.equals("Scala")||r.equals("Python")) {
            System.out.println("¡No!");
        }else
            System.out.println("Opción desconocida");

    }
}
