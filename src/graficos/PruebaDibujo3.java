
package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class PruebaDibujo3 {
    public static void main (String[] args){
        MarcoConDibujos3 mimarco=new MarcoConDibujos3();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoConDibujos3 extends JFrame{
    public MarcoConDibujos3(){
        setVisible(true);
        setTitle("prueba de colores");
        setSize(400,400);
        LaminaConFiguras3 milamina=new LaminaConFiguras3();
        add(milamina);
        //milamina.setBackground(Color.YELLOW);
        milamina.setBackground(SystemColor.window);
        
    }
}
class LaminaConFiguras3 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;//Refundicion:Graphics->Graphics2D
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);//PRINCIPIO DE SUSTITUCIÓN es un.
        g2.setPaint(Color.BLUE);
        g2.draw(rectangulo);        
        g2.setPaint(Color.RED.brighter().brighter());
        g2.fill(rectangulo);
        Ellipse2D elipse= new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        //g2.setPaint(Color.BLUE);
        Color micolor=new Color(125,189,200);
        g2.setPaint(micolor);
        //g2.setPaint(new Color(109,172,59).brighter().brighter()); //RGB
        g2.fill(elipse);
    }
}
