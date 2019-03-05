
package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos2 {
    public static void main(String[] args){
        MarcoBotones2 mimarco=new MarcoBotones2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

    }
}
class MarcoBotones2 extends JFrame{
    public MarcoBotones2(){
        setVisible(true);
        setSize(700,300);
        setLocation(400,200);
        setTitle("Botones y Eventos");
        LaminaBotones2 milamina=new LaminaBotones2();
        add(milamina);
    }
}
class LaminaBotones2 extends JPanel{
 
    JButton botonAzul=new JButton("Azul");// Crea un boton(Objeto Fuente)
    JButton botonAmarillo=new JButton("Amarillo");
    JButton botonRojo=new JButton("Rojo");
    public LaminaBotones2(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
        ColorFondo Azul=new ColorFondo(Color.BLUE);
        ColorFondo Rojo=new ColorFondo(Color.RED);
        botonAzul.addActionListener(Azul);// (Objeto Evento)Desencadenar un evento y lo va recibir (Obejto Listener)
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);
    }   
    private class ColorFondo implements ActionListener{// clase interna oyente
        public ColorFondo(Color C){
            colorDeFondo=C;
        }
        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFondo);
        }
        private Color colorDeFondo;
    }
 
}
