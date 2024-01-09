package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new scanner(system.in);
        system.out.println("scrivi un numero da 0 a 3");

        int numero = scanner.nextint();

        switch (numero) {
            case 0:
                System.out.println("x è 0");
                break;
            case 1:
                System.out.println("x è 1");
                break;
            case 2:
                System.out.println("x è 2");
                break;
            case 3:
                System.out.println("x è 3");
                break;
            default:
                System.out.println("x non è compreso tra 0 e 3");

        }
    }
}
