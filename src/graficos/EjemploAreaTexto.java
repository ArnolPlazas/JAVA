/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author afplazasac
 */
public class EjemploAreaTexto {
    public static void main(String[] args){
        MarcoArea mimarcoPassword=new MarcoArea();
        mimarcoPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoArea extends JFrame{
    public MarcoArea(){
        setBounds(500,300,500,350);
        LaminaArea milamina=new LaminaArea();
        add(milamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel{
    public LaminaArea(){
        miarea=new JTextArea(8,20);
        JScrollPane laminaBarras=new JScrollPane(miarea);
        
        miarea.setLineWrap(true); //No aumentar el ancho de la caja de texto
        add(laminaBarras);
        
        JButton miboton=new JButton("Dale");
        miboton.addActionListener(new GestionArea());
        add(miboton);
        
    }
    private class GestionArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(miarea.getText());
        
        }
    }    
    private JTextArea miarea;
}