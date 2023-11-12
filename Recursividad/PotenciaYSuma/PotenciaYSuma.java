package Recursividad.PotenciaYSuma;

import java.util.Scanner;

public class PotenciaYSuma {
    private static final String MENSAJE_INGRESAR_MENU="POR FAVOR INGRESA UNA OPCION: \n1.Potencia \n2.Suma cadena de numeros \n3.Salir";
    private static final String MENSAJE_MENU_INVALIDO="OPCION NO VALIDA POR FAVOR INGRESE ENTRE LOS SIGUIENTES VALORES 1,2 o 3";
    private static final String MENSAJE_DESPEDIDA="VUELVA PRONTO";
    private static final String MENSAJE_NUMERO_BASE_POTENCIA="POR FAVOR INGRESE UN NUMERO ENTERO";
    private static final String MENSAJE_POTENCIA="POR FAVOR INGRESA LA POTENCIA";
    private static final String MENSAJE_NUMERO_SUMA="POR FAVOR INGRESA EL NUMERO A SUMAR";
    private static final String MENSJAE_NUMERO_INVALI="POR FAVOR INGRESE UN NUMERO ENTERO";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(MENSAJE_INGRESAR_MENU);
        int operacion=0;
        do{
            operacion=validar(sc.nextLine());
            if(operacion<0 && operacion<3){
                System.out.println(MENSAJE_MENU_INVALIDO);
            }
        }while(operacion<0 && operacion<3);


        switch (operacion){
            case 1:
                   menuPotencia(sc);
                break;
            case 2:
                    menuSuma(sc);
                break;
            default:
                System.out.println(MENSAJE_DESPEDIDA);
        }
    }
    
    public static int validar(String numeroIngresado){
        int resultado=-1;
        try{
            ControladorExceptions ce=ControladorExceptions.getInstancia();
            ce.validar(numeroIngresado);
            resultado=Integer.parseInt(numeroIngresado);
        }catch(ExceptionsPS e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public static void menuPotencia(Scanner sn){
        int numeroBase=0;
        int potencia=0;
        System.out.println(MENSAJE_NUMERO_BASE_POTENCIA);
        do{
            numeroBase=validar(sn.nextLine());
            if(numeroBase==-1){
                System.out.println(MENSJAE_NUMERO_INVALI);
            }
        }while(numeroBase==-1);
        System.out.println(MENSAJE_POTENCIA);
        potencia=Integer.parseInt(sn.nextLine());
        int resultado=1;
        float resultadoFloat=1L;
        if(potencia>-1){
            for(int i=0;i<potencia;i++){
                resultado=resultado*numeroBase;
            }
            System.out.println(resultado);
        }else{
            float aux=1L/(long)numeroBase;
            for(int i=0;i<(potencia*-1);i++){
                resultadoFloat=(resultadoFloat)*(1f/(float)numeroBase);
            }  
            System.out.println(resultadoFloat); 
        }
    }

    public static void menuSuma(Scanner sn){
        int numeroBase=0;
        boolean interarNuevamente=true;
        int residuo=0;
        int resultado=0;
        System.out.println(MENSAJE_NUMERO_SUMA);
        do{
            numeroBase=validar(sn.nextLine());
            if(numeroBase==-1){
                System.out.println(MENSJAE_NUMERO_INVALI);
            }
        }while(numeroBase==-1);
        do{
            residuo=numeroBase%10;
            resultado=resultado+residuo;
            if(numeroBase<10){
                interarNuevamente=false;
            }
            numeroBase=numeroBase/10;
        }while(interarNuevamente);
        System.out.println(resultado);
    }
}
