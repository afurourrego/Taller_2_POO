package com.cristhianurrego.pregunta23;

/**
 * Created by Afuro on 18/02/2017.
 */
public class sucesion500 {
    public static void main(String[] args) {

        int numero = 1;

        for (int i=1; i <= 500; i++)
        {
            System.out.println(numero);

            numero = numero + 4;
        }
    }
}
