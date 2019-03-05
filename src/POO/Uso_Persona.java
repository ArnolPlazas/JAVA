
package POO;
import java.util.*;

public class Uso_Persona {
    public static void main(String[] args){
        
        Persona[] laspersonas=new Persona[2];
        
        laspersonas[0]=new Empleado2("Luis C",5000,2009,02,25);
        laspersonas[1]=new Alumno("Luis C","Biólogia");
        
        for (Persona p:laspersonas){
            System.out.println(p.dameNombre()+", "+p.dameDescripcion());
        }
        
        
    }
    
}

abstract class Persona{
    private String nombre;
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public String dameNombre(){
        return nombre;
    }
    public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
    public Empleado2(String nom,double sue,int agno,int mes,int dia){
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
        Id=IdSiguiente;
        IdSiguiente++; 
    }
    
    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente=1;
    
    public String dameDescripcion(){
        return "Este empleado tiene un Id= "+Id+" con el sueldo= "+sueldo;
    }
    public double dameSueldo(){//getter
        return sueldo;
    }
    public Date dameFechaContrato(){//getter
        return altaContrato;
    }
    public void subeSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
}

class Alumno extends Persona{
    public Alumno(String nom,String car){
        super(nom);
        carrera=car;
        
    }
    private String carrera;
    
    public String dameDescripcion(){
        return "Este alumno está estudiando la carrera de "+carrera;
    }    
    
}