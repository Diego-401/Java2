package EstructurasDeDatos.Cola;

public class Ejercicio {
    public static void main(String [] args){
        ColaDinamica<Integer> colaDinamica=new ColaDinamica<Integer>();
        colaDinamica.enqueue(1);
        colaDinamica.enqueue(2);
        colaDinamica.enqueue(3);
        System.out.println(colaDinamica.toString());
        colaDinamica.cleanQueue();
        System.out.println(colaDinamica.toString());
        colaDinamica.enqueue(1);
        colaDinamica.enqueue(2);
        colaDinamica.enqueue(3);
        System.out.println("El tamaño es: "+colaDinamica.size());
        System.out.println("La Queue esta vacia?: "+colaDinamica.isEmpty());
        System.out.println("Primer elemento: "+colaDinamica.primero());
        System.out.println("Eliminando el elemento: "+colaDinamica.dequeue());
        System.out.println(colaDinamica.toString());
    }
}
