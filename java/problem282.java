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
public class problem282 {
    
    
    public static void main(String[] args) {
        
        BigInteger result = new BigInteger("0");
        for (int i = 0; i <= 6; i++) {
            System.out.println("i = " + i);
            result = result.add(ack(new BigInteger(Integer.toString(i)), new BigInteger(Integer.toString(i))));
        }
        System.out.println("result: " + result);
        result = result.mod((new BigInteger("14").pow(8)));
        System.out.println("final result: " + result);
    }
    
    
    public static BigInteger ack(BigInteger m, BigInteger n) {
        
        if (m.toString() == "0") return n.add(new BigInteger("1"));
        if (n.toString() == "0") return ack(m.subtract(new BigInteger("1")), new BigInteger("1"));
        if (m.compareTo((new BigInteger("14").pow(8))) > 0) {
            m = m.mod((new BigInteger("14").pow(8)));
        };
        if (n.compareTo((new BigInteger("14").pow(8))) > 0) {
            n = n.mod((new BigInteger("14").pow(8)));
        };
        return ack(m.subtract(new BigInteger("1")), ack(m, n.subtract(new BigInteger("1"))));
    }
}
