package Java.PatronesDeDiseno.Factory;

/*Clase encargada de crear transportes*/
public class TransporteFactory {
    private static String IS_AVION="avion";
    private static String IS_BARCO="barco";
    private static String IS_CAMION="camion";
    
    public Transporte creatTransporte(String tipoTransporte){
        Transporte transporte = null;
        if(tipoTransporte.equalsIgnoreCase(IS_AVION)){
            transporte = new Avion();
        }else if(tipoTransporte.equalsIgnoreCase(IS_BARCO)){
            transporte = new Barco();
        }else if(tipoTransporte.equalsIgnoreCase(IS_CAMION)){
            transporte = new Camion();
        }
        return transporte;
    }
}
