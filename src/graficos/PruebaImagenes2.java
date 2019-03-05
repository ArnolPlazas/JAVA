package graficos;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
public class PruebaImagenes2 {
    public static void main (String[] args){
        MarcoImagenes2 mimarco=new MarcoImagenes2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class MarcoImagenes2 extends JFrame{
    public MarcoImagenes2(){
        setVisible(true);
        setTitle("Marco con Imagen");
        setBounds(750,300,300,200);
        LaminaImagenes2 milamina=new LaminaImagenes2();
        add(milamina);
        
    }
}
class LaminaImagenes2 extends JPanel{
    private Image imagen;
    public LaminaImagenes2(){
        try{
            imagen=ImageIO.read(new File("src/graficos/lobo.gif"));
        }
        catch(IOException e){
            System.out.println("la imagen no se encuentra");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchuraImagen=imagen.getWidth(this);
        int alturaImagen=imagen.getHeight(this);
        g.drawImage(imagen,0,0,null);
        for(int i=0;i<300;i++){
            for(int j=0;j<200;j++){
                //g.copyArea(0,0,100, 100,100*i,100*j);
                if(i+j>0){ //No copiar sobre la primera imagen la misma imagen
                    g.copyArea(0,0,anchuraImagen, alturaImagen,anchuraImagen*i,alturaImagen*j);
                }    
            }
        }
        
    }
}