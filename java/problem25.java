/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stepana.euler;

import java.math.BigInteger;

/**
 *
 * @author antonstepan
 */
public class problem25 {

    public static void main(String[] args) {

        BigInteger a;
        BigInteger currentFib = new BigInteger("0");
        BigInteger nextFib = new BigInteger("1");
        int term = 0;
        

        while (currentFib.toString().length() < 1000) {
            a = nextFib;
            nextFib = currentFib.add(nextFib);
            currentFib = a;
            term++;
            System.out.println(term);
        }
        System.out.println(term);
    }
}
