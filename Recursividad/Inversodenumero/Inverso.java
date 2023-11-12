package Recursividad.Inversodenumero;

import java.util.Scanner;
//Invertir un numero sin hacerlo String
public class Inverso {
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

        int residuo=0;
        int numeroInverso=0;
        boolean siguiente=true;
        do{
            residuo=numeroIngresado%10;
            numeroInverso=(numeroInverso*10)+residuo;
            if(numeroIngresado<10){
                siguiente=false;
            }
            numeroIngresado=numeroIngresado/10;
        }while(siguiente);
        System.out.println(numeroInverso);
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
}
