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
public class TinggiBeratBadan {
    
    private int tinggiBadan;
    private int beratBadan;

    public TinggiBeratBadan() {
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public float getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }
    
    public String idealCount(String jenisKelamin){
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
    
}
