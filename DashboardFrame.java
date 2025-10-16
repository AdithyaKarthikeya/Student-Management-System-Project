package com.studentmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton addStudentButton = new JButton("Add New Student");
        addStudentButton.setPreferredSize(new Dimension(200, 50));
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStudentFrame();
            }
        });
        panel.add(addStudentButton);

        JButton viewStudentsButton = new JButton("View All Students");
        viewStudentsButton.setPreferredSize(new Dimension(200, 50));
        viewStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewStudentsFrame();
            }
        });
        panel.add(viewStudentsButton);

        add(panel);
        setVisible(true);
    }
}