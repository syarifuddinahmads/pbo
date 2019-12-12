/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6kamus.model;

/**
 *
 * @author udin
 */
public class Kamus {
    private String in;
    private String inEx;
    private String en;
    private String enEx;

    public Kamus(String in, String en,String inEx, String enEx) {
        this.in = in;
        this.inEx = inEx;
        this.en = en;
        this.enEx = enEx;
    }

    public void setInEx(String inEx) {
        this.inEx = inEx;
    }

    public String getInEx() {
        return inEx;
    }


    public String getEnEx() {
        return enEx;
    }


    public void setEnEx(String enEx) {
        this.enEx = enEx;
    }

    
    

    public void setEn(String en) {
        this.en = en;
    }

    public String getEn() {
        return en;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getIn() {
        return in;
    }
    
}
