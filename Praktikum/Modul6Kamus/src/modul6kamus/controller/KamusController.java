/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6kamus.controller;

import modul6kamus.data.Data;
import modul6kamus.model.Kamus;

/**
 *
 * @author udin
 */
public class KamusController {

    public void insertDataKamus() {

        Kamus k = new Kamus("baju", "dress", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Data.kamusArr.add(k);
        Kamus k1 = new Kamus("kambing", "goat", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Data.kamusArr.add(k1);
        Kamus k2 = new Kamus("laki-laki", "man", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Data.kamusArr.add(k2);
        Kamus k3 = new Kamus("hitam", "black", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Data.kamusArr.add(k3);
        Kamus k4 = new Kamus("kursi", "chair", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Data.kamusArr.add(k4);
        Kamus k5 = new Kamus("papan tulis", "whiteboard", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Data.kamusArr.add(k5);

    }

    public String searchWord(String q, int status) {
        String text = null;

        for (int i = 0; i < Data.kamusArr.size(); i++) {
            if (status == 1) {
                if (Data.kamusArr.get(i).getEn().equals(q)) {
                    text = Data.kamusArr.get(i).getIn() + "\n" + Data.kamusArr.get(i).getInEx();
                }
            } else {
                if (Data.kamusArr.get(i).getIn().equals(q)) {
                    text = Data.kamusArr.get(i).getEn() + "\n" + Data.kamusArr.get(i).getEnEx();
                }
            }
        }

        return text;
    }

}
