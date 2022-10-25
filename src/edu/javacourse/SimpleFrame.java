package edu.javacourse;

import javax.swing.*;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Title");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100, 100, 400, 200);
        jFrame.setVisible(true);


    }
}
