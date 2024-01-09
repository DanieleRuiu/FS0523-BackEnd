package it.epicode.week1.day2;

import java.util.Scanner;

public class Maggiore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int a = sc.nextInt();
        System.out.println("Inserisci il secondo numero");
        int b = sc.nextInt();
        System.out.println("Inserisci il terzo numero");
        int c = sc.nextInt();

        int maggiore = maggiore(a, b, c);
        System.out.println("Il maggiore è: " + maggiore);

    }

    public static int maggiore(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}
