package it.epicode.week1.Project;

public class Immagini extends ElementoMultimediale{

        private int luminosita;

        public Immagini(String titolo, int luminosita) {
            super(titolo);
            this.luminosita = luminosita;
        }

        public void getLuminosita() {
            System.out.println("La luminosità è: " + luminosita);
        }
        public void setLuminosita(int luminosita) {
            this.luminosita = luminosita;
        }

        public void toString(String titolo, int luminosita) {
            System.out.println("Titolo: " + titolo + " Luminosità: " + luminosita);
        }

        public int alzaLuminosita() {
            return luminosita++;
        }

        public int abbassaLuminosita() {
            if (luminosita > 0) {
                return luminosita--;
            }
            else {
                return luminosita;
            }

        }


        public void show() {
                String titolo = super.getTitolo();
                System.out.println(titolo + " " + "*".repeat(luminosita));

        }



}
