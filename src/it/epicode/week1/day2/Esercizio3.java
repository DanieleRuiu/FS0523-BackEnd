package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio3 {

  public static void main(String[] args) {
      System system = null;
      system.out.println("Scrivi una stringa");
        String s = new Scanner(System.in).nextLine();
        int i = 0;
        while (i < s.length()) {
            System.out.print(s.charAt(i));
            if (i < s.length() - 1) {
                System.out.print(",");
            }
            i++;

            if (s.equals("q")) {
                break;
            }

        }
    }
}
