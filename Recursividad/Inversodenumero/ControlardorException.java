package Recursividad.Inversodenumero;

public class ControlardorException {
    private static ControlardorException instancia;
    private static final String MENSAJE_ERROR="EL NUMERO INGRESADO NO ES UN ENTERO";
    private ControlardorException(){}
    public static ControlardorException getInstancia(){
        if(instancia==null){
            instancia=new ControlardorException();
        }
        return instancia;
    }

    public void validar(String numero) throws ExceptionInverso{
        try{
            Integer.parseInt(numero);
        }catch(Exception e){
            throw new ExceptionInverso(MENSAJE_ERROR);
        }
    }
    
}
