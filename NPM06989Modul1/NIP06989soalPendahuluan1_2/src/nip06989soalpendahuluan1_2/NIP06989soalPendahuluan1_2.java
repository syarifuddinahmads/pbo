/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_2;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input diameter lingkaran : ");
        int diameter = input.nextInt();
        double pi = 3.14;
        double luas = diameter/2*pi*pi;
        System.out.println("Luas Lingkaran = "+luas);
    }
    
}
