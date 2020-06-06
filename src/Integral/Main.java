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
        double y = 1;

        for (double i = 0; i <= 0.2; i += 0.01) {

           if(y >= Math.sin(i)) {
               rectangle = Math.sin(i) * 0.01;
           }else {
               y *= 0.01;
               rectangle += y;
           }
            area += rectangle;
            System.out.println(area);
        }
        System.out.println("The area = " + area);
    }
}
