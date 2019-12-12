/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6translator.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author udin
 */
public class ComponentView extends JFrame{
    
    JLabel lblApp = new JLabel("Khisoft Translator");
    JTextField jtfWord = new JTextField();
    String[] lang = {"English","Indonesia","Java"};
    JComboBox jcLang = new JComboBox(lang);
    JButton btnTranslate = new JButton("TRANSLATE");
    JLabel lblResult = new JLabel("-");
    
}
