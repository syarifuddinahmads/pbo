/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_5c;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_5c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nomor = 10;
        do {
            if (nomor % 2 == 0) {
                System.out.print(nomor + ",");
            }
            nomor--;
        } while (nomor > 0);
        System.out.print("\n");
    }

}
