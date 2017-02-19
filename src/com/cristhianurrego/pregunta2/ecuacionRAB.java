package com.cristhianurrego.pregunta2;

import java.util.Scanner;

/*
 * Created by Afuro on 16/02/2017.
 */
public class ecuacionRAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ecuacion R = (A+B / C)D");
        System.out.println("Ingreso de los numeros para la ecuacion..");
        System.out.print("Ingrese A: ");

        int A = sc.nextInt();

        System.out.print("Ingrese B: ");

        int B = sc.nextInt();

        System.out.print("Ingrese C: ");

        int C = sc.nextInt();

        System.out.print("Ingrese D: ");

        int D = sc.nextInt();

        System.out.print("El resultado de R es: "+((A+B/C)*D));
    }
}
