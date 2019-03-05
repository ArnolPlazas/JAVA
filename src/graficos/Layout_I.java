package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Layout_I{
    public static void main(String[] args){
        MarcoLayout marco=new MarcoLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoLayout extends JFrame{
    public MarcoLayout(){    
        setVisible(true);
        setTitle("Prueba Layout");
        setBounds(600,350,600,300);
        PanelLayout lamina=new PanelLayout ();
        PanelLayout2 lamina2=new PanelLayout2 ();
        add(lamina,BorderLayout.NORTH);
        add(lamina2,BorderLayout.SOUTH);
        //FlowLayout dispos=new FlowLayout(FlowLayout.LEFT);
        //lamina.setLayout(dispos);
    }    
}

class PanelLayout extends JPanel{
    public PanelLayout(){
        //setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));

        }
        
    }
    
    
    class PanelLayout2 extends JPanel{
        public PanelLayout2(){
        setLayout(new BorderLayout());
        add(new JButton("Amarillo"),BorderLayout.WEST);
        add(new JButton("Verde"),BorderLayout.EAST);
        add(new JButton("Negro"),BorderLayout.CENTER);
            
        }
    }
