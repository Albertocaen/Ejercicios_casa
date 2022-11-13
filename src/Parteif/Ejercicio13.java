package Parteif;

import java.util.Scanner;

public class Ejercicio13 {
    //La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
    //la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
    //venta del producto, ésta es de un solo tipo (A o B) y tamaño (1 o 2). Al comenzar el
    //programa pide el precio inicial, tipo, tamaño de la uva y kilos que se van a vender en
    //un embarque. Se requiere determinar cuánto recibirá un productor por la uva que
    //entrega en un embarque, considerando lo siguiente:
    //a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
    //1; y 30 céntimos si es de tamaño 2.
    //b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
    //cuando es de tamaño 2.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Precio Inicial de uva es 12,50" );
        double precio= 12.50;
        System.out.println("Tipo de uva A/B ");
        String uva= sc.nextLine();
        System.out.println("Tamaño 1 o 2");
        int tamano= sc.nextInt();
        System.out.println("Kg a pedir");
        double kg= sc.nextDouble();
        double cargoa=0.20;
        double cargob=0.30;
        double cargoc=0.50;
        double contador=0;
        if (uva.equals("A")&& tamano ==1){
            contador=precio*kg+(cargoa*kg);
            System.out.println("Precio que se tendra que vender es =" + contador);
        }
        if (uva.equals("A")&& tamano==2){
            contador=precio*kg+(cargob*kg);
            System.out.println("Precio que se tendra que vender es =" + contador);
        }
        if (uva.equals("B")&& tamano==1){
            contador=precio*kg+(cargob*kg);
            System.out.println("Precio que se tendra que vender es = " +contador);
        }
        if (uva.equals("B")&& tamano==2){
            contador=precio*kg+(cargoc*kg);
            System.out.println("Precio que se tendra que vender es = " +contador);
    }
        if((uva != "A" ) &&( uva!="B")&& tamano>=3){
            System.out.println("Ingrese Valores correctos ");
        }
    }
}




