/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6kamus.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JFrame;

/**
 *
 * @author praktikan
 */
public class KamusView extends ComponentView{

    public KamusView() {
        
        lblKamus.setBounds(200,24,200,26);
        lblKamus.setFont(new Font("Consolas",Font.BOLD,24));
        add(lblKamus);
        
        jcColor.setBounds(400,24,75,26);
        add(jcColor);
        
        jcColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorName =  jcColor.getSelectedItem().toString().toLowerCase();
                
            }
        });
        
        jrIndoToIng.setBounds(12,60,200,26);
        add(jrIndoToIng);
        
        jrIndoToIng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("---"+e.getActionCommand());
                
            }
        });
        
        jrIngToIndo.setBounds(250,60,250,26);
        add(jrIngToIndo);
        
        jrIngToIndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("---"+e.getActionCommand());
                
            }
        });
        lblKata.setBounds(12,100,100,26);
        add(lblKata);
        
        jtxtKata.setBounds(64,100,410,26);
        add(jtxtKata);
        
        jtxtKata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
    
        
        jtxtDetail.setBounds(12,140,460,100);
        add(jtxtDetail);
        
        setTitle("Kamus");
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
