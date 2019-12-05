/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan.model;

/**
 *
 * @author udin
 */
public class Buku {
    int idBuku;
    String judulBuku;
    String pengarang;
    String tahunTerbit;

    public Buku(int idBuku, String judulBuku, String pengarang, String tahunTerbit) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }
    
    public void detailBuku(){
        System.out.println("ID :"+getIdBuku()+"\nJudul : "+getJudulBuku()+"\nPengarang : "+getPengarang()+"\nTahun Terbit : "+getTahunTerbit());
        System.out.println("-----------------");
    }
}
