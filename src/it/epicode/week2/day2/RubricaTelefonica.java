package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    // Metodo per l'inserimento di una coppia <Nome, telefono>
    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
        System.out.println("Contatto inserito: " + nome + ", " + telefono);
    }

    // Metodo per la cancellazione di una coppia <Nome, telefono> a partire dal nome
    public void cancellaContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            String telefono = rubrica.remove(nome);
            System.out.println("Contatto cancellato: " + nome + ", " + telefono);
        } else {
            System.out.println("Contatto non trovato per il nome: " + nome);
        }
    }

    // Metodo per la ricerca di una Persona di cui si conosce il numero di telefono
    public void cercaPersonaPerTelefono(String telefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                System.out.println("Persona trovata: " + entry.getKey() + ", " + telefono);
                return;
            }
        }
        System.out.println("Nessuna persona trovata con il numero di telefono: " + telefono);
    }

    // Metodo per la ricerca del numero di telefono di una Persona di cui si conosce il Nome
    public void cercaTelefonoPerPersona(String nome) {
        if (rubrica.containsKey(nome)) {
            String telefono = rubrica.get(nome);
            System.out.println("Numero di telefono trovato per " + nome + ": " + telefono);
        } else {
            System.out.println("Nessun numero di telefono trovato per il nome: " + nome);
        }
    }

    // Metodo per stampare tutti i contatti con nome e numero
    public void stampaRubrica() {
        System.out.println("Rubrica Telefonica:");
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        // Esempio di utilizzo dei metodi
        rubrica.inserisciContatto("Mario", "123456789");
        rubrica.inserisciContatto("Luigi", "987654321");
        rubrica.stampaRubrica();

        rubrica.cercaTelefonoPerPersona("Mario");
        rubrica.cercaPersonaPerTelefono("987654321");

        rubrica.cancellaContatto("Luigi");
        rubrica.stampaRubrica();
    }
}
