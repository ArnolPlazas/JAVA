
package POO;

public class Uso_Final_Static {
    public static void main(String[] args){
        Empleados trabajador1=new Empleados("Arnol");
        Empleados trabajador2=new Empleados("Camila");
        Empleados trabajador3=new Empleados("Stiven");
        Empleados trabajador4=new Empleados("Dayana");
        trabajador1.cambiaSeccion("RRHH");
       
        System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+
                "\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());
    }
}
class Empleados{
    public Empleados(String nom){
        nombre=nom;
        seccion="Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
    }
    public void cambiaSeccion(String seccion){//SETTER
        this.seccion=seccion;
    }
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" la sección es "+seccion+" y el Id="+Id;
    }
    public static String dameIdSiguiente(){
        return "El Id siguiente es: "+IdSiguiente;
    }
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;
}