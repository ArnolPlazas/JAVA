/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author AFPLAZASAC
 */
public class Pruebacheaks {
    public static void main(String[] args){
        MarcoCheak mimarcoCheack=new MarcoCheak();
        mimarcoCheack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCheak extends JFrame{
    public MarcoCheak(){
        setBounds(500,300,500,350);
        LaminaCheak milaminaCheak=new LaminaCheak();
        add(milaminaCheak);
        setVisible(true);
    }
}

class LaminaCheak extends JPanel{
    public LaminaCheak(){
        setLayout(new BorderLayout());
        Font miletra=new Font("Serif",Font.PLAIN,24);
        texto=new JLabel("xxxxx xxxxx xxxxx xxxx");
        texto.setFont(miletra);
        JPanel laminatexto=new JPanel();
        laminatexto.add(texto);
        add(laminatexto,BorderLayout.CENTER);
        check1=new JCheckBox("Negrita");
        check2=new JCheckBox("Cursiva");
        
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        
        JPanel laminachecks=new JPanel();
        
        laminachecks.add(check1);
        laminachecks.add(check2);
        add(laminachecks,BorderLayout.SOUTH);
        
    }
    private class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo=0;
            if(check1.isSelected())tipo+=Font.BOLD;
            if(check2.isSelected())tipo+=Font.ITALIC;
            texto.setFont(new Font("Serif",tipo,24));
        }
    
}
    private JLabel texto;
    private JCheckBox check1,check2;
}
