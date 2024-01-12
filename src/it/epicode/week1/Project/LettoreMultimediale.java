package it.epicode.week1.Project;


import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stampa il menu principale
        System.out.println("Benvenuto nel lettore multimediale");
        System.out.println("1. Riproduci un video");
        System.out.println("2. Riproduci un audio");
        System.out.println("3. Mostra un'immagine");
        System.out.println("4. Riproduci un video, un audio e mostra un'immagine");
        System.out.println("0. Esci");

        int choice;

        do {
            // Chiede all'utente di inserire un numero corrispondente all'opzione desiderata
            System.out.println("Inserisci il numero dell'opzione desiderata: ");
            choice = sc.nextInt();
            sc.nextLine();

            // Esegue l'azione corrispondente alla scelta dell'utente
            switch (choice) {
                case 1:
                    playVideo(sc);
                    break;
                case 2:
                    playAudio(sc);
                    break;
                case 3:
                    showImage(sc);
                    break;
                case 4:
                    playVideo(sc);
                    playAudio(sc);
                    showImage(sc);
                    break;
                case 0:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Inserisci un numero valido");
                    break;
            }
        } while (choice != 0);

        sc.close(); // Chiude lo Scanner per evitare possibili perdite di risorse
    }

    // Metodo per riprodurre un video
    private static void playVideo(Scanner sc) {
        System.out.println("Inserisci il titolo del video");
        String titolo = sc.nextLine();
        System.out.println("Inserisci il volume del video");
        int volume = sc.nextInt();
        System.out.println("Inserisci la luminosità del video");
        int luminosita = sc.nextInt();
        System.out.println("Inserisci la durata del video");
        int durata = sc.nextInt();
        Video v = new Video(titolo, volume, luminosita, durata);
        v.play();
    }

    // Metodo per riprodurre un audio
    private static void playAudio(Scanner sc) {
        System.out.println("Inserisci il titolo dell'audio");
        String titolo = sc.nextLine();
        System.out.println("Inserisci il volume dell'audio");
        int volume = sc.nextInt();
        System.out.println("Inserisci la durata dell'audio");
        int durata = sc.nextInt();
        Audio a = new Audio(titolo, volume, durata);
        a.play();
    }

    // Metodo per mostrare un'immagine
    private static void showImage(Scanner sc) {
        System.out.println("Inserisci il titolo dell'immagine");
        String titolo = sc.nextLine();
        System.out.println("Inserisci la luminosità dell'immagine");
        int luminosita = sc.nextInt();
        Immagini i = new Immagini(titolo, luminosita);
        i.show();
    }
}