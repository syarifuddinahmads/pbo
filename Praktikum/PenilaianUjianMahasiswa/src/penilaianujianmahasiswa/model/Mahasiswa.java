/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianujianmahasiswa.model;

/**
 *
 * @author udin
 */
public class Mahasiswa {

    private String namaMhs;
    private int npmMhs;
    private int semesterMhs;

    public Mahasiswa(String namaMhs, int npmMhs, int semesterMhs) {
        this.namaMhs = namaMhs;
        this.npmMhs = npmMhs;
        this.semesterMhs = semesterMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public void setNpmMhs(int npmMhs) {
        this.npmMhs = npmMhs;
    }

    public void setSemesterMhs(int semesterMhs) {
        this.semesterMhs = semesterMhs;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public int getNpmMhs() {
        return npmMhs;
    }

    public int getSemesterMhs() {
        return semesterMhs;
    }

}
