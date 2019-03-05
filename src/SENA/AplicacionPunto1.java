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
public class AplicacionPunto1 {
    private static Punto a,b,c,d,e;
    
    public static void main(String [] args){
        a=new Punto();
        System.out.println("Punto a= "+a.toString());
        System.out.println("Puntos creados= "+Punto.getPuntos());
        
        b=new Punto(1, 2);
        c=new Punto(3.0,4.0);
        System.out.println("Punto b= "+b.toString());
        System.out.println("Punto c= "+c.toString());
        System.out.println("Puntos creados= "+Punto.getPuntos());
        
        d=new Punto(b);
        e=new Punto(c);
        System.out.println("Punto d= "+d.toString());
        System.out.println("Punto e= "+e.toString());
        System.out.println("Puntos creados= "+Punto.getPuntos());  
        
        
    }
}
