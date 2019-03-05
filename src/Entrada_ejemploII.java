import javax.swing.*;
public class Entrada_ejemploII {
    public static void main(String[] args){
    String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre,por favor");
    String edad=JOptionPane.showInputDialog("Introduc tu edad,por favor");
    int edad_usuario=Integer.parseInt(edad);
    //edad_usuario++;
    System.out.println("Hola "+nombre_usuario+" el año que viene tendrás "+ (edad_usuario+1)+" años.");
    }
}
