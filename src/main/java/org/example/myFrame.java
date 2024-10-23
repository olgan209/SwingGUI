package org.example;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    myFrame(){
        this.setTitle("Jthis title goes here");//sets title for frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of app
        //DO_NOTHING_ON_CLOSE you cant exit app
        this.setResizable(false);//prevent frame from being resized
        this.setSize(800, 600);// frame size, sets x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("D:\\IdeaProjects\\untitled\\logo.jpeg");//create image icon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane().setBackground(Color.PINK);//change color of background
        //frame.getContentPane().setBackground(new Color(62, 71, 155));
    }
}
