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
public class NPM06989PraktikumModul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataKaryawan dataKaryawan = new DataKaryawan();
        String nama;
        String jabatan;
        String alamat;
        float jumlahGaji;
        System.out.println("Menu Program Karyawan");
        do {
            System.out.println("1.Tambah Karyawan \n2.Show Karyawan \n3.Edit Karyawan \n4.Delete Karyawan \n5.Exit");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Jumlah Karyawan : ");
                    int jumlahKaryawan = input.nextInt();
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        System.out.println("Karyawan Ke - " + (i + 1));
                        System.out.print("Nama : ");
                        nama = input.next();
                        System.out.print("Jabatan : ");
                        jabatan = input.next();
                        System.out.print("Alamat : ");
                        alamat = input.next();
                        System.out.print("Jumlah Gaji : ");
                        jumlahGaji = input.nextFloat();
                        dataKaryawan.tambah(dataKaryawan, nama, jabatan, alamat, jumlahGaji);
                    }
                    break;
                case 2:
                    dataKaryawan.show(dataKaryawan);
                    break;
                case 3:
                    System.out.println("Edit Karyawan ");
                    System.out.print("Input nama karyawan : ");
                    nama = input.next();
                    dataKaryawan.edit(dataKaryawan, nama);
                    break;
                case 4:
                    System.out.println("Hapus Karyawan ");
                    System.out.print("Input nama karyawan : ");
                    nama = input.next();
                    dataKaryawan.delete(dataKaryawan, nama);
                    break;
                case 5:
                    System.out.println("Keluar !");
                    System.exit(0);
                    break;

            }

        } while (true);
    }

}
