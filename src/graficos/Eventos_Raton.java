
package graficos;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Eventos_Raton {
    public static void main(String[] args){
        MarcoRaton mimarco=new MarcoRaton();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoRaton extends JFrame{
    public MarcoRaton (){
        setVisible(true);
        setBounds(300,300,500,350);
        EventosDeRaton EventoRaton=new EventosDeRaton();
        addMouseListener(EventoRaton);
    }
}

class EventosDeRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Haz hecho click");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Acabas de oprimir");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Acabas de salir");
    }
    
}
