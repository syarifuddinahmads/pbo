/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6translator.model;

/**
 *
 * @author udin
 */
public class KamusModel {
    private String indonesia;
    private String english;
    private String java;

    public KamusModel(String indonesia, String english, String java) {
        this.indonesia = indonesia;
        this.english = english;
        this.java = java;
    }

    public String getIndonesia() {
        return indonesia;
    }

    public void setIndonesia(String indonesia) {
        this.indonesia = indonesia;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }
    
}
