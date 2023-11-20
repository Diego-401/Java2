package EstructurasDeDatos.Cola.EjercicioCine;

import EstructurasDeDatos.Cola.ColaDinamica;

public class EjercicioCine {
    private static final double VALOR_ENTRADA_5_10 =1;
    private static final double VALOR_ENTRADA_11_17 =2.5;
    private static final double VALOR_ENTRADA_18=3.5;
    public static void main(String[] args){
        ColaDinamica<Persona> colaCine=new ColaDinamica<Persona>();  
        rellenarCola(colaCine);
        
        double ingresosSala=0;

        Persona p;
        int tamanoCola=colaCine.size();
        for(int i=0;i<tamanoCola;i++){
            p=colaCine.dequeue();
            int edadPersona=p.getEdad();
            if(edadPersona >=5 && edadPersona<=10){
                ingresosSala=VALOR_ENTRADA_5_10+ingresosSala;
            }else if(edadPersona >=11 && edadPersona<=17){
                ingresosSala=VALOR_ENTRADA_11_17+ingresosSala;
            }else{
                ingresosSala=VALOR_ENTRADA_18+ingresosSala;
            }
        }
        System.out.println(ingresosSala);
    }

    public static void rellenarCola(ColaDinamica<Persona> colaCine){
        int numeroPersonas=Aleatorio.generaNumeroAleatorio(0, 3);
        Persona p;
        for(int i=0; i<numeroPersonas;i++){
            p= new Persona(Aleatorio.generaNumeroAleatorio(5, 60));
            System.out.println("EDAD DE LA PERSONA:"+p.getEdad());
            colaCine.enqueue(p);   
        }
    }
    
}
