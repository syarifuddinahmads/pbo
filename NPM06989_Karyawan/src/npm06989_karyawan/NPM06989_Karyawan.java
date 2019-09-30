/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989_karyawan;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class NPM06989_Karyawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKaryawan;
        Karyawan[] listKaryawan = null;
        do {
            System.out.println("=========== Program Data Karyawan ===========");
            System.out.println("Menu Program : ");
            System.out.println("1. Input Karyawan");
            System.out.println("2. Show Data Karyawan");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan :");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Input Jumlah Karyawan : ");
                    jumlahKaryawan = input.nextInt();
                    listKaryawan = new Karyawan[jumlahKaryawan];
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        System.out.println("Input Karyawan Ke " + (i + 1) + " : ");
                        System.out.print("Nama : ");
                        String nama = input.next();
                        System.out.print("Jenis Kelamin (L/P) : ");
                        String jenisKelamin = input.next();
                        System.out.print("Berat Badan : ");
                        int beratBadan = input.nextInt();
                        Karyawan karyawan = new Karyawan(beratBadan, nama, jenisKelamin);
                        listKaryawan[i] = karyawan;
                    }
                    break;
                case 2:
                    System.out.println("============= Data Karyawan =============");
                    for (int i = 0; i < listKaryawan.length; i++) {
                        System.out.println("Karyawan - " + (i + 1) + listKaryawan[i].showKaryawan());
                    }
                    break;
                case 3:
                    System.out.println("Apakah anda akan keluar ? (Y/T)");
                    String exit = input.next();
                    if(exit.equals("Y") || exit.equals("y")){
                        System.exit(0);
                    }
                    if(exit.equals("T") || exit.equals("y")){
                        System.exit(1);
                    }
                    break;
            }

        } while (true);

    }

}
