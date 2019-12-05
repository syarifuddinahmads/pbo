/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan.service;

import sistemperpustakaan.model.User;

/**
 *
 * @author udin
 */
public abstract class ProsesServiceAbstract {

    public void initDataBuku() {
    }

    public void daftarBuku() {
    }

    public void register() {
    }

    public boolean login(String username, String Password) {
        return true;
    }

    public void pinjamBuku(User user) {
    }

    public void daftarPinjam(String username) {
    }
}
