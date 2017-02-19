package com.cristhianurrego.pregunta1;

import java.util.Scanner;

/*
 * Created by Afuro on 15/02/2017.
 */

public class cuadradoYCubo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSION A CUBO Y CUADRADO");
        System.out.print("Ingrese un numero: ");

        int numero = sc.nextInt();

        System.out.println("Su numero es: "+numero);
        System.out.println("Su valor al cuadrado es: "+(numero*numero));
        System.out.println("Su valor al cubo es: "+(numero*numero*numero));
    }
}
