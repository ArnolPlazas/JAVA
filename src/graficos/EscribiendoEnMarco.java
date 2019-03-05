
package graficos;
import javax.swing.*;
import java.awt.*;
public class EscribiendoEnMarco {
    public static void main (String[] args){
        MarcoConTexto mimarco=new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

    }
}
class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("primer texto");
        Lamina milamina=new Lamina();
        add(milamina);
    }
}
class Lamina extends JPanel{
    public void paintComponent(Graphics g){ //Sobreescribir el metodo
        super.paintComponent(g);// Invocar a un metodo de la clase padre(paintComponent)
        g.drawString("Estamos aprendiendo Swing",100,100);
    }
}