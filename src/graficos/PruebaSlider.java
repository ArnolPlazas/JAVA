/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author afplazasac
 */
public class PruebaSlider {
    public static void main(String[] args){
        MarcoSlider mimarcoSlider=new MarcoSlider ();
        mimarcoSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSlider extends JFrame{
    public MarcoSlider(){
        setBounds(500,300,500,350);
        LaminaSlider milaminaSlider=new LaminaSlider();
        add(milaminaSlider);
        setVisible(true);
    }
}

class LaminaSlider extends JPanel{
    public LaminaSlider(){
        //JSlider control=new JSlider(SwingConstants.VERTICAL,0,100,0);
        JSlider control=new JSlider(0,100,0);
        //control.setOrientation(SwingConstants.VERTICAL);
        control.setMajorTickSpacing(50);
        control.setMinorTickSpacing(25);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif",Font.ITALIC,10));
        control.setSnapToTicks(true); //Llevar el slider a una marca establecida
        add(control);
        

    }
}