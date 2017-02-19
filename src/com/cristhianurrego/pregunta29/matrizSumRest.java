package com.cristhianurrego.pregunta29;

import java.util.Scanner;

/**
 * Created by Afuro on 19/02/2017.
 */
public class matrizSumRest {
    public static void main(String[] args) {
        int limiteCadena = 3;

        int[][] laMatriz1 = new int[limiteCadena][limiteCadena], laMatriz2 = new int[limiteCadena][limiteCadena], laMatriztemp = new int[limiteCadena][limiteCadena];
        int[] sumaFila = new int[limiteCadena], sumaColumna = new int[limiteCadena];

        Scanner sc = new Scanner(System.in);

        System.out.println("SUMA DE VECTOR PARA MATRICES CUADRADAS");

        System.out.println("MATRIZ 1");
        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {
                System.out.print("Ingrese valor para la posicion ["+(posColumna+1)+"]["+(posFila+1)+"]: ");

                laMatriz1[posFila][posColumna] = sc.nextInt();

                sumaFila[posColumna] = sumaFila[posColumna]+laMatriz1[posFila][posColumna];

                sumaColumna[posFila] = sumaColumna[posFila]+laMatriz1[posFila][posColumna];
            }
        }

        System.out.println("MATRIZ 1");
        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {
                System.out.print("Ingrese valor para la posicion ["+(posColumna+1)+"]["+(posFila+1)+"]: ");

                laMatriz2[posFila][posColumna] = sc.nextInt();

                sumaFila[posColumna] = sumaFila[posColumna]+laMatriz2[posFila][posColumna];

                sumaColumna[posFila] = sumaColumna[posFila]+laMatriz2[posFila][posColumna];
            }
        }

        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {
                System.out.print("["+laMatriz1[posFila][posColumna]+"]");
            }

            System.out.print("    ");

            for (int posFila2 = 0; posFila2 < limiteCadena; posFila2++)
            {
                System.out.print("["+laMatriz2[posFila2][posColumna]+"]");
            }

            System.out.println();
        }

        System.out.println("\n SUMA\t\tRESTA");

        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {

                laMatriztemp[posFila][posColumna] = laMatriz1[posFila][posColumna]+laMatriz2[posFila][posColumna];

                System.out.print("["+laMatriztemp[posFila][posColumna]+"]");
            }

            System.out.print("    ");

            for (int posFila2 = 0; posFila2 < limiteCadena; posFila2++)
            {
                laMatriztemp[posFila2][posColumna] = laMatriz1[posFila2][posColumna]-laMatriz2[posFila2][posColumna];

                System.out.print("["+laMatriztemp[posFila2][posColumna]+"]");
            }

            System.out.println("\n");
        }



    }
}
