package Recursividad.MaximoMinimo;

public class Recursivo {
    private static final String MENSAJE_MAXIMO="EL NUMERO MAXIMO ES: ";
    private static final String MENSAJE_MINIMO="EL NUMERO MINIMO ES: ";
    public static void main(String [] args){
        int[] arrayNumeros={3,4,1,11,6,8,9,13,0};
        int max=arrayNumeros!=null ? arrayNumeros[0] : 0;
        int min=max;
        
        System.out.println(MENSAJE_MAXIMO+ maximo(max,0,arrayNumeros));
        System.out.println(MENSAJE_MINIMO+ minimo(min,0,arrayNumeros));
        System.out.println(MENSAJE_MAXIMO+ maximo(0,arrayNumeros));
        System.out.println(MENSAJE_MINIMO+ minimo(0,arrayNumeros));
    }
    
    public static int minimo(int min,int indice,int[] arrayNumeros){
        if(indice<arrayNumeros.length){
            if(arrayNumeros[indice]<min){
                min=minimo(arrayNumeros[indice],indice++,arrayNumeros);
            }else{
                min=minimo(min,indice+1,arrayNumeros);
            }
        }
        return min;
    }

    public static int minimo(int indice,int[] arrayNumeros){
        int min=Integer.MAX_VALUE;
        if(indice<arrayNumeros.length){
            min= Math.min(arrayNumeros[indice], minimo(indice+1,arrayNumeros));
        }
        return min;
    }

    public static int maximo(int max,int indice,int[] arrayNumeros){
        if(indice<arrayNumeros.length){
            if(arrayNumeros[indice]>max){
                max=maximo(arrayNumeros[indice],indice++,arrayNumeros);
            }else{
                max=maximo(max,indice+1,arrayNumeros);
            }
        }
        return max;
    }

    public static int maximo(int indice,int[] arrayNumeros){
        int max=Integer.MIN_VALUE;
        if(indice<arrayNumeros.length){
            max= Math.max(arrayNumeros[indice], maximo(indice+1,arrayNumeros));
        }
        return max;
    }
}
