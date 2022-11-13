package Parteif;

import java.util.Scanner;

public class Ejercicio14 {
    //El director de una escuela está organizando un viaje de estudios, y requiere
    //determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
    //de viajes por el servicio. La forma de cobrar es la siguiente:
    //a. Si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
    //b. de 50 a 99 alumnos, el costo es de 70 euros,
    //c. de 30 a 49, de 95 euros,
    //d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
    //importar el número de alumnos.
    //Escribe un programa que, introduciendo el número de alumnos que van de viaje,
    //permita determinar el pago a la compañía de autobuses y lo que debe pagar
    //cada alumno.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero de alumnos");
      double bus=4000;
       double contenedor;
        double pago;
        double total;
        int alum= sc.nextInt();
        if (alum>=100){
            pago=65;
            contenedor=pago*alum;

                System.out.println("Los alumnos tienen que pagar "+pago+"€ cada uno"+ "\n" +
                        "El pago a la compañia es de= "+contenedor+"€");

        } else if (alum>=50 && alum<=99) {
            pago=75;
            contenedor=pago*alum;

            System.out.println("Los alumnos tienen que pagar "+pago+"€ cada uno"+ "\n" +
                    "El pago a la compañia es de= "+contenedor+"€");



        } else if (alum<=49 && alum>=30) {
            pago=95;
            contenedor=pago*alum;

            System.out.println("Los alumnos tienen que pagar "+pago+"€ cada uno"+ "\n" +
                    "El pago a la compañia es de = "+contenedor+"€");


        }else if (alum<=29) {
            pago=bus/alum;
            total=alum*pago;
            System.out.println("Los alumnos tienen que pagar "+Math.ceil(pago)+"€ cada uno"+ "\n" +
                    "El pago a la compañia es de= "+Math.round(total)+"€");

        }

    }
}
