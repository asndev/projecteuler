/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stepana.euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author antonstepan
 */
public class problem359 {

    public static void main(String[] args) {


        //System.out.println(getDivider(1).toString());
        Stack[] FloorAndRooms = new Stack[101];

        for (int i = 0; i < 101; i++) {

            FloorAndRooms[i] = new Stack();
        }

        for (int i = 1; i < 100; i++) {
            hilbert(i, 1, FloorAndRooms);
        }

        for (int i = 1; i < 20; i++) {
            System.out.println(FloorAndRooms[i].toString());
        }
    }

    /**
     * 
     * @param p
     * @param floor
     * @param MainArray 
     */
    public static void hilbert(int p, int floor, Stack[] MainArray) {

        boolean passed = false;
        if (MainArray[floor].empty()) {
            MainArray[floor].push(p);
            passed = true;
        }

        if (!passed) {

            long perfectSquare = (long) (Math.sqrt(p + (int) MainArray[floor].lastElement()));

            if ((perfectSquare * perfectSquare) == (p + (int) MainArray[floor].lastElement())) {

                MainArray[floor].push(p);
                passed = true;
            }
        }

        if (!passed) {
            hilbert(p, floor + 1, MainArray);
        }

    }

    public static Stack getDivider(int number) {

        BigInteger euler = new BigInteger("71328803586048");
        Stack divider = new Stack();

        BigInteger i = new BigInteger("1");
        BigInteger j = new BigInteger("1");
        BigInteger max = euler.divide(new BigInteger("4"));

        while (i != max) {
            System.out.println(i.toString());
            while (j != max) {
                if (i.multiply(j) == euler) {
                    divider.push(i);
                    divider.push(j);
                }
                j = j.add(new BigInteger("1"));
                System.out.println(j.toString());
            }
            i = i.add(new BigInteger("1"));
            System.out.println("i = " + i.toString());
        }

        return divider;
    }
}
