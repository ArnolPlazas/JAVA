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
public class Cuadros_Dialogo {
    public static void main(String[] args){
        Marco_Dialogo mimarco= new Marco_Dialogo();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }   
}

class Marco_Dialogo extends JFrame{
    public Marco_Dialogo(){
        setBounds (500,300,600,250);
        add(new Lamina_Dialogo());
    }
}

class Lamina_Dialogo extends JPanel{
    public Lamina_Dialogo(){
        boton1=new JButton("boton 1");
        boton2=new JButton("boton 2");
        boton3=new JButton("boton 3");
        boton4=new JButton("boton 4");
        
        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());
        
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    }
    private class Accion_botones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==boton1){
                //System.out.println("Has pulsado el boton 1");
                //JOptionPane.showMessageDialog(Lamina_Dialogo.this, "Mensaje de prueba");
                JOptionPane.showMessageDialog(Lamina_Dialogo.this, "Mensaje de Prueba","Advertencia",2);
            }else if(e.getSource()==boton2){
                //System.out.println("Has pulsado el boton 2");
                JOptionPane.showInputDialog(Lamina_Dialogo.this,"Introduce nombre: ","Introducción de datos",1);
            }else if(e.getSource()==boton3){
                //System.out.println("Has pulsado el boton 3");
                JOptionPane.showConfirmDialog(Lamina_Dialogo.this, "Elige opción", "V_Confirmar",0);
            }else{
                //System.out.println("Has pulsado el boton 4");
                JOptionPane.showOptionDialog(Lamina_Dialogo.this,"Elige","V de opciones",1,1,null,null,null);
            }
        }
        
    }
    private JButton boton1,boton2,boton3,boton4; 
}