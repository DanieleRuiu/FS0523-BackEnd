package it.epicode.week2.day3;

import java.util.List;

public class UsaLambda {
    public static void main(String[] args) {

        Sommatore sommatore = (a, b) -> a + b;// METODO LAMBDA PER SOMMARE DUE NUMERI

        System.out.println(sommatore.somma(2, 3));



        Verificatore verificatore = (s,c) -> s.length() > c;// METODO LAMBDA PER VERIFICARE SE LA LUNGHEZZA DI UNA STRINGA E' MAGGIORE DI UN NUMERO
         System.out.println(verificatore.verifica("ciao", 3));

         Cerchio c = x -> Math.PI * x * x;// METODO LAMBDA PER CALCOLARE L'AREA DI UN CERCHIO

        System.out.println(c.area(2));


        List<Double> lista = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        SommaLista sommalista = l -> {
            double somma = 0;
            for (Double d : l) {
                somma += d;
            }
            return somma;
        };




    }
}
