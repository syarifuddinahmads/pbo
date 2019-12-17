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
public class KamusController implements KamusInterface {

    @Override
    public void insertDataKamus() {

//        Kamus k = new Kamus("baju", "dress", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Kamus k = new Kamus();
        k.setIn("baju");
        k.setInEx("-");
        k.setEn("dress");
        k.setEnEx("-");
        Data.kamusArr.add(k);
//        Kamus k1 = new Kamus("kambing", "goat", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Kamus k1 = new Kamus();
        k1.setIn("kambing");
        k1.setInEx("-");
        k1.setEn("goat");
        k1.setEnEx("-");
        Data.kamusArr.add(k1);
//        Kamus k2 = new Kamus("laki-laki", "man", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Kamus k2 = new Kamus();
        k2.setIn("laki-laki");
        k2.setInEx("-");
        k2.setEn("man");
        k2.setEnEx("-");
        Data.kamusArr.add(k2);
//        Kamus k3 = new Kamus("hitam", "black", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Kamus k3 = new Kamus();
        k3.setIn("hitam");
        k3.setInEx("-");
        k3.setEn("black");
        k3.setEnEx("-");
        Data.kamusArr.add(k3);
//        Kamus k4 = new Kamus("kursi", "chair", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Kamus k4 = new Kamus();
        k4.setIn("kursi");
        k4.setInEx("-");
        k4.setEn("chair");
        k4.setEnEx("-");
        Data.kamusArr.add(k4);
//        Kamus k5 = new Kamus("papan tulis", "whiteboard", "asdfghjsdghjdfghjk", "asdfghjksdfghjkldfghjkl");
        Kamus k5 = new Kamus();
        k5.setIn("papan tulis");
        k5.setInEx("-");
        k5.setEn("white board");
        k5.setEnEx("-");
        Data.kamusArr.add(k5);

    }

    @Override
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
