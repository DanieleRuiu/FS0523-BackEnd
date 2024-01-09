package it.epicode.week1.day2;


public class Esercizio1 {
    public static boolean stringaPariDispari(String s) {
        int lunghezza = s.length();
        if (lunghezza % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }

        } else {
            return false;
        }


    }
}