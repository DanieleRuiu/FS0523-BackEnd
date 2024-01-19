package it.epicode.week2.Project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio implements Serializable {

    private List<ElementoCatalogo> catalogo = new ArrayList<>();

    public void aggiungiElemento(ElementoCatalogo elemento) {
        catalogo.add(elemento);
    }

    public void rimuoviElemento(String ISBN) {
        catalogo.removeIf(e -> e.getIsbn().equals(ISBN));
    }

    public ElementoCatalogo ricercaPerISBN(String isbn) {

        return catalogo.stream().filter(e -> e.getIsbn().equals(isbn)).findFirst().orElse(null);
    }

    public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int annoPubblicazione) {
        return catalogo.stream().filter(e -> e.getAnnoPubblicazione() == annoPubblicazione).collect(Collectors.toList());
    }

    public List<ElementoCatalogo> ricercaPerAutore(String autore) {
        return catalogo.stream()
                .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
                .collect(Collectors.toList());

    }


    public void salvaSuDisco(String nomeFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
            oos.writeObject(this);

        } catch (IOException e) {
            System.out.println("Errore di I/O");
        }
    }

    public static Archivio caricaDaDisco(String nomeFile) {
        Archivio archivio = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeFile))) {
            archivio = (Archivio) ois.readObject();
            return archivio;
        } catch (IOException e) {
            System.out.println("Errore di I/O");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe non trovata");
        }

        return archivio;
}

}
















