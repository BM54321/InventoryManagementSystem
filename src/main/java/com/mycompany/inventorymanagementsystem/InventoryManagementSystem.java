/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventorymanagementsystem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

public class InventoryManagementSystem
{

   public static void main(String[] args)
   {
       SwingUtilities.invokeLater(() -> {

            Frame f = new Frame();
            Label l = new Label();
            Panel p = new Panel();

            JPanel mainPanel = new JPanel(new BorderLayout());

            mainPanel.add(p.sidePanelNavy(), BorderLayout.WEST);
            mainPanel.add(l.headerLabel(), BorderLayout.NORTH);

            f.add(mainPanel, BorderLayout.CENTER);

            f.setVisible(true);
        });
   }
    
   
}
