/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author afplazasac
 */
public class CampoPassword {
    public static void main(String[] args){
        MarcoPassword mimarcoPassword=new MarcoPassword();
        mimarcoPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPassword extends JFrame{
    public MarcoPassword(){
        setBounds(500,300,500,350);
        LaminaPassword milaminaPassword=new LaminaPassword();
        add(milaminaPassword);
        setVisible(true);
    }
}

class LaminaPassword extends JPanel{
    public LaminaPassword(){
        setLayout(new BorderLayout());
        JPanel lamina_superior=new JPanel();
        lamina_superior.setLayout(new GridLayout(2,2));
        add(lamina_superior,BorderLayout.NORTH);
        
        JLabel etiqueta1=new JLabel("Usuario");
        JLabel etiqueta2=new JLabel("Contraseña}");
        JTextField c_usuario=new JTextField(15);
        c_contra=new JPasswordField(15);
        Comprueba_pass mievento=new Comprueba_pass();
        c_contra.getDocument().addDocumentListener(mievento);
        
        lamina_superior.add(etiqueta1);
        lamina_superior.add(c_usuario);
        lamina_superior.add(etiqueta2);
        lamina_superior.add(c_contra);
        
        JButton enviar=new JButton("Enviar");
        add(enviar,BorderLayout.SOUTH);
        
        
    }
    private class Comprueba_pass implements  DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent de) {
            char [] contrasena;
            contrasena=c_contra.getPassword();
            if(contrasena.length<8 || contrasena.length>12 ){
                c_contra.setBackground(Color.RED);
                
            } else{
                c_contra.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            char [] contrasena;
            contrasena=c_contra.getPassword();
            if(contrasena.length<8 || contrasena.length>12 ){
                c_contra.setBackground(Color.RED);
                
            } else{
                c_contra.setBackground(Color.WHITE);
            }            
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            
        }
        
    }
    private JPasswordField c_contra;
}