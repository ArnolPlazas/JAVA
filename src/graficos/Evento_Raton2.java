package graficos;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Evento_Raton2 {
    public static void main(String[] args){
        MarcoRaton2 mimarco=new MarcoRaton2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoRaton2 extends JFrame{
    public MarcoRaton2 (){
        setVisible(true);
        setBounds(300,300,500,350);
        EventosDeRaton2 EventoRaton=new EventosDeRaton2();
        addMouseListener(EventoRaton);
    }
}

class EventosDeRaton2 extends MouseAdapter{
    /*public void mouseClicked(MouseEvent e){
        //System.out.println("Coordenadas X: "+e.getX()+" Coordenadas Y: "+e.getY());
        System.out.println(e.getClickCount());
    }*/
    public void mousePressed(MouseEvent e){
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){  //if(e.getModifiersEx()==1024)
            System.out.println("Boton izquierdo");
        }
        else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Rueda del raton");
        }
        else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Boton derecho ");
        }
    }
}