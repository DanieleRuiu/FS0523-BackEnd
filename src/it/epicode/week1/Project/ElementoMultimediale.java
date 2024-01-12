package it.epicode.week1.Project;

public class ElementoMultimediale {
    private String Titolo;

    public ElementoMultimediale(String titolo) {
    	this.Titolo = titolo;
    }

    public String getTitolo() {
    	return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;


    }

    public String toString() {
    	return "Titolo: " + Titolo;
    }
}
