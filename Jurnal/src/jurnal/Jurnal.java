/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Input : ");
        int input = in.nextInt();
        long fibonacci [] = new long[input];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        
        for(int i =2; i<input; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for(int i =0; i<input; i++){
            System.out.print(fibonacci[i] + " ");
        }
    }
    
}
