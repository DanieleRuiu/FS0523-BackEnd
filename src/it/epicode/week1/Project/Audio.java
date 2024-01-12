package it.epicode.week1.Project;

// La classe Audio estende ElementoMultimediale e implementa ElementoRiproducibile
public class Audio extends ElementoMultimediale implements ElementoRiproducibile {

    // Attributi della classe
    private int volume;
    private int durata;

    // Costruttore che richiede titolo, volume e durata
    public Audio(String titolo, int volume, int durata) {
        super(titolo); // Chiamata al costruttore della classe madre (ElementoMultimediale)
        this.volume = volume;
        this.durata = durata;
    }

    // Metodo per ottenere il volume
    public void getVolume() {
        System.out.println("Il volume è: " + volume);
    }

    // Metodo per impostare il volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Metodo per ottenere la durata
    public void getDurata() {
        System.out.println("La durata è: " + durata);
    }

    // Metodo per impostare la durata
    public void setDurata(int durata) {
        this.durata = durata;
    }

    // Metodo per visualizzare informazioni sull'audio (titolo e volume)
    public void toString(String titolo, int volume) {
        System.out.println("Titolo: " + titolo + " Volume: " + volume);
    }

    // Metodo per aumentare il volume
    public int alzaVolume() {
        return volume++;
    }

    // Metodo per abbassare il volume
    public int abbassaVolume() {
        if (volume > 0) {
            return volume--;
        } else {
            return volume;
        }
    }

    // Metodo per verificare se l'audio è riproducibile in base alla durata
    public boolean isRiproducibile() {
        return durata > 0;
    }

    // Implementazione del metodo play dell'interfaccia ElementoRiproducibile
    public void play() {
        for (int i = 0; i < durata; i++) {
            String titolo = super.getTitolo(); // Ottiene il titolo dalla classe madre
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}