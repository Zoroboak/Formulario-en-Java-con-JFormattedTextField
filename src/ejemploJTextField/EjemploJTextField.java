/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploJTextField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Pedro Pérez
 */
public class EjemploJTextField extends JFrame{
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Ejemplo JTextField");
        JPanel p = new JPanel(null);
        JTextField textField = new JTextField("Hola Mundo");
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = d.width/2;
        int alto = d.height/2;
        
        textField.setFont(new Font("Courier", Font.BOLD, 12));
        textField.setBounds(ancho/4,alto/4,ancho/3, alto/3);
        
        
        f.setSize(ancho, alto);
        f.setLocation(ancho/2, alto/2);
        p.add(textField);
        f.add(p);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
    
    
    
}
