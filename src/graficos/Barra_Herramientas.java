/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author arnol
 */
public class Barra_Herramientas {
    public static void main(String[] args){
        Marco_Barra marco=new Marco_Barra();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}


class Marco_Barra extends JFrame{
    public Marco_Barra(){    
        setVisible(true);
        setTitle("Marco con Barra de herramientas");
        setBounds(800,350,800,300);
        lamina=new PanelAccion();
        add(lamina);
        
        //Configuracón de acciones
        Action accionAmarillo=new AccionColor("Amarillo",new ImageIcon("build/classes/graficos/icons8-playAm-16.png"),Color.YELLOW);
        Action accionAzul=new AccionColor("Azul",new ImageIcon("build/classes/graficos/icons8-playAz-16.png"),Color.BLUE);
        Action accionRojo=new AccionColor("Rojo",new ImageIcon("build/classes/graficos/icons8-playRo-16.png"),Color.RED);
        
        Action accionSalir= new AbstractAction("Salir", new ImageIcon("build/classes/graficos/icons8-esc-16.png")){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        
    };
         //Contruccón de la barra de menus
        JMenu menu=new JMenu("Color");
        menu.add(accionAzul);
        menu.add(accionAmarillo);
        menu.add(accionRojo);
        JMenuBar barra_menus=new JMenuBar();
        barra_menus.add(menu);
        setJMenuBar(barra_menus);
        
        //Contruccón de la barra de herramientas
        JToolBar barra=new JToolBar();
        barra.add(accionAzul);
        barra.add(accionAmarillo);
        barra.add(accionRojo);
        barra.addSeparator();
        barra.add(accionSalir);
        add(barra,BorderLayout.NORTH);
    }    

    private class AccionColor extends AbstractAction{

        public AccionColor(String nombre, Icon icono,Color color_boton){
            putValue(Action.NAME,nombre);
            putValue(Action.SMALL_ICON,icono); //almacenar el icono con su correspondiente clave
            putValue(Action.SHORT_DESCRIPTION,"Poner la lámina de color "+ nombre);
            putValue("color_de_fondo",color_boton);// crear el objeto tipo evento y almacenar lo anterior
        }
        public void actionPerformed(ActionEvent e) {
            Color c=(Color)getValue("color_de_fondo");
            lamina.setBackground(c);
            System.out.println("Nombre: "+getValue(Action.NAME)+" Descripción: "+getValue(Action.SHORT_DESCRIPTION));
        }
    
    }
    private JPanel lamina;
}
