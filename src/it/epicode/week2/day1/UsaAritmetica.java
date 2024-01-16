package it.epicode.week2.day1;

public class UsaAritmetica {

    public static void main(String[] args) {
        Aritmetica a = new Aritmetica();
      try {
        System.out.println(a.divisione(10, 0));

      }

      catch (ArithmeticException e) {
        System.out.println("Divisione per zero non ammessa");
      }
      catch (Exception e) {
          System.out.println("Eccezione generica");
      }
      finally  {
        System.out.println("Fine del programma");
      }

    }
}
