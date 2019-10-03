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
public class Karyawan extends TinggiBeratBadan{
    String nama;
    String jenisKelamin;
    String statusIdeal;   
    TinggiBeratBadan tbb = new TinggiBeratBadan();

    public Karyawan(String nama, String jenisKelamin,int beratBadan,int tinggiBadan) {
        tbb.setBeratBadan(beratBadan);
        tbb.setTinggiBadan(tinggiBadan);
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.statusIdeal = tbb.idealCount(jenisKelamin);
    }
    
    public String showKaryawan() {
        return " Nama : "+nama+ " | Tinggi Badan : "+tbb.getTinggiBadan()+" | Berat Badan : "+tbb.getBeratBadan()+ " | Jenis Kelamin : "+jenisKelamin+ " | Status Ideal : "+statusIdeal;
    }
    
    
}
