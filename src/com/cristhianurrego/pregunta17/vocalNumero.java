package com.cristhianurrego.pregunta17;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class vocalNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("VOCAL O NUMERO");
        System.out.println("Ingrese un caracter para determinar: ");

        char caracter = sc.next().charAt(0);

        String letra = Character.toString(caracter);

        System.out.println(letra);

        if((letra.equals("a"))||(letra.equals("e"))||(letra.equals("i"))||(letra.equals("o"))||(letra.equals("u")))
        {
            System.out.println("Es una vocal");
        }
        else if ((letra.equals("0"))||(letra.equals("1"))||(letra.equals("2"))||(letra.equals("3"))||(letra.equals("4"))||(letra.equals("5"))||(letra.equals("6"))||(letra.equals("7"))||(letra.equals("8"))||(letra.equals("9")))
        {
            System.out.println("Es un numero");
        }
        else
        {
            System.out.println("ERROR: No es vocal o letra");
        }


    }
}
