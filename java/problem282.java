/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pedemo;

import java.math.BigInteger;

/**
 *
 * @author antonstepan
 */
public class peDemo {

    public static void main(String[] args) {
		
		System.out.println("(1:1)" + acklow(1,1));
		System.out.println("(2:2)" + acklow(2,2));
		System.out.println("(3:3)" + acklow(3,3));
		System.out.println("(4:4)" + ack(new BigInteger("4"), new BigInteger("4")));
	}

	public static BigInteger hyper(BigInteger a, BigInteger n, BigInteger b) {
		if (n.compareTo(new BigInteger("1")) == 0) return a.modPow(b, new BigInteger("14").pow(8));
		if (b.compareTo(new BigInteger("0")) == 0) return new BigInteger("1");
		return hyper(a, n.subtract(new BigInteger("1")), hyper(a,n,b.subtract(new BigInteger("1"))));
	}

	public static BigInteger ack(BigInteger m, BigInteger n) {

		return hyper(new BigInteger("2"), m.subtract(new BigInteger("2")), (n.add(new BigInteger("3")))).subtract(new BigInteger("3"));
	}
	
	public static int acklow(int m, int n) {
		if (m==0) return n+1;
		if (n==0) return acklow(m-1,1);
		return acklow(m-1,acklow(m,n-1));
	}
}