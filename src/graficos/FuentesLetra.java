package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class FuentesLetra {
    public static void main (String[] args){
        MarcoConDibujos4 mimarco=new MarcoConDibujos4();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoConDibujos4 extends JFrame{
    public MarcoConDibujos4(){
        setVisible(true);
        setTitle("prueba con Fuentes");
        setSize(400,400);
        LaminaConFiguras4 milamina=new LaminaConFiguras4();
        add(milamina);
        milamina.setForeground(Color.green);
        
    }
}
class LaminaConFiguras4 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;//Refundicion:Graphics->Graphics2D
        Font mifuente=new Font("New Time Roman",Font.BOLD,26);
        g2.setFont(mifuente);
        //g2.setColor(Color.BLUE);
        g2.drawString("ARNOL",100,100);
        
        g2.setFont(new Font("Arial",Font.ITALIC,24));
        //g2.setColor(new Color(182,155,54).brighter());
        g2.drawString("CURSO DE JAVA",100,200);
    }
}
