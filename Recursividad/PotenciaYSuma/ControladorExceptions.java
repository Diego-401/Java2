package Recursividad.PotenciaYSuma;

public class ControladorExceptions {
    private static ControladorExceptions instancia;
    private static final String MENSAJE_ERROR="EL NUMERO INGRESADO NO ES UN ENTERO";
    private ControladorExceptions(){}
    public static ControladorExceptions getInstancia(){
        if(instancia==null){
            instancia=new ControladorExceptions();
        }
        return instancia;
    }
    public void validar(String numero) throws ExceptionsPS{
        try{
            Integer.parseInt(numero);
        }catch(Exception e){
            throw new ExceptionsPS(MENSAJE_ERROR);
        }
    }
    
}
