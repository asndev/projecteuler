/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package de.stepana.euler;

import java.math.BigInteger;

/**
 * 
 * @author antonstepan
 */
public class problem282 {

  public static void main(final String[] args) {

    /*
     * System.out.println("()" + // A(5,5) = A(4(5,4)) = A(4, A(4, A(5,3))) // = A(4, A(4,
     * A(4,A(5,2))) // = A(4, A(4, A(4,A(4,A(5,1))) ack( new BigInteger("4"), ack(new
     * BigInteger("4"), ack(new BigInteger("4"), ack(new BigInteger("4"), ack(new BigInteger("5"),
     * new BigInteger("1"))))) ) );
     */
    // int res = acklow(1,1) + acklow(2,2) + acklow(3,3);
    // BigInteger result = ack(new BigInteger("4"), new BigInteger("4")).multiply(new
    // BigInteger("3"));
    // BigInteger finalResult = result.add(new BigInteger(Integer.toString(res)));
    // System.out.println(finalResult);

    // A(4, A(5, n-1))
    System.out.println(ack(new BigInteger("4"), new BigInteger("4")));

  }

  public static BigInteger hyper(final BigInteger a, final BigInteger n, final BigInteger b) {
    if (n.compareTo(new BigInteger("1")) == 0) return a.modPow(b, new BigInteger("14").pow(8));
    if (b.compareTo(new BigInteger("0")) == 0) return new BigInteger("1");
    return hyper(a, n.subtract(new BigInteger("1")), hyper(a, n, b.subtract(new BigInteger("1"))));
  }

  public static BigInteger ack(final BigInteger m, final BigInteger n) {

    return hyper(new BigInteger("2"), m.subtract(new BigInteger("2")), n.add(new BigInteger("3")))
        .subtract(new BigInteger("3"));
  }

  public static int acklow(final int m, final int n) {
    if (m == 0) return n + 1;
    if (n == 0) return acklow(m - 1, 1);
    return acklow(m - 1, acklow(m, n - 1));
  }
}
