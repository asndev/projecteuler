/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package de.stepana.euler;

/**
 * 
 * @author antonstepan
 */
public class isPrime {

  public isPrime(final int number) {}

  public static boolean isP(final int n) {
    boolean prime = true;
    for (long i = 3; i <= Math.sqrt(n); i += 2)
      if (n % i == 0) {
        prime = false;
        break;
      }
    if (n % 2 != 0 && prime && n > 2 || n == 2) {
      return true;
    } else {
      return false;
    }
  }

}
