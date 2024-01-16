//package it.epicode.week2.day1;
//
//public class Molo {
//    private String codice;
//    private int numeroPostiBarca;
//    private String[] barche;
//
//    public Molo(String codice, int numeroPostiBarca) {
//        this.codice =codice;
//        this.numeroPostiBarca = numeroPostiBarca;
//        this.barche = new String[numeroPostiBarca];
//    }
//
//    public String getCodice() {
//        return codice;
//    }
//    public void setCodice(String codice) {
//        this.codice = codice;
//    }
//public int getNumeroPostiBarca() {
//    return numeroPostiBarca;
//
//}
//public void setNumeroPostiBarca(int numeroPostiBarca) {
//    this.numeroPostiBarca = numeroPostiBarca;
//}
//public  static Molo crea(String codice, int numeroPostiBarca) {
//    Molo m = new Molo(codice, numeroPostiBarca);
//    return m;
//}
//public boolean libero(int n){
//    if (barche[n]!=null) return false;
//    return true;}
//
//}
//public void assegnaBarca(int n, String barca) {
//    if (libero(n)) {
//        barche[n] = barca;
//    } else {
//        throw new PostoOccupatoException("Il posto" + n + "è occupato");
//
//
//
//    }
//}