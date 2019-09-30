/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_8;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran bulet = new Lingkaran();
        double diameter = 10;
        bulet.setDiameter(diameter);
        bulet.keliling();
        double LUAS = bulet.luas();
        System.out.println("Luas Lingkaran adalah "+LUAS);
    }
    
}
