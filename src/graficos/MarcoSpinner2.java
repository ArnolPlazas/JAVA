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
public class MarcoSpinner2 {
    public static void main(String[] args) {
       FrameSpinner2 miMarco=new FrameSpinner2();
       miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       miMarco.setVisible(true);
    }    
}

class FrameSpinner2 extends JFrame{
    public FrameSpinner2(){
        setBounds(500,350,550,350);
        add(new LaminaSpinner2());
    }
}

class LaminaSpinner2 extends JPanel{
    public LaminaSpinner2(){
  
        JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1){
            public Object getNextValue(){
                return super.getPreviousValue();
            }
        
            public Object getPreviousValue(){
                return super.getNextValue();
            }    
        });
        Dimension d=new Dimension(200,20);
        control.setPreferredSize(d); //Dimesion del Spinner
        add(control);       
            
    }
    /**private class MiModeloJSpinner extends SpinnerNumberModel{
        public MiModeloJSpinner(){
            super(5,0,10,1);
        }
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    }*/
}
