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
import java.awt.*;
public class Punto {
    private int x; //variable para la coordenada en x
    private int y;//variable para la coordenada en y
    private static int puntos=0;
    
    
    public Punto(){//método para construir un objeto sin parámetros 
        x=0;
        y=0;
        puntos++;  
    }
    
    public Punto(int x, int y){//método para contruir un objeto con valores enteros
        this.x=x;
        this.y=y;
        puntos++;  
                
    }
    
    public Punto(double x, double y){//método para contruir un objeto con valores double
        this.x=(int)x;
        this.y=(int)y;
        puntos++;  
    }
    
    public Punto(Punto obj){//método para contrur un objeto con otro objeto
        this.x=obj.obtenX();
        this.y=obj.obtenY();
        puntos++;  
    }
    
    public int obtenX(){//método que da el valor de la coordenada x
        return x;
    }
    
    public int obtenY(){//método que da el valor de la coordenada y
        return y;
    }
    
    public void cambiaX(int x){//método que cambia el valor de la coordenada x
        this.x=x;// permite diferenciar la variable de instancia y de parametro
    }
    
    public void cambiaY(int y){//método que cambia el valor de la coordenada x
        this.x=x;// permite diferenciar la variable de instancia y de parametro
    }
    
    public void dibujarPunto(Graphics g){//Dibujar un Punto
        g.fillOval(x, y, 5, 5);
    }
    
    public String toString(){//Obtener un objeto Punto en formato String
        return "("+obtenX()+","+obtenY()+")";
    }
    
    public static int getPuntos(){//
        return puntos;
    }   
}
