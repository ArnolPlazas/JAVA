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
public class LayoutLibre {
        public static void main(String[] args){
        MarcoLibre mimarco=new MarcoLibre();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mimarco.setVisible(true);
        
    } 
}

class MarcoLibre extends JFrame{
    public MarcoLibre(){
        setTitle("Marco en  la caja");
        setBounds(800,350,800,300);
        LaminaLibre milamina=new LaminaLibre();
        add(milamina);
        
    }
}

class LaminaLibre extends JPanel{
    public LaminaLibre(){
        setLayout(new EnColumnas());
        /*setLayout(null);
        JButton boton1=new JButton("Boton 1");
         JButton boton2=new JButton("Boton 2");
        boton1.setBounds(50, 50, 150,150);
        boton2.setBounds(250, 50, 150,150);
        add(boton1);
        add(boton2);*/
        
        JLabel nombre=new JLabel("Nombre: ");
        JLabel apellido=new JLabel("Apellido: ");
        JLabel edad=new JLabel("Edad: ");
        JLabel telefono=new JLabel("Telefono: ");
        JTextField c_nombre=new JTextField();
        JTextField c_apellido=new JTextField();
        JTextField c_edad=new JTextField();
        JTextField c_telefono=new JTextField();
        /*nombre.setBounds(30, 20, 100,20);
        apellido.setBounds(30, 60, 100,20);
        c_nombre.setBounds(100, 20, 100,20);
        c_apellido.setBounds(100, 55, 100,20);*/
        add(nombre);
        add(c_nombre);
        add(apellido);
        add(c_apellido);
        add(edad);
        add(c_edad);        
        add(telefono);
        add(c_telefono);
        
        
    }
}


class EnColumnas implements LayoutManager{

    @Override
    public void addLayoutComponent(String string, Component cmpnt) {
        
    }

    @Override
    public void removeLayoutComponent(Component cmpnt) {
       
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr) {
        return null;
    }

    @Override
    public void layoutContainer(Container micontenedor) {
        int d=micontenedor.getWidth(); //Guardar el ancho del contenedor
        x=d/2; //punto central (horizontal)
        
        int contador=0; // Contar el numero de componentes
        int n=micontenedor.getComponentCount();//Saber el nuemero de componentes se han agragado al contenedor
        for(int i=0;i<n;i++){
            contador++;
            Component c=micontenedor.getComponent(i);
            c.setBounds(x-100, y, 100, 20);// restarle el ancho del componente 100
            x+=100;
            if(contador%2==0){
                x=d/2;
                y+=40;                        
            }
        }
    }
    private int x;
    private int y=20;
    
}