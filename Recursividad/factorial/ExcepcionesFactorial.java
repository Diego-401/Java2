package Recursividad.factorial;

public class ExcepcionesFactorial extends Exception{
    private static final long serialVersionUID=700l;
    public ExcepcionesFactorial(){
        super();
    }
    
    public ExcepcionesFactorial(String mensaje){
        super(mensaje);
    }
}
