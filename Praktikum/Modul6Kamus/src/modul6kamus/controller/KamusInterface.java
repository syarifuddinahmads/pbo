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
public interface KamusInterface {
    
    public void insertDataKamus();

    public String searchWord(String q, int status);
    
    
}
