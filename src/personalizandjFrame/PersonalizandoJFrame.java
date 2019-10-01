/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalizandjFrame;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * Ejercicio de personalización de ventanas con metodos JFrame
 * 
 * @author Pedro Daniel Pérez Sánchez
 */
public class PersonalizandoJFrame extends JFrame{

    public PersonalizandoJFrame() throws HeadlessException {
        
        //Poniendole titulo a nuestra ventana
        this.setTitle("Ejemplo JFrame");
        
        //Obteniendo el tamaño de la ventana
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = d.width/2;
        int alto = d.height/2;
        
        //Estableciendo el tamaño de la ventana 
        this.setSize(ancho, alto);
        this.setLocation(ancho/2, alto/2);
        
        //Establecer imagen
        Image icono = tk.getImage("icon.png");
        this.setIconImage(icono);
        
        
        
        
    }

    
    
}
