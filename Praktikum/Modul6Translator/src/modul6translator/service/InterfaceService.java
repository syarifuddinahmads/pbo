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
public interface InterfaceService {

    public void insertData();

    public KamusModel searchWord(String q);
}
