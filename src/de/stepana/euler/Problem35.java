/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package de.stepana.euler;

/**
 * 
 * @author antonstepan
 */
public class Problem35 {

  public static void main(final String[] args) {

    int sum = 0;
    String a, b, c, d; // 1 000 000
    final String e, f, g;

    for (int i = 0; i < 100; i++) {

      final String numAsString = Integer.toString(i);
      switch (numAsString.length()) {
        case 1:
          if (isPrime(Integer.parseInt(numAsString))) sum++;
          break;
        case 2:
          a = numAsString.substring(0, 1);
          b = numAsString.substring(1, 2);
          if (isPrime(Integer.parseInt(a + b)) && isPrime(Integer.parseInt(b + a))) sum++;
        case 3:
          a = numAsString.substring(0, 1);
          b = numAsString.substring(1, 2);
          c = numAsString.substring(2, 3);
          if (isPrime(Integer.parseInt(a + b + c)) && isPrime(Integer.parseInt(b + c + a))
              && isPrime(Integer.parseInt(c + b + a)) && isPrime(Integer.parseInt(a + c + b))
              && isPrime(Integer.parseInt(b + a + c)) && isPrime(Integer.parseInt(c + a + b)))
            sum++;
        case 4:
          a = numAsString.substring(0, 1);
          b = numAsString.substring(1, 2);
          c = numAsString.substring(2, 3);
          d = numAsString.substring(3, 4);
          if (isPrime(Integer.parseInt(a + b + c + d))) ;

      }
    }

    System.out.println(sum);
  }

  public static boolean isPrime(final int n) {
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
