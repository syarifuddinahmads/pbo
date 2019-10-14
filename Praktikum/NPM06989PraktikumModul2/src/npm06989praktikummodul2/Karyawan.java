/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989praktikummodul2;

import java.util.Scanner;

/**
 *
 * @author udin
 */
class Karyawan {

    public static class node {

        String nama;
        String jabatan;
        String alamat;
        float jumlahGaji;
        node prev;
        node next;

        node(String nama, String jabatan, String alamat, float jumlahGaji) {
            this.nama = nama;
            this.jabatan = jabatan;
            this.alamat = alamat;
            this.jumlahGaji = jumlahGaji;
            this.prev = null;
            this.next = null;
        }

    }

    node head;
    node tail;

    void tambah(Karyawan list, String nama, String jabatan, String alamat, float jumlahGaji) {
        node karyawan = new node(nama, jabatan, alamat, jumlahGaji);
        if (list.head == null) {
            list.head = karyawan;
            list.tail = karyawan;
        } else {
            karyawan.next = list.tail;
            karyawan.prev = null;
            list.tail.prev = karyawan;
            list.tail = karyawan;
        }
    }

    void show(Karyawan list) {
        node listView = list.tail;
        System.out.println("====== DATA KARYAWAN ======");
        while (listView != null) {
            System.out.println(
                    "Nama : " + listView.nama
                    + "\nJabatan : " + listView.jabatan
                    + "\nAlamat : " + listView.alamat
                    + "\nJumlah Gaji :" + listView.jumlahGaji
            );
            listView = listView.next;
        }
        System.out.println("==========================");
    }

    void delete(Karyawan list, String q) {
        node listView = list.tail;
        Scanner input = new Scanner(System.in);
        if (listView == null) {
            System.out.println("Data karyawan tidak tersedia !");
        } else {
            while (listView != null) {
                if (listView.nama.equals(q)) {
                    System.out.println(detailKaryawan(listView));
                    System.out.println("Delete Karyawan : ");
                    int statusNext = 1;
                    do {
                        System.out.println("Delete data karyawan (y/t) ?");
                        System.out.print("Masukkan kode : ");
                        String kode = input.next();
                        if (kode.equals("y")) {
                            // front or top
                            if (listView.prev == null) {
                                System.out.println("Front");
                                node temp = head.next;
                                temp.next.prev = head.prev;
                                head.next = temp.next;
                            }
                            // mid or center
                            if (listView.prev != null && listView.next != null) {
                                listView.prev.next = listView.next;
                                listView.next.prev = listView.prev;
                            }
                            // last or end
                            if (listView.next == null) {
                                System.out.println("Last");
                                listView.prev.next = tail.next;
                                tail.prev = listView;
                            }
                            System.out.println("Delete data karyawan berhasil !");
                        } else if (kode.equals("t")) {
                            statusNext = 0;
                            System.out.println("Delete data karyawan dibatalkan !");
                            break;
                        } else {
                            System.out.println("Input tidak valid, Masukkan y/t untuk konfirmasi.");
                        }
                    } while (statusNext != 1);
                }
                listView = listView.next;
            }
        }
    }

    void edit(Karyawan list, String q) {
        node listView = list.tail;
        Scanner input = new Scanner(System.in);
        if (listView == null) {
            System.out.println("Data karyawan tidak tersedia !");
        } else {
            while (listView != null) {
                if (listView.nama.equals(q)) {
                    System.out.println(detailKaryawan(listView));
                    System.out.println("Edit Karyawan : ");
                    System.out.print("Nama : ");
                    String nama = input.next();
                    System.out.print("Jabatan : ");
                    String jabatan = input.next();
                    System.out.print("Alamat : ");
                    String alamat = input.next();
                    System.out.print("Jumlah Gaji : ");
                    float jumlahGaji = input.nextFloat();
                    int statusNext = 1;
                    do {
                        System.out.println("Simpan & update data karyawan (y/t) ?");
                        System.out.print("Masukkan kode : ");
                        String kode = input.next();
                        if (kode.equals("y")) {
                            listView.nama = nama;
                            listView.jabatan = jabatan;
                            listView.alamat = alamat;
                            listView.jumlahGaji = jumlahGaji;
                            System.out.println("Update data karywan berhasil !");
                        } else if (kode.equals("t")) {
                            statusNext = 0;
                            System.out.println("Update data karywan dibatalkan !");
                        } else {
                            System.out.println("Input tidak valid, Masukkan y/t untuk konfirmasi.");
                        }
                    } while (statusNext != 1);
                }
                listView = listView.next;
            }
        }
    }

    public String detailKaryawan(node karyawan) {
        return "Detail Karyawan\nNama : " + karyawan.nama + "\nJabatan : " + karyawan.jabatan + "\nAlamat : " + karyawan.alamat + "\nJumlah Gaji : " + karyawan.jumlahGaji;
    }

}
