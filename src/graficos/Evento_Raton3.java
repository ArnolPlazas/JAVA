package graficos;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Evento_Raton3 {
    public static void main(String[] args){
        MarcoRaton3 mimarco=new MarcoRaton3();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoRaton3 extends JFrame{
    public MarcoRaton3 (){
        setVisible(true);
        setBounds(300,300,500,350);
        EventosDeRaton3 EventoRaton=new EventosDeRaton3();
        addMouseMotionListener(EventoRaton);
    }
}

class EventosDeRaton3 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastrando el raton");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moviendo el raton");    
    }
    

}