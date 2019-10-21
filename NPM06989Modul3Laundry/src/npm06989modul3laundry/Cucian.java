/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul3laundry;

/**
 *
 * @author udin
 */
public class Cucian extends Manusia{
    
    Pegawai pegawai;
    Pelanggan pelanggan;
    float berat;
    float hargaTotal;

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat() * perKilo;
    }

    public float getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(float hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
    
}
