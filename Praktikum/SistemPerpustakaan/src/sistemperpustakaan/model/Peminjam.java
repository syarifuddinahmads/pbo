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
public class Peminjam {
    Buku[] buku;
    User user;
    String tglPinjam;
    String tglKembali;

    public Peminjam(Buku[] buku, User user, String tglPinjam, String tglKembali) {
        this.buku = buku;
        this.user = user;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }  

    public Buku[] getBuku() {
        return buku;
    }

    public User getUser() {
        return user;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }
    
    public void detailPeminjam(){
        System.out.println("Nama : "+getUser().nama+"\nAlamat : "+getUser().Alamat+"\nNo Telp : "+getUser().getNoTelp());
    }
    
    
}
