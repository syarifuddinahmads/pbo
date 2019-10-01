/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul4laundry;

/**
 *
 * @author udin
 */
public class Pegawai extends Manusia{
    
    int id;
    String kataSandi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }
    
    @Override
    public void print(){
        System.out.println("ID Pegawai : "+this.getId()); 
        System.out.println("Nama : "+this.getNama());
        System.out.println("No Hp : "+this.getNoHp());
    }
    
}
