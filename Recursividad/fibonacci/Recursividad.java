package Recursividad.fibonacci;

import java.util.Scanner;

public class Recursividad {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numeroInsertado=0;
        do{
            numeroInsertado=validarIngreso(sc.nextLine());
        }while(numeroInsertado<=-1);
        System.out.println(fibonacci(numeroInsertado));
        sc.close();
    }
    /**
     * @param numeroIngresado 
     * @return int
     */
    public static int validarIngreso(String numeroIngresado){
        int resultado=-1;
        try{
            ControladorExceptiones validar= ControladorExceptiones.getInstancia();
            validar.parseoValido(numeroIngresado);
            resultado=Integer.parseInt(numeroIngresado);
        }catch(ExcepcionesFibonacci e){
            e.printStackTrace();
        }
        return resultado;
    }

    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }
}
