/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SENA;

/**
 *
 * @author arnol
 */
public class AplicacionPolimorfismo1 {
    public static void main (String [] args){
        Vaca lola=new Vaca();
        Animal animal=new Vaca();
        Serpiente serpiente=new Serpiente();
        
        System.out.println("Lola dice: "+lola.habla());
        System.out.println("Animal dice: "+animal.habla());
        System.out.println("Serpiente dice: "+serpiente.habla());
        
        
    }
}
