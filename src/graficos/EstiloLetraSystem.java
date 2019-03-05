 /*La clase graphicsEnvironment graalmacena en una array de tipo String los tipos de letras que hay instaladas
en la maquina del usuario*/
package graficos;
import javax.swing.*;
import java.awt.GraphicsEnvironment;

public class EstiloLetraSystem {
    public static void main(String[] args){
        String fuente=JOptionPane.showInputDialog("Introduce Fuente");
        boolean estalafuente=false;
        String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombredelafuente: nombresDeFuentes){
             //System.out.println(nombredelafuente);
            if(nombredelafuente.equalsIgnoreCase(fuente)){
                estalafuente=true;
            }   
        }
        if(estalafuente){
            System.out.println("Fuente instalada");
        }
        else{
            System.out.println("Fuente no instalada");
        }
    }    
}
 
