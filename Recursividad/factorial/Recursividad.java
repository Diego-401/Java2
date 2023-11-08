package Recursividad.factorial;

import java.util.Scanner;

public class Recursividad {
    private static String MENSAJE_INICIO="POR FAVOR INGRESA UN NUMERO:";
    private static String MENSAJE_NUMERO_INVALIDO="NUMERO NO VALIDO, POR FAVOR INGRESA UN NUMERO ENTERO :";
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(MENSAJE_INICIO);
        int numeroIngresado=0;
        do{
            numeroIngresado=validarParseo(sc.nextLine());
            if(numeroIngresado==-1)
                System.out.println(MENSAJE_NUMERO_INVALIDO);
        }while(numeroIngresado==-1);
        System.out.println(factorial(numeroIngresado));
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

    public static int factorial(int numero){
        if(numero<2){
            return 1;
        }
        return numero*factorial(numero-1);
    }
}
