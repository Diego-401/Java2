package Recursividad.factorial;

import java.util.Scanner;

public class Factorial {

    private static String MENSAJE_INICIO="POR FAVOR INGRESA UN NUMERO:";
    private static String MENSAJE_NUMERO_INVALIDO="NUMERO NO VALIDO, POR FAVOR INGRESA UN NUMERO ENTERO :";
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(MENSAJE_INICIO);
        int numeroIngresado=0;
        int factorial=1;
        do{
            numeroIngresado=validarParseo(sc.nextLine());
            if(numeroIngresado==-1)
                System.out.println(MENSAJE_NUMERO_INVALIDO);
        }while(numeroIngresado==-1);

        for(int i=1;i<numeroIngresado+1;i++){
            factorial*=i;
        }
        System.out.println(factorial);
        sc.close();
    }
    
    public static int validarParseo(String numeroIngresado){
        int resultado=-1;
        try{
            ControladorExceptiones valir=ControladorExceptiones.getIntancia();
            valir.validar(numeroIngresado);
            resultado=Integer.parseInt(numeroIngresado); 
        }catch(ExcepcionesFactorial e){
            e.printStackTrace();
        }
        return resultado;
    }
}
