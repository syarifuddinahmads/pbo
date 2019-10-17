/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989praktikummodul2;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class Karyawan {

    String nama;
    String jabatan;
    String alamat;
    float jumlahGaji;
    Karyawan prev;
    Karyawan next;

    Karyawan(String nama, String jabatan, String alamat, float jumlahGaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.jumlahGaji = jumlahGaji;
        this.prev = null;
        this.next = null;
    }
}
