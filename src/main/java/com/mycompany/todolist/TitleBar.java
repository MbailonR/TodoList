/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Marcos
 */
public class TitleBar extends JPanel{
    
    public TitleBar(){
        this.setPreferredSize(new Dimension(400, 50));
              
        JLabel titleText = new JLabel("ToDo list");
        titleText.setFont(new Font("Serif", Font.BOLD, 20));
        titleText.setForeground(Color.white);
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.setBackground(new Color(120,81,169));
        this.add(titleText);
    }
}
