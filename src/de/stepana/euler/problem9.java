/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package de.stepana.euler;

/**
 * 
 * @author antonstepan
 */
public class problem9 {
  public static void main(final String[] args) {
    final long start = System.currentTimeMillis();

    int a = 10, b = 10, c = 10;
    final int limit = 1000;
    loop: for (a = 10; a < limit; a++) {
      System.out.println("Aktuell: a:" + a + " b:" + b + " c:" + c);
      for (b = 10; b < limit && a < b; b++) {
        for (c = 10; c < limit; c++) {
          if (checkNumbers(a, b, c)) {
            if (a + b + c == 1000) {
              System.out.println("FOUND !!!!!!!");
              System.out.println(a + "+" + b + "+" + c + " = 1000");
              System.out.println(a + "*" + a + "+" + b + "*" + b + "=" + c + "*" + c);
              System.out.println(a * b * c);
              break loop;
            }
          }
        }
      }
    }
    final long end = System.currentTimeMillis();
    final long dauer = end - start;
    System.out.println("a=" + a + ", b=" + b + ", c=" + c);
    System.out.println("Dauer: " + dauer + "ms <=> " + dauer / 1000 + "sek");
  }

  public static boolean checkNumbers(final int a, final int b, final int c) {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ? true : false;
  }

}
