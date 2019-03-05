/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author afplazasac
 */
public class LayoutBox {
    public static void main(String[] args){
        MarcoCaja mimarco=new MarcoCaja();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mimarco.setVisible(true);
        
    }
}


class MarcoCaja extends JFrame{
    public MarcoCaja(){
        setTitle("Marco en  la caja");
        setBounds(800,350,800,300);
        
        JLabel rotulo1=new JLabel("Nombre: ");
        JTextField texto1=new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());
        Box cajaH1=Box.createHorizontalBox();//creacion del primer contenedor horizontal
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(15));// Definir el espacio entre elementos
        cajaH1.add(texto1);

        JLabel rotulo2=new JLabel("Contraseña: ");
        JTextField texto2=new JTextField(10);
        texto2.setMaximumSize(texto1.getPreferredSize());
        Box cajaH2=Box.createHorizontalBox();//creacion del segundo contenedor horizontal
        cajaH2.add(rotulo2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(texto2);

        JButton boton1=new JButton("OK");
        JButton boton2=new JButton("CANCELAR");
        Box cajaH3=Box.createHorizontalBox();//creacion del tercer contenedor horizontal
        cajaH3.add(boton1);
        cajaH3.add(Box.createGlue()); //ajustar el ancho entre los botones dependiendo del dimensionamiento del marco
        cajaH3.add(boton2); 
        
        Box cajaVertical=Box.createVerticalBox(); // Creación del contenedor vertical
        cajaVertical.add(cajaH1); //agregar el contenedor horizontal 1 al contenedor vertical 
        cajaVertical.add(cajaH2);
        cajaVertical.add(cajaH3);
        
        add(cajaVertical,BorderLayout.CENTER); // agregar la caja vertical al marco
        
        
    }
}
