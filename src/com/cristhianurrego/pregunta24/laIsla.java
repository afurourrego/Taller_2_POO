package com.cristhianurrego.pregunta24;

/**
 * Created by Afuro on 18/02/2017.
 */
public class laIsla {
    public static void main(String[] args) {

        double precioIsla = 24;

        for (int ano = 1616; ano <= 1976; ano++)
        {
            precioIsla = precioIsla + (precioIsla*0.12);
        }

        System.out.println("El capital en 1976 seria de: "+precioIsla+" dolares en piedritas de fantasia");
    }
}
