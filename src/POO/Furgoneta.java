
package POO;

public class Furgoneta extends Coche {
    private int capacidad_carga;
    private int plaza_extra;
    
    public Furgoneta(int plaza_extra,int capacidad_carga){
        super();//llamar al contructor de la clase padre
        this.capacidad_carga=capacidad_carga;
        this.plaza_extra=plaza_extra;
    }
    
    public String dimeDatosFugoneta(){
        return"La capacidad de carga es: "+capacidad_carga+ "  y las plazas son: "+ plaza_extra;
    }
}
