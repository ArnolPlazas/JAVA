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
public class AplicacionHerencia1 {
    public static void main(String [] args ){
        Persona osvel=new Persona();
            osvel.cambiaNombre("Osvel");
            osvel.cambiaSexo('M');
            System.out.println("Persona= "+osvel.toString());
            
            Alumno israel=new  Alumno();
            israel.cambiaNombre("Israel");
            israel.cambiaSexo('M');
            israel.cambiaMatricula(12345);
            System.out.println("Alumno= "+israel.toString());          
    }
}
