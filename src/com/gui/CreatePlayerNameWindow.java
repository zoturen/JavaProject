/*
 * Created by JFormDesigner on Sun Dec 30 22:54:48 CET 2018
 */

package com.gui;

import com.system.Game;
import com.system.Main;
import com.system.settings.Settings;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Marcus
 */
public class CreatePlayerNameWindow extends JFrame {

    private Settings settings;
    private Game game;

    public CreatePlayerNameWindow(Settings settings, Game game) {

        this.game = game;
        this.settings = settings;
        initComponents();

    }

    private void button1ActionPerformed(ActionEvent e) {
        setVisible(false);


        settings.setRunning(true);
        settings.setDifficulty(getDifficulty());
        settings.setPlayerName(getPlayerName());

        System.out.println("Player name: " + settings.getPlayerName() + " Difficulty: " + settings.getDifficulty());


        game.GameLoop();


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Marcus
        button1 = new JButton();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        label4 = new JLabel();

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Confirm");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(205, 475), button1.getPreferredSize()));

        //---- label1 ----
        label1.setText("Choose a Player Name");
        contentPane.add(label1);
        label1.setBounds(185, 395, 150, 30);
        contentPane.add(textField1);
        textField1.setBounds(185, 425, 125, textField1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Mastermind");
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        contentPane.add(label2);
        label2.setBounds(160, 15, 170, 35);

        //---- label3 ----
        label3.setText("Choose Difficulty Level");
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        contentPane.add(label3);
        label3.setBounds(145, 90, 195, 55);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "Easy",
            "Normal",
            "Hard"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(new Rectangle(new Point(180, 145), comboBox1.getPreferredSize()));

        //---- label4 ----
        label4.setText("Rules explenation...");
        contentPane.add(label4);
        label4.setBounds(95, 220, 275, 120);

        contentPane.setPreferredSize(new Dimension(490, 560));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Marcus
    private JButton button1;
    private JLabel label1;

    public String getPlayerName() {
        return textField1.getText();
    }

    public String getDifficulty() {
        return comboBox1.getSelectedItem().toString();
    }

    private JTextField textField1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
