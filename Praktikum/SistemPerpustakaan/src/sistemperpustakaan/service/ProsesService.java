/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import sistemperpustakaan.DataPerpustakaan;
import sistemperpustakaan.model.Buku;
import sistemperpustakaan.model.Peminjam;
import sistemperpustakaan.model.User;

/**
 *
 * @author udin
 */
public class ProsesService extends ProsesServiceAbstract {

    Scanner input = new Scanner(System.in);

    @Override
    public void initDataBuku() {
        for (int i = 0; i < 10; i++) {
            Buku buku = new Buku((i + 1), "Buku " + (i + 1), "Pengarang " + (i + 1), "200" + i);
            DataPerpustakaan.BukuArr.add(buku);
        }
    }

    @Override
    public void register() {
        System.out.println("----- Register User -----");
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Username : ");
        String username = input.next();
        System.out.print("Password : ");
        String password = input.next();
        System.out.print("Alamat : ");
        String alamat = input.next();
        System.out.print("No Telp : ");
        String noTelp = input.next();
        User user = new User((DataPerpustakaan.UserArr.size() + 1), nama, username, password, alamat, noTelp);
        DataPerpustakaan.UserArr.add(user);
        System.out.println("Register User Berhasil !");
    }

    @Override
    public boolean login(String username, String Password) {
        boolean status = false;

        for (int i = 0; i < DataPerpustakaan.UserArr.size(); i++) {
            if (DataPerpustakaan.UserArr.get(i).getUsername().equals(username)) {
                status = DataPerpustakaan.UserArr.get(i).getPassword().equals(Password);
            } else {
                status = false;
            }
        }

        return status;
    }

    @Override
    public void daftarBuku() {
        for (int i = 0; i < DataPerpustakaan.BukuArr.size(); i++) {
            DataPerpustakaan.BukuArr.get(i).detailBuku();
        }
    }

    @Override
    public void pinjamBuku(User user) {
        System.out.print("Masukkan jumlah buku :");
        int jumlahBuku = input.nextInt();
        Buku[] bukuArr = new Buku[jumlahBuku];
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.print("Masukkan ID Buku : ");
            int bukuId = input.nextInt();
            for (int j = 0; j < DataPerpustakaan.BukuArr.size(); j++) {
                if (DataPerpustakaan.BukuArr.get(i).getIdBuku() == bukuId) {
                    bukuArr[i] = DataPerpustakaan.BukuArr.get(i);
                }
            }
        }
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-ddd");
        Calendar date = Calendar.getInstance();
        String datePinjam = formatDate.format(date.getTime());
        date.add(Calendar.DAY_OF_MONTH, 7);
        String dateKembali = formatDate.format(date.getTime());
        Peminjam peminjam = new Peminjam(bukuArr, user, datePinjam, dateKembali);
        DataPerpustakaan.PeminjamArr.add(peminjam);
        System.out.println("Pinjam buku berhasil !");
    }

    @Override
    public void daftarPinjam(String username) {
        System.out.println("----- Detail Peminjam -----");
        for (int i = 0; i < DataPerpustakaan.PeminjamArr.size(); i++) {
            if (!username.equals("")) {
                if (DataPerpustakaan.PeminjamArr.get(i).getUser().getUsername().equals(username)) {
                    DataPerpustakaan.PeminjamArr.get(i).detailPeminjam();
                    System.out.println("Tanggal Pinjam : "+DataPerpustakaan.PeminjamArr.get(i).getTglPinjam());
                    System.out.println("Tanggal Kembali : "+DataPerpustakaan.PeminjamArr.get(i).getTglKembali());
                    System.out.println("---- Detail Buku Pinjaman -----");
                    for (int j = 0; j < DataPerpustakaan.PeminjamArr.get(i).getBuku().length; j++) {
                        DataPerpustakaan.PeminjamArr.get(i).getBuku()[j].detailBuku();
                    }
                }
            } else {
                DataPerpustakaan.PeminjamArr.get(i).detailPeminjam();
                System.out.println("---- Detail Buku Pinjaman -----");
                for (int j = 0; j < DataPerpustakaan.PeminjamArr.get(i).getBuku().length; j++) {
                    DataPerpustakaan.PeminjamArr.get(i).getBuku()[j].detailBuku();
                }
            }
        }
    }

}
