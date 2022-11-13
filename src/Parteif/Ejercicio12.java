package Parteif;

import java.util.Scanner;

public class Ejercicio12 {
    //12. Realiza un programa que pida una fecha (día, mes y año) y compruebe si componen
    //una fecha correcta.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dia");
        int dia= sc.nextInt();
        System.out.println("Mes");
        int mes= sc.nextInt();
        System.out.println("Año");
        int ano= sc.nextInt();
        if (ano%4==0 && ano % 100 !=0 || ano % 400==0 ){
            if (mes<=12){
                if (mes == 1|| mes== 3||mes==5||mes==7||mes==8||mes==10||mes==12){
                    if (dia<=31){
                        System.out.println("Fecha correcta " + dia + "/"+ mes + "/"+ano);
                    }else System.out.println("Fecha Incorrecta");
                }if (mes==4|| mes==6|| mes==9||mes==11){
                    if (dia<=30){
                        System.out.println("Fecha correcta " + dia + "/" + mes + "/" + ano);
            }else System.out.println("Fecha Incorrecta");
                }
                if (mes==2){
                    if (dia<=29){
                        System.out.println("Fecha Correcta "+dia+"/"+mes+"/"+ano);
                    }else System.out.println("Fecha Incorrecta");
                }
            }
        }else
        if (ano>0 ){
            if (mes<=12){
                if (mes == 1|| mes== 3||mes==5||mes==7||mes==8||mes==10||mes==12){
                    if (dia<=31){
                        System.out.println("Fecha correcta " + dia + "/"+ mes + "/"+ano);
                    }else System.out.println("Fecha Incorrecta");
                }
                if (mes==4|| mes==6|| mes==9||mes==11){
                    if (dia<=30){
                        System.out.println("Fecha correcta " + dia + "/"+ mes + "/"+ano);
                    }else System.out.println("Fecha Incorrecta");
                }
                if (mes==2){
                    if (dia<=28){
                        System.out.println("Fecha correcta " + dia + "/"+ mes + "/"+ano);
                    }else System.out.println("Fecha Incorrecta");
                }
            }
        }
    }
}
