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
import static java.awt.image.ImageObserver.WIDTH;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modul6kamus.controller.KamusController;

/**
 *
 * @author praktikan
 */
public class KamusView extends ComponentView {

    static KamusController kamusController = new KamusController();

    public KamusView() {

        kamusController.insertDataKamus();

        lblKamus.setBounds(200, 18, 200, 26);
        lblKamus.setFont(new Font("Consolas", Font.BOLD, 24));
        add(lblKamus);

        jcColor.setBounds(410, 18, 75, 26);
        add(jcColor);

        jcColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorName = jcColor.getSelectedItem().toString().toLowerCase();
                switch (colorName) {
                    case "red":
                        jpLayout.setBackground(Color.red);
                        break;
                    case "blue":
                        jpLayout.setBackground(Color.blue);
                        break;
                    default:
                        jpLayout.setBackground(Color.red);
                        break;
                }
            }
        });

        jrIndoToIng.setBounds(18, 60, 200, 26);
        jrIndoToIng.setBackground(new Color(0, 0, 0, 0));
        add(jrIndoToIng);
        jrIndoToIng.setSelected(true);

        jrIngToIndo.setBounds(250, 60, 250, 26);
        jrIngToIndo.setBackground(new Color(0, 0, 0, 0));
        add(jrIngToIndo);

        buttonGroup.add(jrIndoToIng);
        buttonGroup.add(jrIngToIndo);

        
        
        lblKata.setBounds(24, 100, 100, 26);
        add(lblKata);

        jtxtKata.setBounds(100, 100, 375, 26);
        add(jtxtKata);

        jtxtKata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jrIngToIndo.isSelected() == false && jrIndoToIng.isSelected() == false) {
                   JOptionPane.showMessageDialog(null, "Pilih Translate terlebih dahulu !");
                } else {
                    if (jtxtKata.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Kata belum diinputkan !");
                    } else {
                        int status = jrIngToIndo.isSelected() == true ? 1 : 2;
                        String kata = kamusController.searchWord(jtxtKata.getText(), status);
                        if (kata == null) {
                            JOptionPane.showMessageDialog(null, "Kata tidak ditemukan !");
                        } else {
                            System.out.println("KATA = "+kata);
                            jtxtDetail.setText(kata);
                        }
                    }
                }

            }
        });

        jtxtDetail.setBounds(24, 140, 450, 100);
        add(jtxtDetail);

        jpLayout.setBounds(12, 56, 475, 375);
        jpLayout.setBackground(Color.red);
        add(jpLayout);

        setTitle("Kamus");
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
