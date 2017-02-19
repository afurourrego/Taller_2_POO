package com.cristhianurrego.pregunta30;

import java.util.Scanner;

/**
 * Created by Afuro on 19/02/2017.
 */
public class matriz012 {
    public static void main(String[] args) {

        int limiteCadena = 8;

        int[][] laMatriz = new int[limiteCadena][limiteCadena];

        Scanner sc = new Scanner(System.in);

        System.out.println("MATRIZ 012");

        for (int posColumna = 0; posColumna < limiteCadena; posColumna++)
        {
            for (int posFila = 0; posFila < limiteCadena; posFila++)
            {
                if (posColumna == posFila)
                {
                    System.out.print("[0]");
                }
                else if (posColumna > posFila)
                {
                    System.out.print("[2]");
                }
                else
                {
                    System.out.print("[1]");
                }
            }
            System.out.println("\n");
        }
    }
}
