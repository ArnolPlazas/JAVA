
package POO;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class pruebaTemporizador3 {
    public static void main(String[] args){
        Reloj2 mireloj=new Reloj2();
        mireloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para terminar");
        System.exit(0);
    }
}
class Reloj2{
    public void enMarcha(int intervalo,final boolean sonido){// se debe declarar final puesto que la clase interna local esta accediendo a una variable local del metodo que la contiene.
        class DameLaHora3 implements ActionListener{
        
            public void actionPerformed(ActionEvent evento){
                Date ahora=new Date();
                System.out.println("Te pongo la hora cada 3s"+ahora);
                if(sonido){ // accede a los campos de ejemplar de la clase que los engloba aunque esten emcapsulados
                    Toolkit.getDefaultToolkit();
                }
            }
        
         }
        ActionListener oyente=new DameLaHora3();
        Timer mitemporizador=new Timer(intervalo,oyente);
        mitemporizador.start();
    } 
}

