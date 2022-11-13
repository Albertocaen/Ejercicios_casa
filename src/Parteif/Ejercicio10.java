package Parteif;

import java.util.Scanner;

public class Ejercicio10 {
    //10. Escribe un programa que pida tres números y los muestre ordenados (de mayor a
    //menor);
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");
        int[] array= new int [4];
        for (int i = 0; i < 4 ; i++) {
            int n= sc.nextInt();
            array[i]=n;
        } int i, j, aux;
        for (i = 0; i < 4 - 1; i++) {
            for (j = 0; j < 4 - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        for (int k = 0; k <4 ; k++) {
            System.out.println(" "+array[k]);

        }

        }

    }

