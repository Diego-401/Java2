package Recursividad.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]){
        System.out.println("Ingresa el numero de fibonacci");
        Scanner sn=new Scanner(System.in);
        int numeroInsertado=0;
        do{
            numeroInsertado=validaParso(sn.nextLine());
        }while (numeroInsertado<=-1);
        int numeroBase=0;
        int numeroBaseNuevo=0;
        int numeroInicialFibonacci=1;
        for(int i=0;i<numeroInsertado;i++){
            numeroBaseNuevo=numeroInicialFibonacci;
            numeroInicialFibonacci=numeroBase+numeroBaseNuevo;
            numeroBase=numeroBaseNuevo;
        }
        System.out.println(numeroBase);
        sn.close(); //Finaliza el ingreso
    }
    
    /**
     * @param numeroIngresado
     * @return int
     */
    private static int validaParso(String numeroIngresado){
        int respuesta=-1;
        try{
            ControladorExceptiones valida=ControladorExceptiones.getInstancia();
            valida.parseoValido(numeroIngresado);
            respuesta=Integer.parseInt(numeroIngresado);
        }catch(ExcepcionesFibonacci e){
            e.printStackTrace();
        }
        return respuesta;
    }
}
