/**
 * Classname Main
 * <p>
 * Version info 1
 * <p>
 * Copyright Alyona Sviridova NTU KhPI
 */

package Integral;


public class Main {

    public static void main (String[] args) {

        double area = 0;
        double rectangle = 0;

        for (double i = 0; i < 0.2; i += 0.01) {

            rectangle = Math.sin(i) * 0.01;
            area += rectangle;

        }
        System.out.println("The area = " + area);
    }
}
