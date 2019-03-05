import java.awt.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author arnol
 */
public class MarcoMEmergente {
    public static void main(String[] args) {
       MarcoEmergente miMarco=new MarcoEmergente();
       miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoEmergente extends JFrame{
    public MarcoEmergente(){
        setBounds(500,350,550,350);
        add(new LaminaEmergente());
        setVisible(true);
    }
}

class LaminaEmergente extends JPanel{
    public LaminaEmergente(){
        
        setLayout(new BorderLayout());
        JPanel laminamenu=new JPanel();
        JMenuBar mibarra=new JMenuBar();
        JMenu fuente=new JMenu("Fuente");
        JMenu estilo=new JMenu("Estilo");
        JMenu tamagno=new JMenu("Tamaño");
        
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);
        
        laminamenu.add(mibarra);
        
        add(laminamenu,BorderLayout.NORTH);
        JTextPane miarea=new JTextPane();
        add(miarea,BorderLayout.CENTER);
//-------------------------------------------------------------------------------------

        JPopupMenu emergente=new JPopupMenu();
        JMenuItem opcion1=new JMenuItem("Opcion 2");
        JMenuItem opcion2=new JMenuItem("Opcion 2");
        JMenuItem opcion3=new JMenuItem("Opcion 3");
        emergente.add(opcion1);
        emergente.add(opcion2);
        emergente.add(opcion3);
        miarea.setComponentPopupMenu(emergente);
            
    }
}