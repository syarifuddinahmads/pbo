/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6translator.service;

import modul6translator.data.DataKamus;
import modul6translator.model.KamusModel;

/**
 *
 * @author udin
 */
public class ServiceImplements implements InterfaceService {

    @Override
    public KamusModel searchWord(String q) {
        KamusModel result = null;
        for (int i = 0; i < DataKamus.dataKamusArr.size(); i++) {
            if (DataKamus.dataKamusArr.get(i).getIndonesia().toLowerCase().equals(q) || DataKamus.dataKamusArr.get(i).getEnglish().toLowerCase().equals(q) || DataKamus.dataKamusArr.get(i).getJava().toLowerCase().equals(q)) {
                result = DataKamus.dataKamusArr.get(i);
            }
        }
        return result;
    }

    @Override
    public void insertData() {
        KamusModel kamusModel = new KamusModel("Kamu", "You", "Koen");
        DataKamus.dataKamusArr.add(kamusModel);
        KamusModel kamusModel1 = new KamusModel("Aku", "Me", "Kulo");
        DataKamus.dataKamusArr.add(kamusModel1);
//        KamusModel kamusModel2 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel2);
//        KamusModel kamusModel3 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel3);
//        KamusModel kamusModel4 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel4);
//        KamusModel kamusModel5 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel5);
//        KamusModel kamusModel6 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel6);
//        KamusModel kamusModel7 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel7);
//        KamusModel kamusModel8 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel8);
//        KamusModel kamusModel9 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel9);
//        KamusModel kamusModel10 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel10);
//        KamusModel kamusModel11 = new KamusModel("", "", "");
//        DataKamus.dataKamusArr.add(kamusModel11);

    }

}
