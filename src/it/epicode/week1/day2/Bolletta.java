package it.epicode.week1.day2;

import java.util.Scanner;

public class Bolletta {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il consumo di acqua in metri cubi");
        int consumo = sc.nextInt();
        double bolletta=20;
        if (consumo <=100){
            bolletta = bolletta + consumo*2.5;
        }else {
            bolletta = bolletta + 100*2.5 + (consumo-100)*4;
        }
        System.out.println("La bolletta è: " + bolletta);

    }
}
