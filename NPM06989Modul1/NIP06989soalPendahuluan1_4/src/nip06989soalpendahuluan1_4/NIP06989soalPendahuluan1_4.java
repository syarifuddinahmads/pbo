/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip06989soalpendahuluan1_4;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class NIP06989soalPendahuluan1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int statusNext = 0;
        do{
            
            System.out.print("Masukkan Umur : ");
            int umur = input.nextInt();
            
            if(umur <= 5){
                System.out.println("Balita");
            }else if(umur >= 6 && umur <= 17){
                System.out.println("Anak-anak");
            }else if(umur >= 18 && umur <= 50){
                System.out.println("Dewasa");
            }else if(umur > 50){
                System.out.println("Tua");
            }
            
            System.out.print("Lanjut Input (masukkan Y/T) : ");
            String next = input.next();
            if(next.equals("Y") || next.equals("y")){
                statusNext = 1;
            }
            
            if(next.equals("T") || next.equals("t")){
                statusNext = 0;
            }
            
        }while(statusNext != 0);
        
    }
    
}
