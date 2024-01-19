package it.epicode.week2.Project;

import java.io.Serializable;

public class Libro extends ElementoCatalogo implements Serializable {
    private String autore;
    private String genere;

    public Libro(String titolo, String isbn, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(titolo, isbn, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }
    public String getAutore() {
        return autore;
    }
    public String getGenere() {
        return genere;

    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    @Override
    public String toString() {
        return "Libri{" + "autore=" + autore + ", genere=" + genere + '}';
    }


}

