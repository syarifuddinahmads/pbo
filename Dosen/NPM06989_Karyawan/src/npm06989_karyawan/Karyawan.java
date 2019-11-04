/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989_karyawan;

/**
 *
 * @author udin
 */
public class Karyawan extends TinggiBeratBadan {

    String nama;
    String jenisKelamin;
    String statusIdeal;
    TinggiBeratBadan tbb = new TinggiBeratBadan();

    public Karyawan() {
    }

    public Karyawan(String nama, String jenisKelamin, int beratBadan, int tinggiBadan) {
        tbb.setBeratBadan(beratBadan);
        tbb.setTinggiBadan(tinggiBadan);
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.statusIdeal = this.idealCount(jenisKelamin);
    }

    public String showKaryawan() {
        return " Nama : " + nama + " | Tinggi Badan : " + tbb.getTinggiBadan() + " | Berat Badan : " + tbb.getBeratBadan() + " | Jenis Kelamin : " + jenisKelamin + " | Status Ideal : " + statusIdeal;
    }

    @Override
    public String idealCount(String jenisKelamin) {
        String statusIdeal = "Ideal";
        if (jenisKelamin.equals("L") || jenisKelamin.equals("l")) {
            if (super.getBeratBadan() >= 55 && super.getBeratBadan() <= 75) {
                statusIdeal = "Ideal";
            } else {
                statusIdeal = "Belum Ideal";
            }
        }

        if (jenisKelamin.equals("P") || jenisKelamin.equals("p")) {
            if (super.getBeratBadan() >= 45 && super.getBeratBadan() <= 55) {
                statusIdeal = "Ideal";
            } else {
                statusIdeal = "Belum Ideal";
            }
        }

        return statusIdeal;
    }

    public String idealCount() {
        String statusIdeal = "Ideal";
        if (super.getBeratBadan() >= 57 && super.getBeratBadan() <= 75) {
            statusIdeal = "Ideal";
        } else {
            statusIdeal = "Belum Ideal";
        }
        return statusIdeal;
    }

}
