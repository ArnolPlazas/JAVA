
package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos {
    public static void main(String[] args){
        MarcoBotones mimarco=new MarcoBotones();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

    }
}
class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setVisible(true);
        setSize(700,300);
        setLocation(400,200);
        setTitle("Botones y Eventos");
        LaminaBotones milamina=new LaminaBotones();
        add(milamina);
    }
}
class LaminaBotones extends JPanel implements ActionListener{
 
    JButton botonAzul=new JButton("Azul");// Crea un boton(Objeto Fuente)
    JButton botonAmarillo=new JButton("Amarillo");
    JButton botonRojo=new JButton("Rojo");
    public LaminaBotones(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        botonAzul.addActionListener(this);// (Objeto Evento)Desencadenar un evento y lo va recibir la lamina(Obejto Listener)
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }   
    public void actionPerformed(ActionEvent e){// recibe un evento de tipo raton(metodo de ActionListener)
        Object botonPulsado=e.getSource();//metodo permite capturar la fuente del evento
        if(botonPulsado==botonAzul){
            setBackground(Color.BLUE);// Accion a ejecutar            
        }
        else if(botonPulsado==botonAmarillo){
            setBackground(Color.YELLOW);// Accion a ejecutar
        }
        else{
            setBackground(Color.RED);// Accion a ejecutar
        }

    }     
}
