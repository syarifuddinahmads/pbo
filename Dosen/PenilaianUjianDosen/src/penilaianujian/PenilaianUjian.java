/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujian;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author udin
 */
public class PenilaianUjian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        Proses proses = new Proses() {};
        menuProgram:
        do {
            System.out.println("===== Program Penilaian Mahasiswa =====");
            System.out.println("Menu Program\n1.Input Nilai\n2.Tampilkan Data Nilai\n3.Edit Data\n4.Exit");
            System.out.print("Input Menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    proses.tambahNilai();
                    break;
                case 2:
                    proses.dataNilai();
                    break;
                case 3:
                    proses.editData();
                case 4:
                    System.exit(0);
                    System.out.println("Exit !");
                    break;
            }
        } while (menu != 4);
    }

}
