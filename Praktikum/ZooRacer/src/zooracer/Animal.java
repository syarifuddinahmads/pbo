/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooracer;

/**
 *
 * @author udin
 */
abstract class Animal {
    String nama;
    int kecepatanLari;

    public Animal() {
    }

    public Animal(String nama, int kecepatanLari) {
        this.nama = nama;
        this.kecepatanLari = kecepatanLari;
    }

    public int getKecepatanLari() {
        return kecepatanLari;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKecepatanLari(int kecepatanLari) {
        this.kecepatanLari = kecepatanLari;
    }
    
    public int hitungKecepatan(int jarak,int kecepatanLari){
        int hasil = kecepatanLari / jarak;
        return hasil;
    }
}
