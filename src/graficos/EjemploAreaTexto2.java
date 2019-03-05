/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author afplazasac
 */
public class EjemploAreaTexto2 {
    public static void main(String[] args){
        MarcoArea2 mimarcoPassword2=new MarcoArea2();
        mimarcoPassword2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarcoPassword2.setVisible(true);
    }    
}

class MarcoArea2 extends JFrame{
    public MarcoArea2(){
        setTitle("Prueba Area");
        setBounds(500,300,500,350);
        setLayout(new BorderLayout());
        laminaBotones=new JPanel();
        botonInsertar=new JButton("Insertar");
        botonInsertar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acoedarme...");
            }
            
        });
        laminaBotones.add(botonInsertar);
        botonSaltoLinea=new JButton("Salto Línea");
        botonSaltoLinea.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar=!areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                /*if(saltar){
                    botonSaltoLinea.setText("Quitar salto");
                }else{
                    botonSaltoLinea.setText("Salto Línea");
                }*/
                botonSaltoLinea.setText(saltar ? "Quitar salto":"Salto de linea");
            }
            
        });
        laminaBotones.add(botonSaltoLinea);
        add(laminaBotones,BorderLayout.SOUTH);
        
        areaTexto=new JTextArea(8,20);
        laminaConBarras=new JScrollPane(areaTexto);
        add(laminaConBarras,BorderLayout.CENTER);
        
                
        
    }
    private JPanel laminaBotones;
    private JButton botonInsertar,botonSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;
}