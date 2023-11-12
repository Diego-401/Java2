package Recursividad.Inversodenumero;

import java.util.Scanner;

public class Recursividad {
     private static final String MENSAJE_INGRESO="Ingresa un numero entrero";
    private static final String MENSAJE_ERROR="POR FAVOR INGRESA UN NUMERO ENTERO";
    public static void main(String [] args){
        System.out.println(MENSAJE_INGRESO);
        Scanner sc=new Scanner(System.in);
        int numeroIngresado=0;
        do{
            numeroIngresado=validador(sc.nextLine());
            if(numeroIngresado==-1){
                System.out.println(MENSAJE_ERROR);
            }
        }while(numeroIngresado==-1);
        int numeroInverso=0;
        int resultado=inverso(numeroInverso,numeroIngresado);
        System.out.println(resultado);
        sc.close();
    }
    
    public static int validador(String numero){
        int resultado=-1;
        try{
            ControlardorException validador=ControlardorException.getInstancia();
            validador.validar(numero);
            resultado=Integer.parseInt(numero);
        }catch(ExceptionInverso e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    private static int inverso(int numeroInverso, int numeroOriginal){
        if(numeroOriginal<10){
            return (numeroInverso*10)+numeroOriginal%10;
        }
        return inverso((numeroInverso*10)+numeroOriginal%10,numeroOriginal/10);
    }
}
