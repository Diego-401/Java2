package Java.PatronesDeDiseno.Factory;
/*Polimorfismo */
/*Patron de diseño creacional, busca implementar interface(super case) para crear objetos(subclases)*/
public class Main {
    private static String CREAR_AVION = "avion";
    private static String CREAR_BARCO = "barco";
    private static String CREAR_CAMION = "camion";
    public static void main (String [] args){
        TransporteFactory creadorDeTransporte=new TransporteFactory();

        Transporte avion = creadorDeTransporte.creatTransporte(CREAR_AVION);
        Transporte barco = creadorDeTransporte.creatTransporte(CREAR_BARCO);
        Transporte camion = creadorDeTransporte.creatTransporte(CREAR_CAMION);

        System.out.println(avion.medioDeTransporte());
        System.out.println(barco.medioDeTransporte());
        System.out.println(camion.medioDeTransporte());
    }
}
