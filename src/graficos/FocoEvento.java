package graficos;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class FocoEvento {
    public static void main(String[] args){
        MarcoFoco mimarco=new MarcoFoco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoFoco extends JFrame{
    public MarcoFoco (){
        setVisible(true);
        setBounds(300,300,500,350);
        add(new LaminaFoco());
    }
}
class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);//Invalidar el layoud     
        cuadro1=new JTextField();
        cuadro2=new JTextField();
        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elFoco=new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
    }
    
    private class LanzaFocos implements FocusListener{

    @Override
        public void focusGained(FocusEvent e) {

    }

    @Override
        public void focusLost(FocusEvent e) {
            String email=cuadro1.getText(); //Obtener el texto dentro del cuadro del texto
            boolean comprobacion=false;
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    comprobacion=true;
            }
        }
            if(comprobacion){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        
        }   
  
}
    
    JTextField cuadro1;
    JTextField cuadro2;
}
