package it.epicode.week2.day3;

import java.util.Comparator;

public class Ordinatore <String> implements Comparator <String> {

    @Override
    public int compare(String o1, String o2) {
      return o1.toString().compareTo(o2.toString());
    }



}
