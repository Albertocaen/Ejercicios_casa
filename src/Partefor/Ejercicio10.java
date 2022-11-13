package Partefor;

public class Ejercicio10  {
    //30Hacer un programa que calcule la suma y el producto de los 30 primeros números
    //naturales.
    public static void main(String[] args) {
        int suma=0;
        for (int i = 0; i <30 ; i++) {
            suma +=i;
        }
        System.out.println("Suma es "+suma);
    }
}
