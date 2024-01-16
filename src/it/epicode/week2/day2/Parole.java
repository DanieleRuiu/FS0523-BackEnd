package it.epicode.week2.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parole {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Chiedi all'utente di inserire il numero di elementi
            System.out.print("Inserisci il numero di elementi (N): ");
            int N = scanner.nextInt();
            scanner.nextLine();

            // Crea un HashSet per memorizzare le parole distinte
            Set<String> paroleDistinte = new HashSet<>();
            // Crea un HashSet per memorizzare le parole duplicate
            Set<String> paroleDuplicate = new HashSet<>();

            // Chiedi all'utente di inserire N parole
            for (int i = 0; i < N; i++) {
                System.out.print("Inserisci la parola " + (i + 1) + ": ");
                String parola = scanner.nextLine();

                // Verifica se la parola è già presente nel set delle parole distinte
                if (!paroleDistinte.add(parola)) {

                    paroleDuplicate.add(parola);
                }
            }


            System.out.println("Parole duplicate: " + paroleDuplicate);


            System.out.println("Numero di parole distinte: " + paroleDistinte.size());


            System.out.println("Elenco delle parole distinte: " + paroleDistinte);


            scanner.close();
        }


}

