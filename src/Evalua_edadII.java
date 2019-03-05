import java.util.*;
public class Evalua_edadII {
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce tu edad,por favor");
        int edad=entrada.nextInt();
        
        if(edad<18){
            System.out.println("Eres Adolecente");         
        }
        else if(edad<40){
            System.out.println("Eres Joven");         
        }
        else if(edad<65){
            System.out.println("Eres Maduro");         
        }
        else{
           System.out.println("Cuidate"); 
        }
    }    
}
