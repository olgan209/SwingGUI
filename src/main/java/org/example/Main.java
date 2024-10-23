package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here");//sets title for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of app
        //DO_NOTHING_ON_CLOSE you cant exit app
        frame.setResizable(false);//prevent frame from being resized
        frame.setSize(800, 600);// frame size, sets x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("D:\\IdeaProjects\\untitled\\logo.jpeg");//create image icon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(Color.PINK);//change color of background
        //frame.getContentPane().setBackground(new Color(62, 71, 155)); */

        //myFrame frame = new myFrame();

        //JLable = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("ani.jpeg");
        Image imageIcon = image.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(imageIcon);
        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel label = new JLabel(scaledImageIcon); // create a label
        label.setText("Bro, do you even code?"); // set text of label
//        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of image
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setIconTextGap(25); //set gap of text to image
        label.setBackground(Color.PINK);
        label.setOpaque(true);//desplai background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100,100,400,400); //set x,y position within frame as we;; as dimensions



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700, 700);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}