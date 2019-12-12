/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujianmahasiswa.model;

/**
 *
 * @author udin
 */
public class Nilai {
    
    private Mahasiswa mahasiswa;
    private Matakuliah[] matakuliah;

    public Nilai(Mahasiswa mahasiswa, Matakuliah[] matakuliah) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMatakuliah(Matakuliah[] matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Matakuliah[] getMatakuliah() {
        return matakuliah;
    }    
    
    
}
