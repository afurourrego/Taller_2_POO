package com.cristhianurrego.pregunta22;

/**
 * Created by Afuro on 19/02/2017.
 */
public class laPelota {
    public static void main(String[] args) {

        double distanciaFinal = 10, distanciaRebote = 10;

        System.out.println("CAIDA DE PELOTA A 10 PIES");

        for (int i = 0; i < 40 ; i++)
        {
            distanciaRebote = (distanciaRebote/3)*2;

            distanciaFinal = distanciaFinal+distanciaRebote;

        }

        System.out.println("La distancia recorrida en el rebote 40 es de: "+reDecimal(distanciaFinal,2)+" pies.");
    }

    public static double reDecimal(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }

}
