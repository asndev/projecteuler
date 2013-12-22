package de.stepana.euler;

import java.util.Arrays;

/*
 * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits,
 * but in a different order.
 * 
 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 * 
 * @author Anton Stepan
 */
public class Problem52 {

  public static void main(final String... args) {
    long i = 1;
    final Problem52 p = new Problem52();
    final long startTime = System.nanoTime();
    while (!p.findNumber(i)) {
      ++i;
    }
    final long endTime = System.nanoTime() - startTime;
    System.out.println(i + " in " + endTime / 1000000.0 + " ms.");
  }

  boolean findNumber(final long n) {
    return hasSameDigits(n, 2 * n) && hasSameDigits(n, 3 * n) && hasSameDigits(n, 4 * n)
        && hasSameDigits(n, 5 * n) && hasSameDigits(n, 6 * n);
  }

  boolean hasSameDigits(final long f, final long s) {

    final char[] first = String.valueOf(f).toCharArray();
    final char[] second = String.valueOf(s).toCharArray();
    if (first.length != second.length) return false;
    Arrays.sort(first);
    Arrays.sort(second);
    return Arrays.equals(first, second);
  }
}
