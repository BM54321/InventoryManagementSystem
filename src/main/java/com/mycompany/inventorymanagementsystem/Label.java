
package com.mycompany.inventorymanagementsystem;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Label {

    public JLabel headerLabel()
    {
        JLabel label = new JLabel("Inventory Management System");

        ImageIcon image = new ImageIcon("src/main/resources/new.png");
        
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
       
        
        return label;
    }
    
    public static ImageIcon resize(String path, int width, int height)
    {

        ImageIcon original = new ImageIcon(path);

        Image image = original.getImage();

        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = resized.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        g2.drawImage(image, 0, 0, width, height, null);

        g2.dispose();

        return new ImageIcon(resized);
    }
}
