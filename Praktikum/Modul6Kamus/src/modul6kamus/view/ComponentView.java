/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6kamus.view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author praktikan
 */
public class ComponentView extends JFrame{
    
    JLabel lblKamus = new JLabel("Kamus");
    String color[] = {"Red","Blue"};
    JComboBox jcColor = new JComboBox(color);
    JRadioButton jrIndoToIng = new JRadioButton("Inggris - Indonesia");
    JRadioButton jrIngToIndo = new JRadioButton("Indonesia - Inggris");
    JLabel lblKata = new JLabel("Kata :");
    JTextField jtxtKata = new JTextField();
    JTextArea jtxtDetail = new JTextArea();
    
    
    
}
