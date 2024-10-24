package org.example;

import javax.swing.*;
import java.awt.*;

public class Main_Swing {
    public static void main(String[] args) {
        //JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("thumbsup-removebg-preview.png");
        Image imageIcon = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(imageIcon);

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(scaledImageIcon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel yPanel = new JPanel();
        yPanel.setBackground(Color.YELLOW);
        yPanel.setBounds(0, 0, 250, 250);
        yPanel.setLayout(new BorderLayout());

        JPanel bPanel = new JPanel();
        bPanel.setBackground(Color.BLUE);
        bPanel.setBounds(250, 0, 250, 250);

        JPanel gPanel = new JPanel();
        gPanel.setBackground(Color.DARK_GRAY);
        gPanel.setBounds(0, 250, 500, 250);
        gPanel.setLayout(new BorderLayout()); //will set any components vertically and to the left horizontally


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        yPanel.add(label);
        frame.add(yPanel);
        frame.add(bPanel);
        frame.add(gPanel);
    }
}
