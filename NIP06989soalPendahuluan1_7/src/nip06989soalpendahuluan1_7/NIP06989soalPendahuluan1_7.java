/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_7;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double diameter = 10;
        Lingkaran bulet = new Lingkaran(diameter);
        bulet.keliling();
        double LUAS = bulet.luas();
        System.out.println("Luas Lingkaran adalah "+LUAS);
        
    }
    
}
