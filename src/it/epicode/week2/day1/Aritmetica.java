package it.epicode.week2.day1;

public class Aritmetica {
    public int divisione(int a, int b){
        int risultato = 0;
        try {
            risultato = a / b;

        } catch (ArithmeticException e) {

            System.out.println("Divisione per zero non ammessa");
            ;
        }
        return risultato;
    }
}
