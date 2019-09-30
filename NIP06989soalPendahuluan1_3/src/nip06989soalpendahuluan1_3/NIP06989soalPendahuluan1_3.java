/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_3;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diameter : ");
        double diameter = input.nextDouble();
        System.out.print("Tinggi : ");
        double tinggi = input.nextDouble();
        double pi = 3.14;
        double volume = diameter/2*pi*pi*tinggi;
        System.out.println("Output program");
        System.out.println("Volume tabung adalah "+volume);
    }
    
}
