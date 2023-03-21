/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raniel.activity1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RanielActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner R = new Scanner(System.in);
        int I, E = 0, N;
        double A, w, k, v;
        A = R.nextDouble();
        w = Math.sqrt(A);
        for (I = 0; I <= w; I++) {
            E = I * I;
            if (E == A) {
                System.out.println("It is a perfect square because "+I+" multiplied by "+I+" is "+E);
            }
        }
        if(E!=A){
        N = I * I;       
        k = A - E;
        v = N - A;
        if (k > v) {
            System.out.println("It is not a Perfect Square but  The Nearest Perfect Square of The number is: " + N);
        } else {
            System.out.println("It is not a Perfect Square but  The Nearest Perfect Square of The number is: " + E);
        }
        }
	}
}
