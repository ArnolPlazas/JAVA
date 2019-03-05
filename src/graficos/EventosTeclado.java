
package graficos;
import javax.swing.*;
import java.awt.event.*;
public class EventosTeclado {
     public static void main(String[] args){
        MarcoTeclado mimarco=new MarcoTeclado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
}
class MarcoTeclado extends JFrame{
    public MarcoTeclado (){
        setVisible(true);
        setBounds(300,300,500,350);
        EventoDeTeclado tecla= new EventoDeTeclado();
        addKeyListener(tecla);
    }
}
class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //int codigo=e.getKeyCode(); //metodo que devuelve el codigo
        //System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char letra=e.getKeyChar();
        System.out.println(letra);
    }
    
}