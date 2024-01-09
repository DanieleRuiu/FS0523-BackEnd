package it.epicode.week1.day2;

import java.util.Scanner;

public class Museo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Scegli una delle seguenti opzioni:");
        int scelta = sc.nextInt();
/*
        if (scelta == 1) {
            System.out.println("Il biglietto è gratuito");
        } else if (scelta == 2) {
            System.out.println("Il biglietto costa 5 euro");
        } else if (scelta == 3) {
            System.out.println("Il biglietto costa 10 euro");
        } else if (scelta == 4) {
            System.out.println("Il biglietto costa 15 euro");
        } else {
            System.out.println("Scelta non valida");

        }*/

        switch (scelta) {
            case 1:
                System.out.println("Il biglietto è gratuito");
                break;
            case 2:
                System.out.println("Il biglietto costa 5 euro");
                break;
            case 3:
                System.out.println("Il biglietto costa 10 euro");
                break;
            case 4:
                System.out.println("Il biglietto costa 15 euro");
                break;
            default:
                System.out.println("Scelta non valida");

        }
    }
}
