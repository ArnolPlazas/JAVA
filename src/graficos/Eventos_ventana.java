
package graficos;

import javax.swing.*;
import java.awt.event.*;
public class Eventos_ventana {
   public static void main (String[] args){
        MarcoVentana  mimarco=new MarcoVentana();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        MarcoVentana  mimarco2=new MarcoVentana();
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco.setTitle("Ventana 1");
        mimarco2.setTitle("Ventana 2");
        mimarco.setBounds(300,300,500,350);
        mimarco2.setBounds(900,300,500,350);
        
   }
}
   class MarcoVentana extends JFrame{
        public MarcoVentana (){
            setVisible(true);
            //setSize(700,300);
            //setLocation(400,200);
            //setTitle("Respondiendo");
            M_Ventana oyente_ventana=new M_Ventana();
            addWindowListener(oyente_ventana);
        }
     }
    
    class M_Ventana implements WindowListener{
        public void windowActivated(WindowEvent e){
            System.out.println("Ventana activada");
        }
        public void windowClosed(WindowEvent e){
            System.out.println("La ventana ha sido desactivada");}
        public void windowClosing(WindowEvent e){
            System.out.println("Cerrando ventana");
        }
        public void windowDeactivated(WindowEvent e){
            System.out.println("Ventana desactivada");
        }
        public void windowDeiconified(WindowEvent e){
            System.out.println("Ventana restaurada");
        }
        public void windowIconified(WindowEvent e){//Minimizar la ventana
            System.out.println("Ventana minimizada");
        }
        public void windowOpened(WindowEvent e){
            System.out.println("Ventana abierta");
        }
   
   }

