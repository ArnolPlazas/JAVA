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
 * @author AFPLAZASAC
 */
public class PruebaChecksRadio {
    public static void main(String[] args){
        MarcoCheakRadio mimarcoCheckRadio=new MarcoCheakRadio ();
        mimarcoCheckRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCheakRadio extends JFrame{
    public MarcoCheakRadio(){
        setBounds(500,300,500,350);
        LaminaCheakRadio milaminaCheakRadio=new LaminaCheakRadio();
        add(milaminaCheakRadio);
        setVisible(true);
    }
}

class LaminaCheakRadio extends JPanel{
    public LaminaCheakRadio(){
        ButtonGroup migrupo=new  ButtonGroup();
        ButtonGroup migrupo2=new  ButtonGroup();
        JRadioButton boton1=new JRadioButton("Azul",false);
        JRadioButton boton2=new JRadioButton("Rojo",true);
        JRadioButton boton3=new JRadioButton("Verde",false);
        
        JRadioButton boton4=new JRadioButton("Masculino",false);
        JRadioButton boton5=new JRadioButton("Femenino",false);
        
        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);

        migrupo2.add(boton4);
        migrupo2.add(boton5);        
        
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }
}
