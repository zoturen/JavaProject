/*
 * Created by JFormDesigner on Sun Dec 30 17:31:33 CET 2018
 */

package com.gui;

import com.system.GameFunctions;
import com.system.Main;
import com.system.settings.Settings;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * @author unknown
 */
public class MastermindGUI extends JFrame {

    private Settings settings;
    private GameFunctions gameFunctions;

    public MastermindGUI(Settings settings, GameFunctions gameFunctions) {
        this.settings = settings;
        this.gameFunctions = gameFunctions;
        initComponents();
        refreshButtons();
    }

    public void button2ActionPerformed(ActionEvent e){
        // black

        if (settings.UserChoices.size() <= settings.getColorCounts()) {
            settings.UserChoices.add(1);
            refreshButtons();
        }
    }

    public void button3ActionPerformed(ActionEvent e) {
        // white
        if (settings.UserChoices.size() <= settings.getColorCounts()) {
            settings.UserChoices.add(2);
            refreshButtons();
        }
    }


    public void button4ActionPerformed(ActionEvent e){
        // red
        if (settings.UserChoices.size() <= settings.getColorCounts()) {
            settings.UserChoices.add(3);
            refreshButtons();
        }
    }

    public void button5ActionPerformed(ActionEvent e){
        // purple
        if (settings.UserChoices.size() <= settings.getColorCounts()) {
            settings.UserChoices.add(4);
            refreshButtons();
        }
    }

    public void button6ActionPerformed(ActionEvent e){
        // green
        if (settings.UserChoices.size() <= settings.getColorCounts()) {
            settings.UserChoices.add(5);
            refreshButtons();
        }
    }

    public void button7ActionPerformed(ActionEvent e){
        // blue
        if (settings.UserChoices.size() <= settings.getColorCounts()) {
            settings.UserChoices.add(6);
            refreshButtons();
        }
    }

    public void button8ActionPerformed(ActionEvent e){
        // evaluate
            if (settings.UserChoices.size() >= settings.getColorCounts()) {
                settings.setEvaluated(true);
                refreshButtons();
            } else {
                int size = settings.UserChoices.size();
                System.out.println("You only have selected " + size + " colors!, you need to select " + settings.getColorCounts() + "!");
            }
            /**System.out.println("Pressed evaluate");
            System.out.println("User contains: "+ settings.UserChoices.size() + " elements");
            System.out.println("Player name: " + settings.getPlayerName());
             */

    }

    public void refreshButtons(){
        //---- choiseButton01 ----

        if (settings.UserChoices.size() < 1) {
            choiseButton01.setVisible(false);
        } else {
            choiseButton01.setVisible(true);
            choiseButton01.setText(gameFunctions.MasterColor(settings.UserChoices.get(0)));
            choiseButton01.setForeground(new Color(0, 153, 204));
            choiseButton01.setFont(new Font("Segoe UI", Font.BOLD, 20));
        }

        //---- choiseButton02 ----

        if (settings.UserChoices.size() < 2) {
            choiseButton02.setVisible(false);

        } else{
            choiseButton02.setVisible(true);
            choiseButton02.setText(gameFunctions.MasterColor(settings.UserChoices.get(1)));
            choiseButton02.setForeground(new Color(0, 153, 204));
            choiseButton02.setFont(new Font("Segoe UI", Font.BOLD, 20));
        }

        //---- choiseButton03 ----
        if (settings.UserChoices.size() < 3) {
            choiseButton03.setVisible(false);

        } else {
            choiseButton03.setVisible(true);
            choiseButton03.setText(gameFunctions.MasterColor(settings.UserChoices.get(2)));
            choiseButton03.setForeground(new Color(0, 153, 204));
            choiseButton03.setFont(new Font("Segoe UI", Font.BOLD, 20));
        }

        //---- choiseButton04 ----

        if (settings.UserChoices.size() < 4) {
            choiseButton04.setVisible(false);
        } else {
            choiseButton04.setVisible(true);
            choiseButton04.setText(gameFunctions.MasterColor(settings.UserChoices.get(3)));
            choiseButton04.setForeground(new Color(0, 153, 204));
            choiseButton04.setFont(new Font("Segoe UI", Font.BOLD, 20));
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Marcus
        label2 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        label6 = new JLabel();
        button8 = new JButton();
        label7 = new JLabel();
        choiseButton01 = new JButton();
        choiseButton02 = new JButton();
        choiseButton03 = new JButton();
        choiseButton04 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label2 ----
        label2.setText("Mastermind");
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label1 ----
        label1.setText("?");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 48));

        //---- label3 ----
        label3.setText("?");
        label3.setFont(new Font("Segoe UI", Font.BOLD, 48));

        //---- label4 ----
        label4.setText("?");
        label4.setFont(new Font("Segoe UI", Font.BOLD, 48));

        //---- label5 ----
        label5.setText("?");
        label5.setFont(new Font("Segoe UI", Font.BOLD, 48));

        //---- button2 ----
        button2.setText("Black");
        button2.setForeground(Color.black);
        button2.addActionListener(e -> button2ActionPerformed(e));
        button2.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- button3 ----
        button3.setText("White");
        button3.setForeground(Color.white);
        button3.addActionListener(e -> button3ActionPerformed(e));
        button3.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- button4 ----
        button4.setText("Red");
        button4.setForeground(Color.red);
        button4.addActionListener(e -> button4ActionPerformed(e));
        button4.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- button5 ----
        button5.setText("Purple");
        button5.setForeground(new Color(153, 0, 153));
        button5.addActionListener(e -> button5ActionPerformed(e));
        button5.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- button6 ----
        button6.setText("Green");
        button6.setForeground(new Color(0, 153, 0));
        button6.addActionListener(e -> button6ActionPerformed(e));
        button6.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- button7 ----
        button7.setText("Blue");
        button7.setForeground(new Color(0, 153, 204));
        button7.addActionListener(e -> button7ActionPerformed(e));
        button7.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- label6 ----
        label6.setText("Pick Your Colors");
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- button8 ----
        button8.setText("Evaluate");
        button8.setFont(new Font("Segoe UI", Font.BOLD, 20));
        button8.addActionListener(e -> button8ActionPerformed(e));
        button8.setBackground(new Color(204, 204, 204));



        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(144, Short.MAX_VALUE)
                    .addComponent(button8, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(289, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 208, Short.MAX_VALUE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(choiseButton01, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(choiseButton02, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(choiseButton04, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(choiseButton03, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label6)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
                    .addGap(79, 79, 79))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 180, Short.MAX_VALUE)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
                    .addGap(171, 171, 171))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(choiseButton02, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(choiseButton01, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(choiseButton04, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(choiseButton03, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(button8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Marcus
    private JLabel label2;
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JLabel label6;
    private JButton button8;
    private JLabel label7;
    private JButton choiseButton01;
    private JButton choiseButton02;
    private JButton choiseButton03;
    private JButton choiseButton04;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
