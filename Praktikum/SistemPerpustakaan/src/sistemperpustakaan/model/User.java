/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan.model;

/**
 *
 * @author udin
 */
public class User {
    int id;
    String nama;
    String username;
    String password;
    String Alamat;
    String noTelp;

    public User(int id,String nama, String username, String password, String Alamat, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.Alamat = Alamat;
        this.noTelp = noTelp;
    }

    public int getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }
    
    
}
