/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul4laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author udin
 */
public class NPM06989Modul5Laundry {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArray = new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArray = new ArrayList<>();
    static ArrayList<Cucian> cucianArray = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        do {

            System.out.println("\n\nSistem Informasi Laundry RPL !!!");
            tampilkanData();

            System.out.println("\n\nMenu :");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi Cucian");
            System.out.println("0. Selesai");

            System.out.print("Masukkan nomor menu : ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    tambahKasir();
                    break;
                case 2:
                    tambahPelanggan();
                    break;
                case 3:
                    tambahCucian();
                    break;
                case 0:
                    menu = 0;
                    System.out.println("Terimaksih tela menggunakan Sistem Informasi Laundry RPL !!!");
                    break;
            }

        } while (menu != 0);

    }

    static void tampilkanData() {

        System.out.println("\n\nData Pegawai : ");
        for (int i = 0; i < pegawaiArray.size(); i++) {
            pegawaiArray.get(i).print();
        }

        System.out.println("\n\nData Pelanggan : ");
        for (int i = 0; i < pelangganArray.size(); i++) {
            pelangganArray.get(i).print();
        }

        System.out.println("\n\nData Cucian : ");
        for (int i = 0; i < cucianArray.size(); i++) {
            cucianArray.get(i).print();
        }

    }

    static void tambahKasir() {
        System.out.println("Tambah Data Pegawai :");
        Pegawai pegawai = new Pegawai();
        System.out.println("ID Pegawai : " + String.valueOf(pegawaiArray.size() + 1));
        pegawai.setId(pegawaiArray.size() + 1);
        System.out.print("Nama Pegawai :");
        pegawai.setNama(scan.next());
        System.out.print("Kata Sandi Pegawai :");
        pegawai.setKataSandi(scan.next());
        System.out.print("Nomor HP Pegawai :");
        pegawai.setNoHp(scan.next());
        pegawaiArray.add(pegawai);
    }

    static void tambahPelanggan() {
        System.out.println("Tambah Data Pelanggan :");
        Pelanggan pelanggan = new Pelanggan();
        System.out.println("ID Pelanggan : " + String.valueOf(pelangganArray.size() + 1));
        pelanggan.setId(pelangganArray.size() + 1);
        System.out.print("Nama Pelanggan :");
        pelanggan.setNama(scan.next());
        System.out.print("Nomor HP Pelanggan :");
        pelanggan.setNoHp(scan.next());
        pelangganArray.add(pelanggan);
    }

    static void tambahCucian() {
        System.out.println("Tambah Data Cucian :");
        Cucian cucian = new Cucian();
        System.out.print("ID Pegawai : ");
        cucian.setPegawai(pegawaiArray.get(scan.nextInt() - 1));
        System.out.print("ID Pelanggan :");
        cucian.setPelanggan(pelangganArray.get(scan.nextInt() - 1));
        System.out.print("Berat Cucian (KG) :");
        cucian.setBerat(scan.nextFloat());
        System.out.print("Harga Totalnya adalah : Rp." + cucian.getHargaTotal(scan.nextFloat()));
        cucianArray.add(cucian);
    }

}
