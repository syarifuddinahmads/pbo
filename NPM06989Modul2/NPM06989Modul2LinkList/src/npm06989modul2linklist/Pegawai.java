/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul2linklist;

/**
 *
 * @author udin
 */
public class Pegawai {

    private static class Node {

        int nip;
        String nama;
        String jabatan;
        Node next;
        Node prev;

        Node(int a, String b, String c) {
            this.nip = a;
            this.nama = b;
            this.jabatan = c;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    void tambah(Pegawai list, int a, String nama, String jabatan) {

        Node data_pegawai = new Node(a, nama, jabatan);
        if (list.head == null) {
            list.head = data_pegawai;
            list.tail = data_pegawai;
        }else{
            data_pegawai.next = list.tail;
            data_pegawai.prev = null;
            list.tail.prev = data_pegawai;
            list.tail = data_pegawai;
        }

    }
    
    void lihat(Pegawai list){
        Node view = list.tail;
        System.out.println("========== Data Pegawai ============");
        while(view != null){
            System.out.println(view.nama+"->"+view.jabatan);
            view = view.next;
        }
        System.out.println("====================================");
    }
    
    

}
