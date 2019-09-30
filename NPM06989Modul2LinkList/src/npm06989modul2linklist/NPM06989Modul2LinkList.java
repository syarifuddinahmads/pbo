/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul2linklist;

/**
 *
 * @author udin
 */
public class NPM06989Modul2LinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai karyawan = new Pegawai();
        karyawan.tambah(karyawan, 1, "andi", "programmer");
        karyawan.tambah(karyawan, 2, "budi", "designer");
        karyawan.tambah(karyawan, 3, "cici", "PM");
        karyawan.tambah(karyawan, 4, "didi", "programmer");
        karyawan.lihat(karyawan);
    }
    
}
