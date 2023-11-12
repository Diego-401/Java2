package Recursividad.MaximoMinimo;

public class MaximoMinimo {
    private static final String MENSAJE_MAXIMO="EL NUMERO MAXIMO ES: ";
    private static final String MENSAJE_MINIMO="EL NUMERO MINIMO ES: ";
    public static void main(String [] args){
        int[] arrayNumeros={3,4,1,11,6,8,9,13,0};
        //int[] arrayNumeros=null;
        int maximo=arrayNumeros!=null ? arrayNumeros[0] : 0;
        int minimo=maximo;
        if(arrayNumeros!=null){
            for(int numero:arrayNumeros){
                if(maximo<numero){
                    maximo=numero;
                }
                if(minimo>numero){
                    minimo=numero;
                }
            }
        
            /*for(int i=0;i<arrayNumeros.length;i++){
                if(minimo>arrayNumeros[i]){
                    minimo=arrayNumeros[i];
                }
            }*/
        }
        System.out.println(MENSAJE_MAXIMO+ maximo);
        System.out.println(MENSAJE_MINIMO+ minimo);

    }
}
