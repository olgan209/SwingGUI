package org.example;

import javax.swing.*;
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

        myFrame frame = new myFrame();
    }
}