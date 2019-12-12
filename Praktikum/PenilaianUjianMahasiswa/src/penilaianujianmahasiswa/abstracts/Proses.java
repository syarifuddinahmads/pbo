/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujianmahasiswa.abstracts;

import java.util.Scanner;
import penilaianujianmahasiswa.data.Data;
import penilaianujianmahasiswa.model.Mahasiswa;
import penilaianujianmahasiswa.model.Matakuliah;
import penilaianujianmahasiswa.model.Nilai;

/**
 *
 * @author udin
 */
public class Proses extends AbstractProses {

    static Scanner input = new Scanner(System.in);

    @Override
    public void inputNilai() {
        System.out.println(" === Input Nilai === ");
        System.out.print("NPM : ");
        int npm = input.nextInt();
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Semester : ");
        int semester = input.nextInt();
        Mahasiswa mahasiswa = new Mahasiswa(nama, npm, semester);
        System.out.println("Nilai");
        System.out.print("PBO : ");
        int pbo = input.nextInt();
        System.out.print("SO : ");
        int so = input.nextInt();
        Matakuliah[] matakuliah = new Matakuliah[2];
        matakuliah[0] = new Matakuliah("PBO", pbo);
        matakuliah[1] = new Matakuliah("SO", so);
        Data.nilaiArr[Data.indexNilai] = new Nilai(mahasiswa, matakuliah);
        Data.indexNilai += 1;
    }

    @Override
    public void viewNilai() {
        for (int i = 0; i < Data.indexNilai; i++) {
            System.out.println("Npm : "+Data.nilaiArr[i].getMahasiswa().getNpmMhs());
            System.out.println("Nama : "+Data.nilaiArr[i].getMahasiswa().getNamaMhs());
            System.out.println("Semester : "+Data.nilaiArr[i].getMahasiswa().getSemesterMhs());
            for (int j = 0; j < 2; j++) {
                System.out.println("Matakuliah : "+Data.nilaiArr[i].getMatakuliah()[j].getNamaMatkul());
                System.out.println("Nilai : "+Data.nilaiArr[i].getMatakuliah()[j].getNilaiMatkul());
            }
        }
    }

}
