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
public class Persona {
    protected String nombre;
    protected char sexo;
    
    public Persona(){
        nombre=new String();
        sexo=' ';
    }
    
    public String obtenNombre(){
        return nombre;
    }
    
    public void cambiaNombre(String nombre){
        this.nombre=nombre;
    }
    
    public char obtenSexo(){
        return sexo;
    }
    
    public void cambiaSexo(char sexo){
        this.sexo=sexo;
    }
    
    public String toString(){
        return ""+nombre+" "+sexo;
    }
}
