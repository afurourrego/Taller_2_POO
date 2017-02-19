package com.cristhianurrego.pregunta27;

import java.util.Scanner;

/**
 * Created by Afuro on 19/02/2017.
 */
public class vectorSuma {
    public static void main(String[] args) {

        int limiteCadena = 5;

        int[] numero = new int[limiteCadena];
        int suma = 0;


        String acumulador = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("SUMA DE VECTOR");

        for (int posNum = 0; posNum < limiteCadena; posNum++) {

            System.out.print("Ingrese en la posicion " + (posNum + 1) + " un numero: ");

            numero[posNum] = sc.nextInt();

            suma = suma + numero[posNum];

            acumulador += numero[posNum];

            if (posNum <= (limiteCadena - 2))
                acumulador += ", ";
        }

        System.out.println("Los Numeros ingresados son: "+acumulador);
        System.out.println("La suma de ellos es: "+suma);
    }
}
