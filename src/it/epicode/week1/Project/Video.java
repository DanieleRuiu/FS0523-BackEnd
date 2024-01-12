package it.epicode.week1.Project;

public class Video extends ElementoMultimediale implements ElementoRiproducibile {

    // Attributi della classe
    private int volume;
    private int luminosita;
    private int durata;

    // Costruttore che richiede titolo, volume, luminosità e durata
    public Video(String titolo, int volume, int luminosita, int durata) {
        super(titolo); // Chiamata al costruttore della classe madre (ElementoMultimediale)
        this.volume = volume;
        this.luminosita = luminosita;
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

    // Metodo per ottenere la luminosità
    public void getLuminosita() {
        System.out.println("La luminosità è: " + luminosita);
    }

    // Metodo per impostare la luminosità
    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    // Metodo per ottenere la durata
    public void getDurata() {
        System.out.println("La durata è: " + durata);
    }

    // Metodo per impostare la durata
    public void setDurata(int durata) {
        this.durata = durata;
    }

    // Metodo toString per ottenere una rappresentazione testuale del video
    public void toString(String titolo, int volume, int luminosita) {
        System.out.println("Titolo: " + titolo + " Volume: " + volume + " Luminosità: " + luminosita);
    }

    // Metodo per verificare se il video è riproducibile in base alla durata
    public boolean isRiproducibile() {
        return durata > 0;
    }

    // Implementazione del metodo play dell'interfaccia ElementoRiproducibile
    @Override
    public void play() {
        if (isRiproducibile()) {
            for (int i = 0; i < durata; i++) {
                String titolo = super.getTitolo(); // Ottiene il titolo dalla classe madre
                System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
            }
        } else {
            System.out.println("Il video non è riproducibile");
        }
    }
}