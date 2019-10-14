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
public class Karyawan {
    int beratBadan;
    String nama;
    String jenisKelamin;
    String statusIdeal;   

    public Karyawan(int beratBadan, String nama, String jenisKelamin) {
        this.beratBadan = beratBadan;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.statusIdeal = idealCount(beratBadan, jenisKelamin);
    }
    
    public String idealCount(int beratBadan, String jenisKelamin){
        String statusIdeal = "Ideal";
        if(jenisKelamin.equals("L") || jenisKelamin.equals("l")){
            if(beratBadan >= 57 && beratBadan <= 70){
                statusIdeal = "Ideal";
            }else{
                statusIdeal = "Belum Ideal";
            }
        }
        
        if(jenisKelamin.equals("P") || jenisKelamin.equals("p")){
            if(beratBadan >= 52 && beratBadan <= 66){
                statusIdeal = "Ideal";
            }else{
                statusIdeal = "Belum Ideal";
            }
        }
        
        return statusIdeal;
    }
    
    public String showKaryawan() {
        return " Nama : "+nama +" | Berat Badan : "+beratBadan+ " | Jenis Kelamin : "+jenisKelamin+ " | Status Ideal : "+statusIdeal;
    }
    
    
}
