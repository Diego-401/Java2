package Recursividad.fibonacci;

public class ControladorExceptiones {
    private static final String MENSAJE_PARSEO="EL NUMERO INGRESADO NO ES UN NUMERO ENTERO";
    private static ControladorExceptiones instancia;

    public void parseoValido(String numero) throws ExcepcionesFibonacci{
        try{
            Integer.parseInt(numero);
        }catch(Exception e){
            throw new ExcepcionesFibonacci(MENSAJE_PARSEO);
        }
    }

    private ControladorExceptiones(){
    }

    public static ControladorExceptiones getInstancia(){
        if(instancia==null){
            instancia= new ControladorExceptiones();
        }
        return instancia;
    } 
}
