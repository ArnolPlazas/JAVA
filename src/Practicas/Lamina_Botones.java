/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import javax.swing.*;

/**
 *
 * @author afplazasac
 */
public class Lamina_Botones extends JPanel {
    public Lamina_Botones(String titulo,String [] opciones){
       setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo)); //Crear los bordes para la caja
       setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
       
       grupo=new ButtonGroup();
       for(int i=0;i<opciones.length;i++){
           JRadioButton bot=new JRadioButton(opciones[i]);
           bot.setActionCommand(opciones[i]); //Establecer la accion de comando para un boton
           add(bot);
           grupo.add(bot);
           bot.setSelected(i==0);
       }
    }
    public String dameSeleccion(){
        /*ButtonModel miboton=grupo.getSelection(); // Obtiene el boton seleccionado
        String s=miboton.getActionCommand(); //Obtiene el String del boton seleccionado
        return s;*/
        return grupo.getSelection().getActionCommand();
    }
    private ButtonGroup grupo; 
}
