/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujian;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class Proses extends AbstractProses {

    DataNilai[] dataNilai = new DataNilai[100];
    Scanner input = new Scanner(System.in);

    @Override
    public void tambahNilai() {
        System.out.print("Input Jumlah Mahasiswa : ");
        int jumlahMhs = input.nextInt();
        MataKuliah[][] matkulList = new MataKuliah[100][2];
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Mahasiswa Ke - " + (i + 1));
            System.out.print("Nama Mahasiswa = ");
            String nama = input.next();
            System.out.println("Input Nilai Matakuliah :");
            System.out.print("SO : ");
            int SO = input.nextInt();
            MataKuliah so = new MataKuliah("SO", SO);
            matkulList[i][0] = so;
            System.out.print("PBO : ");
            int PBO = input.nextInt();
            MataKuliah pbo = new MataKuliah("PBO", PBO);
            matkulList[i][1] = pbo;
            Mahasiswa mhs = new Mahasiswa((i + 1), nama, matkulList);
            dataNilai[i] = new DataNilai(mhs);
        }
    }

    @Override
    public void dataNilai() {
        System.out.println("========== DATA NILAI ==========");
        for (int i = 0; i < dataNilai.length; i++) {
            if (dataNilai[i] != null) {
                System.out.println("NPM : " + dataNilai[i].mahasiswa.npm + " Nama : " + dataNilai[i].mahasiswa.nama);
                for (int j = 0; j < dataNilai[i].mahasiswa.mataKuliah[i].length; j++) {
                    System.out.println("Matkul : " + dataNilai[j].mahasiswa.mataKuliah[i][j].namaMatkul + " Nilai : " + dataNilai[j].mahasiswa.mataKuliah[i][j].nilai);
                }
                System.out.println("----------------------------------");
            } else {
                break;
            }
        }
    }

    @Override
    public void editData() {
        int statusNextEdit = 1;
        do {
            System.out.println("========== DATA NILAI ==========");
            for (int i = 0; i < dataNilai.length; i++) {
                if (dataNilai[i] != null) {
                    System.out.println("NPM : " + dataNilai[i].mahasiswa.npm + " Nama : " + dataNilai[i].mahasiswa.nama);
                    for (int j = 0; j < dataNilai[i].mahasiswa.mataKuliah[i].length; j++) {
                        System.out.println("Matkul : " + dataNilai[j].mahasiswa.mataKuliah[i][j].namaMatkul + " Nilai : " + dataNilai[j].mahasiswa.mataKuliah[i][j].nilai);
                    }
                    System.out.println("----------------------------------");
                } else {
                    break;
                }
            }
            System.out.print("Edit data nilai \nInput NPM : ");
            int npmInput = input.nextInt();
            for (int i = 0; i < dataNilai.length; i++) {
                if (dataNilai[i] != null) {
                    if (dataNilai[i].mahasiswa.npm == npmInput) {
                        System.out.print("Input Nama Mahasiswa : ");
                        String nmMhs = input.next();
                        System.out.println("Input nilai : ");
                        System.out.print("SO : ");
                        int soInput = input.nextInt();
                        System.out.print("PBO : ");
                        int pboInput = input.nextInt();
                        System.out.println("Apakah anda akan mengupdate data nilai ? (y/t)");
                        String next = input.next();
                        if (next.equals("y") || next.equals("Y")) {
                            dataNilai[i].mahasiswa.nama = nmMhs;
                            dataNilai[i].mahasiswa.mataKuliah[i][0].nilai = soInput;
                            dataNilai[i].mahasiswa.mataKuliah[i][1].nilai = pboInput;
                            System.out.println("Update nilai berhasil !");
                            System.out.println("Apakah anda lanjut edit nilai ? (y/t)");
                            String nextEdit = input.next();
                            if (nextEdit.equals("y") || nextEdit.equals("Y")) {
                                statusNextEdit = 1;
                            } else {
//                                continue menuProgram;
                            }
                        } else {
                            System.out.println("Update nilai dibatalkan !");
                        }
//                        continue menuProgram;
                    }
                }
            }
        } while (statusNextEdit != 0);
    }
}
