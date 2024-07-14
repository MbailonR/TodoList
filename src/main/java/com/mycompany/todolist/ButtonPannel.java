/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Marcos
 */
public class ButtonPannel extends JPanel{
    
    private JButton addTask, clearTask;
    Border emptyBorder = BorderFactory.createEmptyBorder();
    public ButtonPannel() {
        this.setPreferredSize(new Dimension(400, 60));
        
        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Serif", Font.BOLD, 20));
   
        this.add(addTask);

        clearTask = new JButton("Clear Task");
        clearTask.setBorder(emptyBorder);
        clearTask.setFont(new Font("Serif", Font.BOLD, 20));
   
        this.add(clearTask);
        
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClearTask() {
        return clearTask;
    }
    
    
}
