
package POO;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
public class pruebaTemporizador {
    public static void main(String[] args){
        //ActionListener oyente=new DameLaHora();
        dameLaHora oyente=new dameLaHora();//Instancia dameLahora
        Timer mitemporizador=new Timer(5000,oyente);/*oyente->Objeto de tipo interfaz->ActionListener*/
        mitemporizador.start();
        JOptionPane.showMessageDialog(null,"pulsa Aceptar para determinar");
    }
}

class dameLaHora implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Date ahora=new Date();
        System.out.println("Te pongo la hora cada 5s:"+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}