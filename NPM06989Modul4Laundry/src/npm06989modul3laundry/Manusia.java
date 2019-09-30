/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul3laundry;

/**
 *
 * @author udin
 */
public class Manusia {
    
    String nama;
    String noHp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
    public void print(){
        System.out.println("Nama : "+this.getNama());
        System.out.println("No Hp : "+this.getNoHp());
    }
    
}
