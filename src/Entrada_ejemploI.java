import java.util.*;
public class Entrada_ejemploI {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor: ");
        String nombre_usuario=entrada.nextLine();
        
        System.out.println("Introduce tu edad, por favor: ");
        int edad=entrada.nextInt();
        
        System.out.println("Hola "+nombre_usuario+" tu edad en un año sera "+(edad+1)+" años.");
        
    }
}
