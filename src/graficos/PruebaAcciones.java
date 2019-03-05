
package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class PruebaAcciones {
    public static void main(String[] args){
        MarcoAccion marco=new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoAccion extends JFrame{
    public MarcoAccion(){    
        setVisible(true);
        setTitle("Prueba acciones");
        setBounds(800,350,800,300);
        PanelAccion lamina=new PanelAccion();
        add(lamina);
    }    
}

class PanelAccion extends JPanel{
    public PanelAccion(){
        AccionColor accionAmarillo=new AccionColor("Amarillo",new ImageIcon("build/classes/graficos/icons8-playAm-16.png"),Color.YELLOW);
        AccionColor accionAzul=new AccionColor("Azul",new ImageIcon("build/classes/graficos/icons8-playAz-16.png"),Color.BLUE);
        AccionColor accionRojo=new AccionColor("Rojo",new ImageIcon("build/classes/graficos/icons8-playRo-16.png"),Color.RED);
        /*JButton botonAmarillo=new JButton("Amarillo");
        JButton botonAzul=new JButton("Azul");
        JButton botonRojo=new JButton("Rojo");
        
        JButton botonAmarillo=new JButton(accionAmarillo);//creación del boton pasando como parametro la accion
        JButton botonAzul=new JButton(accionAzul);
        JButton botonRojo=new JButton(accionRojo);
        
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);*/

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));  
        
        InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        //KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo_rojo");
        
        ActionMap mapaAccion=getActionMap();
        
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);
        
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
        setBackground(c);
        System.out.println("Nombre: "+getValue(Action.NAME)+" Descripción: "+getValue(Action.SHORT_DESCRIPTION));
        }
    
    }
}


