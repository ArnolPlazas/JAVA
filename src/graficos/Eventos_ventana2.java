
package graficos;

import javax.swing.*;
import java.awt.event.*;
public class Eventos_ventana2 {
   public static void main (String[] args){
        MarcoVentana2  mimarco=new MarcoVentana2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        MarcoVentana2  mimarco2=new MarcoVentana2();
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco.setTitle("Ventana 1");
        mimarco2.setTitle("Ventana 2");
        mimarco.setBounds(300,300,500,350);
        mimarco2.setBounds(900,300,500,350);
        
   }
}
   class MarcoVentana2 extends JFrame{
        public MarcoVentana2 (){
            setVisible(true);
            //setSize(700,300);
            //setLocation(400,200);
            //setTitle("Respondiendo");
            /*M_Ventana oyente_ventana=new M_Ventana();
            addWindowListener(oyente_ventana);*/
            addWindowListener(new M_Ventana());
        }
     }
    
    class M_Ventana2 extends WindowAdapter{

        public void windowIconified(WindowEvent e){//Minimizar la ventana
            System.out.println("Ventana minimizada");
        }
 
   
   }
