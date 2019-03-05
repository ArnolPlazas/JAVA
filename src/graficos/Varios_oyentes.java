
package graficos;

import java.awt.event.*;
import javax.swing.*;

public class Varios_oyentes {
    public static void main(String[] args){
        Marcooyente marco=new Marcooyente();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marcooyente extends JFrame{
    public Marcooyente(){    
        setVisible(true);
        setTitle("Prueba varios");
        setBounds(600,350,600,300);
        PanelOyentes lamina=new PanelOyentes ();
        add(lamina);
    }    
}

class PanelOyentes  extends JPanel{
    public PanelOyentes (){

        JButton botonAbrir=new JButton("Abrir ventana");
        botoncerrar=new JButton("Cerrar todo");
        
        add(botonAbrir);
        add(botoncerrar);
        OyenteNuevo mioyente=new OyenteNuevo();
        botonAbrir.addActionListener(mioyente);
    }
    
    private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Marco_Emergente marco=new Marco_Emergente(botoncerrar);
            marco.setVisible(true);
        }
        
    }
    JButton botoncerrar; // Se va utilizar fuera del constructor

}

class Marco_Emergente extends JFrame{
    public Marco_Emergente(JButton boton_de_principal){
        contador++;
        setTitle("Ventana: "+contador);
        setBounds(40*contador,40*contador,300,150);
        CierraTodos oyenteCerrar=new CierraTodos();
        boton_de_principal.addActionListener(oyenteCerrar);
    }
    
    private class CierraTodos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose(); //cerrar ventanas
        }
        
    }
    
    private static int contador=0;
}