package EstructurasDeDatos.Pila;

public class Ejercicio {
    public static void main(String [] args){
        PilaDinamica<Integer> pilaDinamica=new PilaDinamica<Integer>();
        pilaDinamica.push(5);
        pilaDinamica.push(3);
        pilaDinamica.push(4);
        pilaDinamica.push(1);
        pilaDinamica.push(2);
        pilaDinamica.push(9);

        System.out.println(pilaDinamica.toString());
        System.out.println("Elemento top de la pila: "+pilaDinamica.top());
        System.out.println("Numero de elementos en la pila: "+pilaDinamica.size());
        System.out.println("Sacando el elemento: "+pilaDinamica.pop());

        System.out.println(pilaDinamica.toString());
        System.out.println("Elemento top de la pila: "+pilaDinamica.top());
        System.out.println("Numero de elementos en la pila: "+pilaDinamica.size());

        System.out.println("Limpiando la pila");
        pilaDinamica.clearPila();
        System.out.println(pilaDinamica.toString());
        System.out.println("Elemento top de la pila: "+pilaDinamica.top());
        System.out.println("Numero de elementos en la pila: "+pilaDinamica.size());
        
    }    
}
