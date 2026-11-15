/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
/**
 *
 * @author Teacher
 */
public class Frame extends JFrame
{
    Frame()
    {       
       ImageIcon image = new ImageIcon("src/main/resources/title_logo.jpg");
       
       this.setTitle("Inventoy Management System");
       this.setIconImage(image.getImage());
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new BorderLayout());
       this.setSize(720,640);
       this.setBackground(Color.decode("#F1F5F9"));
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }
}
