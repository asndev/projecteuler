/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package de.stepana.euler;

/**
 * 
 * @author antonstepan
 */
public class problem27 {

  public static void main(final String[] args) {

    final long start = System.currentTimeMillis();
    int max = 0;
    int resA = 0;
    int resB = 0;
    final int resC = 0;

    for (int a = -1000; a < 1000; a++) {
      for (int b = -1000; b < 1000; b++) {
        int n = 0;
        int sum = 0;
        while (isPrime((int) Math.pow(n, 2) + a * n + b)) {
          sum++;
          n++;
        }
        if (sum > max) {
          max = sum;
          resA = a;
          resB = b;
        }
      }
    }
    final long end = System.currentTimeMillis();
    final long dauer = end - start;
    System.out.println("max: " + max + " with: a,b,c= " + resA + " " + resB + " " + resC);
    System.out.println("a*b = " + resA * resB);
    System.out.println("Dauer: " + dauer + "ms <=> " + dauer / 1000 + "sek");
  }

  public static boolean isPrime(final int n) {
    boolean prime = true;
    for (long i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        prime = false;
        break;
      }
    }
    if (n % 2 != 0 && prime && n > 2 || n == 2) {
      return true;
    } else {
      return false;
    }
  }
}
