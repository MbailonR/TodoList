/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Marcos
 */
public class Task extends JPanel{
    
    private JLabel index;
    private JTextField taskName;
    private JButton done;
    
    private boolean completed;
    
    public Task(){
        this.setPreferredSize(new Dimension(40,20));
    
        this.setLayout(new BorderLayout());
        completed = false;
        
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);
        
        taskName = new JTextField("YOUR TASK HERE");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(taskName, BorderLayout.CENTER);
        
        done= new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone(){
        return done;
    }
    public boolean getState(){
        return completed;
    }
    
    public void changeIndex(int i) {
        this.index.setText(i+"-");
        this.revalidate();
    }
    
    public void changeState(){
        this.setBackground(Color.GREEN);
        taskName.setBackground(Color.GREEN);
        completed = true;
    }
    
}
