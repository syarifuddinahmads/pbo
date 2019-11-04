/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujian;

import java.util.ArrayList;

/**
 *
 * @author udin
 */
public class Mahasiswa {
    int npm;
    String nama;
    MataKuliah[][] mataKuliah;

    public Mahasiswa(int npm, String nama, MataKuliah[][] mataKuliah) {
        this.npm = npm;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }
    
}
