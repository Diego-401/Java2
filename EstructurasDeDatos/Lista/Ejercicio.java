package EstructurasDeDatos.Lista;

public class Ejercicio {
    public static void main(String [] args){
        ListaDinamica<Integer> listaDinamica=new ListaDinamica<Integer>();
        listaDinamica.addFirst(1);
        listaDinamica.add(2, 0);
        listaDinamica.add(3, 1);
        System.out.println(listaDinamica.toString());
        Nodo<Integer> nodo=listaDinamica.getNodo(2);
        System.out.println(nodo.getElemento().toString());
    }    
}
