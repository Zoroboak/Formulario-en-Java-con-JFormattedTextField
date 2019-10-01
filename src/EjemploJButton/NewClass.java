/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJButton;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Pedro Pérez
 */
public class NewClass extends JFrame{
    
    
    public static void main(String[] args) {
        
        JFrame marco = new JFrame("Ejemplo Button");
        JButton boton = new JButton("Boton");
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        boton.setBounds(50, 50, 280, 200);
        
        ImageIcon img = new ImageIcon("icono.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono);
        
        
        
        marco.add(boton);
        marco.setSize(400, 400);
        marco.setLayout(null);
        marco.setVisible(true);
        
        
        
        
    }
    
    
}
