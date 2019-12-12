/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6translator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modul6translator.model.KamusModel;
import modul6translator.service.ServiceImplements;

/**
 *
 * @author udin
 */
public class MainView extends ComponentView {

    static ServiceImplements service = new ServiceImplements();

    public MainView() {
        service.insertData();

        lblApp.setBounds(130, 12, 200, 24);
        add(lblApp);

        jtfWord.setBounds(20, 46, 360, 32);
        add(jtfWord);

        jcLang.setBounds(20, 96, 360, 32);
        add(jcLang);

        jcLang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jcLang.getSelectedItem().toString().toLowerCase();

                switch (text) {
                    case "indonesia":
                        jtfWord.setText(text);
                        break;
                    case "english":
                        jtfWord.setText(text);
                        break;
                    case "java":
                        jtfWord.setText(text);
                        break;
                }
            }
        });

        btnTranslate.setBounds(20, 148, 360, 32);
        add(btnTranslate);

        btnTranslate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lang = jcLang.getSelectedItem().toString().toLowerCase();
                if (jtfWord.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Masukkan kata terlebih dahulu !");
                } else {
                    KamusModel word = service.searchWord(jtfWord.getText().toString().toLowerCase());
                    if (word == null) {
                        JOptionPane.showMessageDialog(null, "Kata tidak ditemukan !");
                    } else {
                        if (lang.equals("english")) {
                            lblResult.setText(word.getEnglish());
                        } else if (lang.equals("indonesia")) {
                            lblResult.setText(word.getIndonesia());
                        } else if (lang.equals("java")) {
                            lblResult.setText(word.getJava());
                        }
                    }
                }
            }
        });

        lblResult.setBounds(20, 186, 360, 32);
        add(lblResult);

        setTitle("Khisoft Translator");
        setSize(400, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
