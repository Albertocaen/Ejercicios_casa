package Parteif;

import java.util.Scanner;

public class Ejercicio9 {
    //Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
    //comparan con dos valores guardados previamente. Si coinciden, se indica “Has
    //entrado al sistema”, en caso contrario se da un error.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Usario");
        String usuario= sc.nextLine();
        System.out.println("Ingrese clave");
        String clave= sc.nextLine();
        if (usuario.equals("Alberto")&& clave.equals("2810a")){
            System.out.println("Ingreso al sistema");
        }else
            System.out.println("Ponga bien los datos");
    }
}
