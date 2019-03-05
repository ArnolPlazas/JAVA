/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.*;

/**
 *
 * @author afplazasac
 */
public class EjemploJSpinner {
    public static void main(String[] args){ 
        MarcoJSpinner mimarcoJSpinner=new MarcoJSpinner ();
        mimarcoJSpinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
class MarcoJSpinner extends JFrame{
    public MarcoJSpinner(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("primer JSpinner");
        LaminaJSpinner milaminaJSpinner=new LaminaJSpinner();
        add(milaminaJSpinner);
    }
}
class LaminaJSpinner extends JPanel{
    public LaminaJSpinner(){
        JSpinner control=new JSpinner();
        add(control);
    }
}