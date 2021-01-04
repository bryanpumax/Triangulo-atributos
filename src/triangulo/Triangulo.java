/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author BRYAN
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();

    }

    private static void menu() {

        int optiones;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("\t Menu");
        System.out.println("\t1-Cateto opuesto");
        System.out.println("\t2-Cateto adyacente");
        System.out.println("\t3-Hipotenusa");
        System.out.println("\t4-Salir");
        System.out.print("\tDigite opcion(1-4)-->:");
        optiones = ingreso.nextInt();
        switch (optiones) {
            case 1:

                opuesto_menu();
                break;
            case 2:
                adyacente_menu();
                break;
            case 3:hipotenusa_menu();break;
            case 4:
                salir();
        }
    }

    private static void salir() {
        System.out.println("Salio");
        System.out.close();
    }

    private static void opuesto_menu() {
        Scanner ingreso = new Scanner(System.in);
        float hipotenusa, angulo;
        System.out.println("*****\t\tCateto opuesto\t\t*****");

        System.out.print("\tingrese valor hipotenusa:");
        hipotenusa = (float) ingreso.nextDouble();
        System.out.print("\n\tingrese valor angulo:");
        angulo = (float) ingreso.nextDouble();
        Catetoopuesto op = new Catetoopuesto(hipotenusa, angulo);
        double resultado = op.calculo();
        System.out.println("\tCateto opuesto es: " + resultado+"\t");
    constancia();
    
    }

    private static void adyacente_menu() {
Scanner ingreso = new Scanner(System.in);
        float hipotenusa, angulo;
        System.out.println("*****\t\tCateto adyacente\t\t*****");

        System.out.print("\tingrese valor hipotenusa:");
        hipotenusa = (float) ingreso.nextDouble();
        System.out.print("\n\tingrese valor angulo:");
        angulo = (float) ingreso.nextDouble();
        cateto_adyacente ad = new cateto_adyacente(hipotenusa, angulo);
        double resultado = ad.calculo();
        System.out.println("\tCateto adyacente es: " + resultado+"\t");
    constancia();
    }

    private static void hipotenusa_menu() {
Scanner ingreso = new Scanner(System.in);
        float lado, angulo;
        System.out.println("*****\t\tHipotenusa\t\t*****");

        System.out.print("\tingrese valor un lado mas cercano:");
        lado = (float) ingreso.nextDouble();
        System.out.print("\n\tingrese valor angulo:");
        angulo = (float) ingreso.nextDouble();
        Hipotenusa h = new Hipotenusa(lado, angulo);
        double resultado = h.calculo();
        System.out.println("\tHipotenusa es: " + resultado+"\t");
    constancia();
    }
    private static void constancia(){
        int opcion ;Scanner ingreso = new Scanner(System.in);
        System.out.print("\n\t Deseas ingresar al menu digita 1  o deseas cerrar el programa digite 0->\t");
        opcion=ingreso.nextInt();
if(opcion==1){menu();}else{salir();}
    }
}
