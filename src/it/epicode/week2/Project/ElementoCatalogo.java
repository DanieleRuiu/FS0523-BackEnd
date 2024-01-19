package it.epicode.week2.Project;

import java.io.Serializable;

public class ElementoCatalogo implements Serializable {
    private String titolo;
    private String isbn;
    private int annoPubblicazione;
    private int numeroPagine;

    public ElementoCatalogo(String titolo, String isbn, int annoPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "ElementoCatalogo{" + "titolo=" + titolo + ", isbn=" + isbn + ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + '}';
    }
}



