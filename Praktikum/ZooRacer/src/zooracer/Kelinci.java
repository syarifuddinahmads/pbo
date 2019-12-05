/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooracer;

/**
 *
 * @author udin
 */
class Kelinci extends Animal{
    
    public Kelinci() {
    }
   
    public Kelinci(String nama, int kecepatanLari) {
        super(nama, kecepatanLari);
    }
  
    @Override
    public int hitungKecepatan(int jarak,int kecepatanLari){
        return (jarak / kecepatanLari);
    }
}
