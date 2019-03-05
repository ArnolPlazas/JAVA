package graficos;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Eventos_Teclado {
    public static void main(String[] args){
        MarcoConTeclas mimarco=new MarcoConTeclas();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
   
}
class MarcoConTeclas extends JFrame{
    public MarcoConTeclas (){
        setVisible(true);
        setBounds(300,300,500,350);
        EventoDeTeclados tecla=new EventoDeTeclados();
        addKeyListener(tecla);
    }
}

class EventoDeTeclados implements KeyListener{
    
    public void keyPressed(KeyEvent e){
        //int codigo=e.getKeyCode(); //devuelve el codigo de la tecla pulsada
        //System.out.println(codigo);
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyTyped(KeyEvent e){
        char letra=e.getKeyChar();//devuelve el valor de la tecla pulsada
        System.out.println(letra);
        
    }
    
}

