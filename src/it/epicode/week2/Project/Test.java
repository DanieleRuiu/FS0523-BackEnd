package it.epicode.week2.Project;

import java.util.List;

public class Test {

        public static void main(String[] args) {
            Archivio catalogo = new Archivio();

            Libro l1 = new Libro("Il signore degli anelli", "978-8804344755", 1954, 1216, "J.R.R. Tolkien", "Fantasy");
            Libro l2 = new Libro("Il nome della rosa", "978-8845294749", 1980, 512, "Umberto Eco", "Giallo");
            Rivista r1 = new Rivista("Focus", "977-1129682008", 1992, 130, Periodicita.MENSILE);
            Rivista r2 = new Rivista("PC Professionale", "977-1129682008", 1992, 130, Periodicita.MENSILE);

            catalogo.aggiungiElemento(l1);
            catalogo.aggiungiElemento(l2);
            catalogo.aggiungiElemento(r1);
            catalogo.aggiungiElemento(r2);






            catalogo.salvaSuDisco("catalogo.dat");


            Archivio catalogo2 = Archivio.caricaDaDisco("catalogo.dat");


            ElementoCatalogo ricercaPerISBN = catalogo2.ricercaPerISBN("978-8804344755");
            if (ricercaPerISBN != null) {
                System.out.println(ricercaPerISBN.getTitolo());
            }
            List< ElementoCatalogo > ricercaPerAnnoPubblicazione = catalogo2.ricercaPerAnnoPubblicazione(1992);
            for (ElementoCatalogo elementoCatalogo: ricercaPerAnnoPubblicazione) {
                System.out.println(elementoCatalogo.getTitolo());
            }
            List < ElementoCatalogo > ricercaPerAutore = catalogo2.ricercaPerAutore("Umberto Eco");
            for (ElementoCatalogo elementoCatalogo: ricercaPerAutore) {
                System.out.println(elementoCatalogo.getTitolo());
            }
        }



    }
