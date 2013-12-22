/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stepana.euler;

/**
 *
 * @author antonstepan
 */
public class Problem10 {
    
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int i = 1;
        long res = 0;
        loop:
        while(i < 2000000) {
            
            if (isPrime(i)) {
                res += i;
            }
            i++;
        }
        System.out.println("Result: " + res);
        long end = System.currentTimeMillis();
        long dauer = end - start;
        System.out.println("Dauer: " + dauer + "ms <=> " + dauer/1000 + "sek" );

    }
    
    
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }
    
}

