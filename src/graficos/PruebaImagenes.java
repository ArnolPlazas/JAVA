package graficos;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
public class PruebaImagenes {
    public static void main (String[] args){
        MarcoImagenes mimarco=new MarcoImagenes();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoImagenes extends JFrame{
    public MarcoImagenes(){
        setVisible(true);
        setTitle("Marco con Imagen");
        setBounds(750,300,300,200);
        LaminaImagenes milamina=new LaminaImagenes();
        add(milamina);
        
    }
}
class LaminaImagenes extends JPanel{
    private Image imagen;//
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miimagen=new File("src/graficos/arnol.JPG");
        try{
        imagen=ImageIO.read(miimagen);
        }
        catch(IOException e){
            System.out.println("la imagen no se encuentra");
        }
        g.drawImage(imagen,5,5,null);
    }
}

