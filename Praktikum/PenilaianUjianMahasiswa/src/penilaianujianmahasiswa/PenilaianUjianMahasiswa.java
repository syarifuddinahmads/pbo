/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujianmahasiswa;

import java.util.Scanner;
import penilaianujianmahasiswa.abstracts.Proses;

/**
 *
 * @author udin
 */
public class PenilaianUjianMahasiswa {

    static Scanner input = new Scanner(System.in);
    static Proses proses = new Proses();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            System.out.println("Login");
            System.out.print("Username : ");
            String username = input.next();
            System.out.print("Password : ");
            String password = input.next();
            if (username.equals("dosen") && password.equals("dosen")) {
                int menu = 0;
                do {
                    System.out.println("Menu : ");
                    System.out.println("1. Input nilai");
                    System.out.println("2. View nilai");
                    System.out.println("0. Exit");
                    menu = input.nextInt();
                    switch (menu) {
                        case 1:
                            proses.inputNilai();
                            break;
                        case 2:
                            proses.viewNilai();
                            break;
                        case 0:
                            System.exit(0);
                    }

                } while (menu != 0);

            } else {
                System.out.println("Username atau Password salah !");
            }
        } while (true);

    }

}
