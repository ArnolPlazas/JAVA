
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnol
 */
public class MarcoMenu {
    public static void main(String[] args) {
       MenuFrame miMarco=new MenuFrame();
       miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       miMarco.setVisible(true);
    }        
}

class MenuFrame extends JFrame{
    public MenuFrame(){
        setBounds(500,350,550,350);
        add(new LaminaFrame());
    }
}

class LaminaFrame extends JPanel{
    public LaminaFrame(){
        //Crear la barra
        JMenuBar mibarra=new JMenuBar();
        
        //Crear elementos de la barra
        JMenu archivo=new JMenu("Archivo");
        JMenu edicion=new JMenu("Edición");
        JMenu herramientas=new JMenu("Herramientas");
        JMenu opciones=new JMenu("Opciones");
        
        //Agregar los elementos de cada menu
        JMenuItem guardar=new JMenuItem("Guardar");
        JMenuItem guardar_como=new JMenuItem("Guadrar Como");
        
        JMenuItem copiar=new JMenuItem("Copiar",new ImageIcon("build/classes/graficos/copiar.gif"));
        JMenuItem cortar=new JMenuItem("Cortar",new ImageIcon("build/classes/graficos/cortar.gif"));
        JMenuItem pegar=new JMenuItem("Pegar",new ImageIcon("build/classes/graficos/pegar.gif"));
        pegar.setHorizontalTextPosition(SwingConstants.LEFT);
        JMenuItem generales=new JMenuItem("Generales");
        
        JMenuItem opcion1=new JMenuItem("Opcion1");
        JMenuItem opcion2=new JMenuItem("Opcion2");
        
        archivo.add(guardar);
        archivo.add(guardar_como);
        
        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(opciones);
        
        herramientas.add(generales);
        
        opciones.add(opcion1);
        opciones.add(opcion2);
        
        //Agregar elementos a la barra
        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);
        
        add(mibarra);
            
    }
}