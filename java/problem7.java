/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stepana.euler;

/**
 *
 * @author antonstepan
 */
public class problem7 {
    
    
    public static void main(String[] args) {
        
        int i = 1, j = 1, k = 1;
        loop:
        while(i != 10002) {
            
            if (isPrime(j)) {
                System.out.println(k + ".) " + j + " ");
                i++;
                k++;
            }
            j++;
        }
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

