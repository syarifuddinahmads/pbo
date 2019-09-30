/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul2array;

/**
 *
 * @author udin
 */
public class NPM06989Modul2Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai[] listPegawai = new Pegawai[4];
        Pegawai pegawai1 = new Pegawai(1, "Andi", "Programmer");
        Pegawai pegawai2 = new Pegawai(2, "Budi", "Designer");
        Pegawai pegawai3 = new Pegawai(3, "Cici", "PM");
        Pegawai pegawai4 = new Pegawai(4, "Didi", "Programmer");
        listPegawai[0] = pegawai1;
        listPegawai[1] = pegawai2;
        listPegawai[2] = pegawai3;
        listPegawai[3] = pegawai4;
        
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println("---"+listPegawai[i].show());;
        }
    }
    
}
