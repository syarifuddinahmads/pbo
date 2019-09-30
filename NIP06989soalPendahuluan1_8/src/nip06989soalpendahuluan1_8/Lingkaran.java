/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_8;

/**
 *
 * @author udin
 */
public class Lingkaran {
    
    double diameter;
    double pi = 3.14;
    
    void setDiameter(double dm){
        this.diameter = dm;
    }
    
    double luas(){
        double luas = diameter/2*pi*pi;
        return luas;
    }
    
    void keliling(){
        double kll = diameter*pi;
        System.out.println("Keliling lingkaran adalah "+kll);
    }
    
}
