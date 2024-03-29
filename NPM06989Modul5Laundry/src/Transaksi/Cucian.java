/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import Pengguna.Pegawai;
import Pengguna.Pelanggan;

/**
 *
 * @author udin
 */
public class Cucian{

    private Pegawai pegawai;
    private Pelanggan pelanggan;
    private float berat;
    private float hargaTotal;
    private float perKilo = 5000;

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
        this.berat = berat;
    }

    public float getHargaTotal(float berat) {
        this.berat = berat;
        return this.berat;
    }

    public float getHargaTotal(float berat, float perKilo) {
        return this.hargaTotal = berat * perKilo;
    }

    public void setHargaTotal(float hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public float getPerKilo() {
        return perKilo;
    }

    public void setPerKilo(float perKilo) {
        this.perKilo = perKilo;
    }

    public void print() {
        System.out.println("Nama Pegawai : " + this.getPegawai().getNama());
        System.out.println("Nama Pelanggan : " + this.getPelanggan().getNama());
        System.out.println("Berat Cucian : " + this.getBerat() + " KG.");
        System.out.println("Harga Total Cucian : " + this.getHargaTotal(this.getHargaTotal(berat), this.getPerKilo()));
    }

}
