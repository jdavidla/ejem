/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.swing.JOptionPane;


/**
 *
 * @author josedavid
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m1;
        String m2;
        
        m1 = JOptionPane.showInputDialog("escriba el primer mensaje");
        m2 = JOptionPane.showInputDialog("escriba el segundo mensaje");
        
        System.out.println("El primer mensaje es: " + m1);
        System.out.println("El primer segundo es: " + m2);
        
    }
    
}
