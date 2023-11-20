package EstructurasDeDatos.Cola.EjercicioCine;

public class Aleatorio {
    
    public static int generaNumeroAleatorio(int minimo,int maximo){
        int numero=(int) Math.floor(Math.random()*(minimo-(maximo + 1)) + (maximo + 1)) ;
        return numero;
    }

    public static double generaNumeroRealAleatorio(int minimo, int maximo){
        double numero=Math.rint(Math.floor(Math.random() * (minimo - ((maximo * 100) + 1)) + ((maximo * 100) + 1))) / 100;
        return numero;
    }
}
