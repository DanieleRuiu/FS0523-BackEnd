package it.epicode.week2.Project;

import java.io.Serializable;

public class Rivista extends ElementoCatalogo implements Serializable {
    private Periodicita periodicita;

    public Rivista(String titolo, String isbn, int annoPubblicazione, int numeroPagine, Periodicita periodicità) {
        super(titolo, isbn, annoPubblicazione, numeroPagine);
        this.periodicita = periodicità;
    }
    public Periodicita getPeriodicita() {
        return periodicita;
    }
    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
    @Override
    public String toString() {
        return "Riviste{" + "periodicità=" + periodicita + '}';
    }
}
