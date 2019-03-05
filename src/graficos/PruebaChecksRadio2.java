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
public class PruebaChecksRadio2 {
    public static void main(String[] args){
        MarcoCheakRadio2 mimarcoCheckRadio2=new MarcoCheakRadio2 ();
        mimarcoCheckRadio2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCheakRadio2 extends JFrame{
    public MarcoCheakRadio2(){
        setBounds(500,300,500,350);
        LaminaCheakRadio2 milaminaCheakRadio2=new LaminaCheakRadio2();
        add(milaminaCheakRadio2);
        setVisible(true);
    }
}

class LaminaCheakRadio2 extends JPanel{
    public LaminaCheakRadio2(){
        setLayout (new BorderLayout());
        texto=new JLabel("En un lugar de la mancha de cuyo nombre.....");
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        add(texto,BorderLayout.CENTER);
        lamina_botones=new JPanel();
        migrupo=new ButtonGroup();
        colocarBotones("Pequeño",false,10);
        colocarBotones("Mediano",true,12);
        colocarBotones("Grande",false,18);
        colocarBotones("Muy grande",false,26);
        add(lamina_botones,BorderLayout.SOUTH);
    }
    
    public void colocarBotones(String nombre,boolean seleccionado, int tamagno){
        JRadioButton boton=new JRadioButton(nombre,seleccionado);
        migrupo.add(boton);
        lamina_botones.add(boton);
        ActionListener mievento=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                texto.setFont(new Font("Serif",Font.PLAIN,tamagno));
            }
            
        };
        boton.addActionListener(mievento);
        
    }

    private JLabel texto;
    private JRadioButton boton1, boton2,boton3,boton4;
    private ButtonGroup migrupo;
    private JPanel lamina_botones;
}