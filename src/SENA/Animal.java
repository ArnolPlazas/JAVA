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
public class Animal {
    private int peso=0;
    
    public void cambiaPeso(int peso){
        this.peso=peso;       
    }
    
    public int obtenPeso(){
        return peso;
    }
    
    public String habla(){
        return "Los animales no hablan";
    }
}
