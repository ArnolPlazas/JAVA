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
public class LayoutSpring {
    public static void main(String[] args){
        MarcoMuelle mimarco=new MarcoMuelle();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mimarco.setVisible(true);
        
    }    
}


class MarcoMuelle extends JFrame{
    public MarcoMuelle(){
        setTitle("Marco en  la caja");
        setBounds(800,350,800,300);
        LaminaMuelle milamina=new LaminaMuelle();
        add(milamina);
        
    }
}

class LaminaMuelle extends JPanel{
    public LaminaMuelle(){
        JButton boton1=new JButton("boton 1");
        JButton boton2=new JButton("boton 2");
        JButton boton3=new JButton("boton 2");
        SpringLayout milayout=new SpringLayout();
        setLayout(milayout);
        add(boton1);
        add(boton2);
        add(boton3);
        Spring mimuelle=Spring.constant(0, 0, 100);//crear el muelle
        Spring muelle_rigido=Spring.constant(100);//crear el muelle
        milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST,this);
        milayout.putConstraint(SpringLayout.WEST, boton2, muelle_rigido, SpringLayout.EAST,boton1);
        milayout.putConstraint(SpringLayout.WEST, boton3, muelle_rigido, SpringLayout.EAST,boton2);
        milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST,boton3);
        
        
    }
}