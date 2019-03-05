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
public class Alumno extends Persona{
    protected int matricula;
    
    public Alumno(){
        super();
        matricula=0;
    }
    
    public int obtenMatricula(){
        return matricula;
    }
    
    public void cambiaMatricula(int matricula){
        this.matricula=matricula;
    }

    public void cambiaNombre(String nombre){//Sobrescritura de un metodo heredado de Persona
        this.nombre="al "+nombre;
    }
    
    public String ToString(){
        return ""+super.toString()+" "+matricula;
    }
    
}
