/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_6;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Diameter Meter : ");
        double dm = input.nextDouble();
        
        menu();
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                procedureLuasLingkaran(dm);
                break;
            case 2:
                double luas = fungsiLuasLingkaran(dm);
                System.out.println("Luas Lingkaran = "+luas);
                break;
            case 3:
                double hasil[] = fungsiLingkaran(dm);
                System.out.println("Luas Lingkaran adalah "+hasil[0]);
                System.out.println("Keliling Lingkaran adalah "+hasil[1]);
                break;
            case 4:
                System.out.print("Masukkan tinggi(meter) : ");
                int tinggi = input.nextInt();
                double volume = fungsiTabung(dm, tinggi);
                double konversi = volume*100;
                System.out.println("Volume tabung adalah "+konversi+"(cm^3)");
                break;
        }
    }
    
    static void menu(){
        System.out.println("==============================");
        System.out.println("1. Prosedure Luas Lingkaran");
        System.out.println("2. Fungsi Luas Lingkaran");
        System.out.println("3. Fungsi Bangun Lingkaran");
        System.out.println("4. Fungsi Bangun Tabung");
    }
    
    static void procedureLuasLingkaran(double diameter){
        double jari = diameter/2;
        double luas = jari*3.14*3.14;
        System.out.println("Luas Persegi adalah "+luas);
    }
    
    static double fungsiLuasLingkaran(double diameter){
        double jari = diameter/2;
        double luas = jari*3.14*3.14;
        return luas;
    }
    
    static double[] fungsiLingkaran(double diameter){
        double[] hasil = new double[2];
        double jari = diameter/2;
        double luas = jari*3.14*3.14;
        double keliling = jari*2*3.14;
        hasil[0] = luas;
        hasil[1] = keliling;
        return hasil;
    }
    
    static double fungsiTabung(double d, int t){
        double jari = d/2;
        double luas = jari*2*3.14*3.14;
        double volume = luas*t;
        return volume;
    }
    
}
