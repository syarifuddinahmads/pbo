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
public class Matakuliah {
    private String namaMatkul;
    private int nilaiMatkul;

    public Matakuliah(String namaMatkul, int nilaiMatkul) {
        this.namaMatkul = namaMatkul;
        this.nilaiMatkul = nilaiMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setNilaiMatkul(int nilaiMatkul) {
        this.nilaiMatkul = nilaiMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getNilaiMatkul() {
        return nilaiMatkul;
    }
    
    
}
