/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooracer;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class ZooRacer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarakTempuh  = 10;
        Kelinci kelinci = new Kelinci();
        KuraKura kuraKura = new KuraKura();
        Singa singa = new Singa();
        do {
            menu();
            int menuInput = input.nextInt();
            switch (menuInput) {
                case 1:
                    System.out.print("Kecepatan Kelinci (KM/s) : ");
                    int kecepatanKelinci = input.nextInt();
                    kelinci.setNama("Kelinci");
                    kelinci.setKecepatanLari(kecepatanKelinci);
                    System.out.print("Kecepatan Kura-kura (KM/s) : ");
                    int kecepatanKura = input.nextInt();
                    kuraKura.setNama("Kura-kura");
                    kuraKura.setKecepatanLari(kecepatanKura);
                    System.out.print("Kecepatan Singa (KM/s) : ");
                    int kecepatanSinga = input.nextInt();
                    singa.setNama("Singa");
                    singa.setKecepatanLari(kecepatanSinga);
                    break;
                case 2:
                    System.out.println("Lomba sudah dimulai...");
                    
                    break;
                case 3:
                    System.out.println("Waktu Tempuh "+kelinci.getNama()+" : "+kelinci.hitungKecepatan(jarakTempuh, kelinci.getKecepatanLari()));
                    System.out.println("Waktu Tempuh "+kuraKura.getNama()+" : "+kuraKura.hitungKecepatan(jarakTempuh, kuraKura.getKecepatanLari()));
                    System.out.println("Waktu Tempuh "+singa.getNama()+" : "+singa.hitungKecepatan(jarakTempuh, singa.getKecepatanLari()));
                    break;
                case 4:

                    break;
            }

        } while (true);
    }

    public static void menu() {
        System.out.println("======= Selamat Datang Di Game ZOO Racer ========");
        System.out.println("=== Menu Program ===");
        System.out.println("1. Masukkan nilai kecepatan (1-10)");
        System.out.println("2. Mulai Lomba");
        System.out.println("3. Lihat Pemenang");
        System.out.println("4. Keluar");
        System.out.print("Masukkan menu : ");
    }

}
