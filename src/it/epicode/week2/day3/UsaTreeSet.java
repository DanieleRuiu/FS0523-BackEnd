package it.epicode.week2.day3;

import java.util.Comparator;
import java.util.TreeSet;

public class UsaTreeSet {
    public static void main(String[] args) {
        Ordinatore ordinatore = new Ordinatore();

        TreeSet<String> parole = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        parole.add("ciao");
        parole.add("cane");
        parole.add("gatto");
        parole.add ("mucca");

        System.out.println(parole);

    }
}
