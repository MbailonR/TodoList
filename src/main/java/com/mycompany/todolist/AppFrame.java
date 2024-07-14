/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Marcos
 */
public class AppFrame extends JFrame {

    private ButtonPannel panel;
    private TitleBar title;
    private Lista list;
    private JButton addTask, clearTask;

    public AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        title = new TitleBar();
        list = new Lista();
        panel = new ButtonPannel();

        this.add(title, BorderLayout.NORTH);
        this.add(panel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        addTask = panel.getAddTask();
        clearTask = panel.getClearTask();

        addTask.addActionListener((ActionEvent e) -> {
            Task task = new Task();
            list.add(task);
            list.updateNumbers();

            task.getDone().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    task.changeState();
                    revalidate();
                }
            });
            revalidate();
        });

        clearTask.addActionListener((ActionEvent e) -> {
            list.removeCompletedTasks();
            repaint();
        });

        // Here to make sure that it loads all components before
        this.setVisible(true);
    }
}
