/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afplazasac
 */
public class Random {
    public static void main (String [] args){
        
        int contador=(int)(Math.random()*20);
        int aleatorio;
        
        for(int i=0;i<=contador;i++){
            
            aleatorio=(int)(Math.random()*47)+18;
            System.out.print(aleatorio+ " ");
            
        }
    }

    int nextInt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
