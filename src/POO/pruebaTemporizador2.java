
package POO;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class pruebaTemporizador2 {
    public static void main(String[] args){
        Reloj mireloj=new Reloj(3000,true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para terminar");
        System.exit(0);
    }
}
class Reloj{
    public Reloj(int intervalo,boolean sonido){
        this.intervalo=intervalo;
        this.sonido=sonido;
    }
    public void enMarcha(){
        ActionListener oyente=new DameLaHora2();
        Timer mitemporizador=new Timer(intervalo,oyente);
        mitemporizador.start();
    }
    private int intervalo;
    private boolean sonido;
   
    private class DameLaHora2 implements ActionListener{
        
        public void actionPerformed(ActionEvent evento){
            Date ahora=new Date();
            System.out.println("Te pongo la hora cada 3s"+ahora);
            if(sonido){ // accede a los campos de ejemplar de la clase que los engloba aunque esten emcapsulados
                Toolkit.getDefaultToolkit();
            }
        }
        
    }
}
