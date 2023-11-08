package Recursividad.factorial;

public class ControladorExceptiones {
    private static ControladorExceptiones intance;
    private static final String MENSAJE_ERROR_PARSEO="EL NUMERO INGRESADO NO ES UN STRING";

    private ControladorExceptiones(){}
    public static ControladorExceptiones getIntancia(){
        if (intance==null) {
            intance=new ControladorExceptiones();
        }
        return intance;
    }
    
    public void validar(String numero) throws ExcepcionesFactorial{
        try{
            Integer.parseInt(numero);
        }catch(Exception e){
            throw new ExcepcionesFactorial(MENSAJE_ERROR_PARSEO);
        }
    }
}
