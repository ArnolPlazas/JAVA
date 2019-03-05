package POO;
import javax.swing.*;
public class Uso_Vehiculo {
    public static void main(String[] args){
        /*Coche Renault=new Coche();//Instanciar una clase(Ejemplarizar una clase)
        Renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(Renault.dime_color());
        System.out.println(Renault.dime_datos_generales());
        Renault.configura_asientos(JOptionPane.showInputDialog("¿Tienes asientos de cuero?"));
        System.out.println(Renault.dime_asientos());
        Renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(Renault.dime_climatizador());
        System.out.println(Renault.dime_peso_coche());
        System.out.println("El precio final del coche es:"+Renault.precio_coche());*/
        
        Coche micoche1=new Coche();
        micoche1.establece_color("Rojo");
        Furgoneta mifurgoneta1=new Furgoneta(7,500);
        mifurgoneta1.establece_color("Azul");
        mifurgoneta1.configura_asientos("Si");
        mifurgoneta1.configura_climatizador("Si");
        System.out.println(micoche1.dime_datos_generales()+" "+micoche1.dime_color());
        System.out.println(mifurgoneta1.dime_datos_generales()+" "+mifurgoneta1.dimeDatosFugoneta());
        
        
        
    
    }   
}
