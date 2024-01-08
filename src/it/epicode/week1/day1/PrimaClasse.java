package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int j = scanner.nextInt();

        System.out.println(j);

        String parola =scanner.nextLine();

        System.out.println(parola);



        int x;
        x = 8;
        x = 9;
        x = 1;

        int y = 0;
        y = 7;

        final int r = 6;

        boolean b = true; // solo true e false

        char c = 'e'; // accetta solo un carattere

        byte w = 6; // accetta solo valori da -128 a +127

        short s = 9; // +65000 -65000

        long l = 30000000;

        float f = 3.5f;

        double d = 3.6;

        String frase = "corso Java";

        String frase2 = "Epicode";

        String fraseConcatenata = frase + frase2;

        System.out.println(fraseConcatenata);

        int z = s;

        float f2 = z;
        System.out.print(z);
        System.out.print(f2);

        z = z%6;







    }

    public static double somma ( double x, double y){
        double somma = x+y;
        return somma;
    }
}
