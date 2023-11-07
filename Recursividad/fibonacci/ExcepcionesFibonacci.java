package Recursividad.fibonacci;

public class ExcepcionesFibonacci extends Exception{
    public static final long serialVersionUID=700L;
    public ExcepcionesFibonacci(){
        
    }
    public ExcepcionesFibonacci(String mensaje){
        super(mensaje);
    }   
}
