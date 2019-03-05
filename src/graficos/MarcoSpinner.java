
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnol
 */
public class MarcoSpinner {
    public static void main(String[] args) {
       FrameSpinner miMarco=new FrameSpinner();
       miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       miMarco.setVisible(true);
    }
}

class FrameSpinner extends JFrame{
    public FrameSpinner(){
        setBounds(500,350,550,350);
        add(new LaminaSpinner());
    }
}

class LaminaSpinner extends JPanel{
    public LaminaSpinner(){
        JSpinner control=new JSpinner();
        add(control);
        
        JSpinner control2=new JSpinner(new SpinnerDateModel());
        add(control2);
        
        //String lista[]={"ENERO","FEBRERO","MARZO","ABRIL"};
        String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); //Todas las fuentes de que disponde el ordenador
        JSpinner control3=new JSpinner(new SpinnerListModel(lista));
        Dimension d=new Dimension(200,20);
        control3.setPreferredSize(d); //Dimesion del Spinner
        add(control3);        
        
        JSpinner control4=new JSpinner(new SpinnerNumberModel(5,0,10,2));
        add(control4);       
            
    }
}