//package it.epicode.week2.day2;
//
//import java.util.ArrayList;
//
//public class Carrello {
//
//    private ArrayList<Articolo> carrello;
//
//    public Carrello() {
//        carrello = new ArrayList<>();
//    }
//
//    public void aggiungiArticolo(Articolo articolo) {
//        carrello.add(articolo);
//
//    }
//
//    public void StampaArticoli()    { System.out.println(carrello); }
//
//public double totale () {
//    double totale = 0;
//    for (Articolo a : carrello) {
//        totale += a.getPrezzo();
//    }
//    return totale;
//}