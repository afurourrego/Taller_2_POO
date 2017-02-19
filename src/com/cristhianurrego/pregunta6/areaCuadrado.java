package com.cristhianurrego.pregunta6;


import java.util.Scanner;

/*
 * Created by Afuro on 18/02/2017.
 */
public class areaCuadrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ladoA,ladoB,ladoC,ladoD;

        System.out.println("CALCULAR EL AREA DE UN CUADRADO");
        System.out.print("Ingrese el lado A: ");

        ladoA = sc.nextInt();

        System.out.print("Ingrese el lado B: ");

        ladoB = sc.nextInt();

        System.out.print("Ingrese el lado C: ");

        ladoC = sc.nextInt();

        System.out.print("Ingrese el lado D: ");

        ladoD = sc.nextInt();

        if (ladoA == ladoB){
            if (ladoC == ladoD){
                System.out.print("El area del cuadrado es: "+(ladoA*ladoC));
            }
            else
            {
                System.out.print("ERROR: no es un cuadrado de ningun tipo");
            }
        }

        if (ladoA == ladoC){
            if (ladoB == ladoD){
                System.out.print("El area del cuadrado es: "+(ladoA*ladoB));
            }
            else
            {
                System.out.print("ERROR: no es un cuadrado de ningun tipo");
            }
        }

        if (ladoA == ladoD){
            if (ladoB == ladoC){
                System.out.print("El area del cuadrado es: "+(ladoA*ladoB));
            }
            else
            {
                System.out.print("ERROR: no es un cuadrado de ningun tipo");
            }
        }
    }
}
