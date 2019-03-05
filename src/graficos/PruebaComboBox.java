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
 * @author afplazasac
 */
public class PruebaComboBox {
    public static void main(String[] args){
        MarcoComboBox mimarcoComboBox=new MarcoComboBox ();
        mimarcoComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoComboBox extends JFrame{
    public MarcoComboBox(){
        setBounds(500,300,500,350);
        LaminaComboBox milaminaComboBox=new LaminaComboBox();
        add(milaminaComboBox);
        setVisible(true);
    }
}

class LaminaComboBox extends JPanel{
    public LaminaComboBox(){
        setLayout(new BorderLayout());
        texto=new JLabel("En un lugar de la mancha de cuyo nombre.....");
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        add(texto,BorderLayout.CENTER);
        JPanel lamina_norte=new JPanel();
        milista=new JComboBox();
        milista.setEditable(true);//Editar el ComboBox
        milista.addItem("Serif");
        milista.addItem("Arial");
        milista.addItem("Monospaced");
        milista.addItem("Dialog");
        Evento_combo mievento=new Evento_combo();
        milista.addActionListener(mievento);
        lamina_norte.add(milista);
        add(lamina_norte,BorderLayout.NORTH);

    }
    
    private class Evento_combo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            texto.setFont(new Font((String)milista.getSelectedItem(),Font.PLAIN,18));
            System.out.println(milista.getSelectedItem());
        }
        
    }
    private JLabel texto;
    private JComboBox milista;
}    
