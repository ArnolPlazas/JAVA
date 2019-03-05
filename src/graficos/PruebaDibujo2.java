
package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class PruebaDibujo2 {
    public static void main (String[] args){
        MarcoConDibujos2 mimarco=new MarcoConDibujos2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoConDibujos2 extends JFrame{
    public MarcoConDibujos2(){
        setVisible(true);
        setTitle("prueba de dibujos");
        setSize(400,400);
        LaminaConFiguras2 milamina=new LaminaConFiguras2();
        add(milamina);
    }
}
class LaminaConFiguras2 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;//Refundicion:Graphics->Graphics2D
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);//PRINCIPIO DE SUSTITUCIÓN es un.
        g2.draw(rectangulo);
        Ellipse2D elipse= new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100,100,300,250));// Instanciar un objeto dentro del metodo draw
        double CentroenX=rectangulo.getCenterX();
        double CentroenY=rectangulo.getCenterY();
        double radio=150;
        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);
        g2.draw(circulo);
    }
}
