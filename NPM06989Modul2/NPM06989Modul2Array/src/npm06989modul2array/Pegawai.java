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
public class Pegawai {
    
    int nip;
    String nama;
    String jabatan;

    public Pegawai(int nip, String nama, String jabatan) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
    }
    
    public String show(){
        return "NIP : "+nip+" | Nama : "+nama+" | Jabatan : "+jabatan;
    }
    
}
