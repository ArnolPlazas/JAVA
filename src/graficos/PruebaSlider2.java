/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author afplazasac
 */
public class PruebaSlider2 {
    public static void main(String[] args){
        MarcoSlider2 mimarcoSlider2=new MarcoSlider2 ();
        mimarcoSlider2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSlider2 extends JFrame{
    public MarcoSlider2(){
        setBounds(500,300,500,350);
        LaminaSlider2 milaminaSlider2=new LaminaSlider2();
        add(milaminaSlider2);
        setVisible(true);
    }
}

class LaminaSlider2 extends JPanel{
    public LaminaSlider2(){
        setLayout(new BorderLayout());
        rotulo=new JLabel("dasdsadasd dadadad adadad........");
        add(rotulo,BorderLayout.CENTER);
        control=new JSlider(8,50,12);
        control.setMajorTickSpacing(10);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif",Font.ITALIC,10));
        control.addChangeListener(new EventoSlider());
        JPanel laminaSlider=new JPanel();
        laminaSlider.add(control);
        add(laminaSlider,BorderLayout.NORTH);
    }
    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            //System.out.println("Estas moviendo el Slider: "+control.getValue());
            rotulo.setFont(new Font("Serif",Font.ITALIC,control.getValue()));
        }
        
    }
    private JLabel rotulo;
    private JSlider control;
}