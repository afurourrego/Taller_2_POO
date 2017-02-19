package com.cristhianurrego.pregunta28;

import java.util.Scanner;

/**
 * Created by Afuro on 19/02/2017.
 */
public class matriz4X4 {
    public static void main(String[] args) {

        int limiteCadena = 4;

        int[][] laMatriz = new int[limiteCadena][limiteCadena];
        int[] sumaFila = new int[limiteCadena], sumaColumna = new int[limiteCadena];

        String fila = "", columna = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("SUMA DE VECTOR PARA MATRICES CUADRADAS");

        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {
                System.out.print("Ingrese valor para la posicion ["+(posColumna+1)+"]["+(posFila+1)+"]: ");

                laMatriz[posFila][posColumna] = sc.nextInt();

                sumaFila[posColumna] = sumaFila[posColumna]+laMatriz[posFila][posColumna];

                sumaColumna[posFila] = sumaColumna[posFila]+laMatriz[posFila][posColumna];
            }
        }

        for (int pos = 0; pos < limiteCadena; pos++)
        {
            fila += sumaFila[pos];

            if (pos <= (limiteCadena - 2))
            fila += " - ";

            columna += sumaColumna[pos];

            if (pos <= (limiteCadena - 2))
            columna += " - ";
        }


        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {
                System.out.print("["+laMatriz[posFila][posColumna]+"]");
            }
            System.out.println("\n");
        }

        System.out.println("La suma de las filas es: "+fila);
        System.out.println("La suma de las columnas es: "+columna);
    }
}
