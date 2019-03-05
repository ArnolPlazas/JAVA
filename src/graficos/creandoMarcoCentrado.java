
package graficos;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
public class creandoMarcoCentrado {
    public static void main(String[] args){
        MarcoCentrado mimarco=new MarcoCentrado();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit mipantalla=Toolkit.getDefaultToolkit(); //metodo estatico que devuelve una variable tipo Toolkit, almancena en mipantalla
        Dimension tamanoPantalla=mipantalla.getScreenSize(); // metodo abstracto que devuelve una variable tipo Dimesion, almacena en Dimension
        int alturaPantalla=tamanoPantalla.height;
        int anchoPantalla=tamanoPantalla.width;
        setSize(anchoPantalla/2,alturaPantalla/2); //Tamaño del marco igual a la mitad de largo y de ancho del la pantalla(Resolucion:pixeles)
        setLocation(anchoPantalla/4,alturaPantalla/4); // ubicar el marco en todo el centro de la pantalla segun su resolución
        setTitle("Marco Centrado");
        Image miIcono=mipantalla.getImage("src/graficos/arnol.jpg");
        setIconImage(miIcono);
    }
}
