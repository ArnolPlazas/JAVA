package POO;
import java.util.*;
public class uso_empleado {
    public static void main(String[]args){
        /*Empleado empleado1=new Empleado("Paco Gomez",8500,1990,12,17);
        Empleado empleado2=new Empleado("Ana Lopez",9500,1995,06,02);
        Empleado empleado3=new Empleado("Maria Martin",10500,2002,03,15);
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre: "+empleado1.dameNombre()+" Suledo: "+
                empleado1.dameSueldo()+ " Fecha de Alta: "+empleado1.dameFechaContrato());
        System.out.println("Nombre: "+empleado2.dameNombre()+" Suledo: "+
                empleado2.dameSueldo()+ " Fecha de Alta: "+empleado2.dameFechaContrato());
        System.out.println("Nombre: "+empleado3.dameNombre()+" Suledo: "+
                empleado3.dameSueldo()+ " Fecha de Alta: "+empleado3.dameFechaContrato());*/
        Jefatura jefe_RRHH=new Jefatura("Juan",5500,2006,9,25);
        jefe_RRHH.estableceIncentivo(2570);
        Empleado[] misEmpleados=new Empleado[6];
        misEmpleados[0]=new Empleado("Paco Gomez",8500,1990,12,17);
        misEmpleados[1]=new Empleado("Ana Lopez",9500,1995,06,02);
        misEmpleados[2]=new Empleado("Maria Martin",10500,2002,03,15);
        misEmpleados[3]=new Empleado("Antonio Fernandez");
        misEmpleados[4]=jefe_RRHH;//Polimorfismo en accion.Principio de sustitucion    
        misEmpleados[5]=new Jefatura("Maria",95000,1990,5,26);
       Jefatura jefe_finanzas=(Jefatura)misEmpleados[5];
       jefe_finanzas.estableceIncentivo(5000);
       Empleado director_comercial=new Jefatura("Sandra",8500,2012,05,05);
       Comparable ejemplo=new Empleado("Elizabeth",9500,2011,06,07);
        if (director_comercial instanceof Empleado){
            System.out.println("Es de tipo jefatura");
        }
        if(ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");
        }
        System.out.println(jefe_finanzas.tomar_decisiones("Dar vacaciones"));
        System.out.println("El jefe "+jefe_finanzas.dameNombre()+" tiene un bonus de: "+
                jefe_finanzas.establece_bonus(500));
        System.out.println(misEmpleados[3].dameNombre()+" tiene un bono de: "+
                misEmpleados[3].establece_bonus(300));
        /*for(int i=0;i<3;i++){
            misEmpleados[i].subeSueldo(5);
        }*/
        for(Empleado e:misEmpleados){
            e.subeSueldo(5);
        }
        /*for(int i=0;i<3;i++){
            System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Suledo: "+
                misEmpleados[i].dameSueldo()+ " Fecha de Alta: "+misEmpleados[i].dameFechaContrato());
        }*/
        Arrays.sort(misEmpleados); //Metodo sort de la clase Arrays para ordenar arreglos.
        for(Empleado e:misEmpleados){
            System.out.println("Nombre: "+e.dameNombre()+" Suledo: "+
                e.dameSueldo()+ " Fecha de Alta: "+e.dameFechaContrato());
        }        
    }
}
class Empleado implements Comparable,Trabajadores{ // Para usar el metodo sort se debe implementar la interfaz Comparable
    public Empleado(String nom,double sue,int agno,int mes,int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
    }
    public Empleado(String nom){
        this(nom,3000,2000,01,01);        
    }
    public  double establece_bonus(double gratificacion){
        return Trabajadores.bonus_base+gratificacion;
    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    public String dameNombre(){ //getter
        return nombre;
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
    public int compareTo(Object miObjeto){ // Este metodo es necesario puesto que se encuentra dentro de la interfaz comparable
        Empleado otroEmpleado=(Empleado) miObjeto; // Casting Object->Empleado
        if(this.sueldo<otroEmpleado.sueldo){
            return -1;
        }
        if(this.sueldo<otroEmpleado.sueldo){
            return 1;
        }
        return 0;
    }
}
final class Jefatura extends Empleado implements Jefes{
    public Jefatura(String nom,double sue,int agno,int mes,int dia){
        super(nom,sue,agno,mes,dia);
    }
    public String tomar_decisiones(String decisiones){
        return "Un miembro de la direccion ha tomado la decisión: "+decisiones;
    }
    public double establece_bonus(double gratificacion){
        double prima=2000;
        return Trabajadores.bonus_base+gratificacion+prima;
    }
    public void estableceIncentivo(double b){
        incentivo=b;
    }
    public double dameSueldo(){
        double sueldoJefe=super.dameSueldo();
        return sueldoJefe+incentivo;
    }
    private double incentivo;
    
}