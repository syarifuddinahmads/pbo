/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;

import java.util.Scanner;
import sistemperpustakaan.service.ProsesService;

/**
 *
 * @author udin
 */
public class SistemPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProsesService prosesService = new ProsesService();
        prosesService.initDataBuku();
        do {
            System.out.println("----- Sistem Informasi Perpustakaan -----");
            System.out.println("1.Register\n2.Login\n0.Exit");
            System.out.print("Masukkan Menu : ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    prosesService.register();
                    break;
                case 2:
                    login:
                    do {
                        System.out.println("--- Login ---");
                        System.out.print("Username : ");
                        String username = scanner.next();
                        System.out.print("Password : ");
                        String password = scanner.next();
                        if (prosesService.login(username, password)) {
                            do {
                                System.out.println("1.Pinjam Buku\n2.Lihat Detail Pinjaman\n0.Exit");
                                System.out.print("Masukkan Menu : ");
                                int menuPinjam = scanner.nextInt();
                                switch (menuPinjam) {
                                    case 1:
                                        prosesService.daftarBuku();
                                        for (int i = 0; i < DataPerpustakaan.UserArr.size(); i++) {
                                            if(DataPerpustakaan.UserArr.get(i).getUsername().equals(username)){
                                                prosesService.pinjamBuku(DataPerpustakaan.UserArr.get(i));
                                            }
                                        }
                                        break;
                                    case 2:
                                        prosesService.daftarPinjam(username);
                                        break;
                                }
                            } while (true);
                        } else {
                            System.out.println("Username & Password Salah !");
                        }
                    } while (true);
            }
        } while (true);
    }

}
