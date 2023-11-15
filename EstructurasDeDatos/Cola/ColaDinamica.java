package EstructurasDeDatos.Cola;

public class ColaDinamica<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int numeroElementos;
    private static final String MENSAJE_QUEUE_VACIO="LA QUEUE ESTA VACIO";

    public ColaDinamica(){
        primero=null;
        ultimo=null;
        numeroElementos=0;
    }

    public boolean isEmpty(){
        return primero==null;
    }
    public int size(){
        return numeroElementos;
    }
    public T primero(){
        if(isEmpty())
            return null;
        return primero.getElemento();
    }
    public T dequeue(){
        if(isEmpty()){
            return null;
        }else{
            Nodo<T> aux=primero.getSiguiente();
            T elemento=primero.getElemento();
            primero=null;
            primero=aux;
            if (isEmpty()) {
                ultimo=null;
            }
            numeroElementos--;
            return elemento;
        }
    }
    public T enqueue(T elemento){
        Nodo<T> nuevoNodo=new Nodo<T>(elemento, null);
        if(isEmpty()){
            primero=nuevoNodo;
        }else{
            ultimo.setSiguiente(nuevoNodo);
        }
        ultimo=nuevoNodo;
        numeroElementos++;
        return nuevoNodo.getElemento();
    }

    public void cleanQueue(){
        while (!isEmpty()) {
            dequeue();   
        }
    }

    @Override
    public String toString(){
        String resultado="";
        if(isEmpty()){
            resultado=MENSAJE_QUEUE_VACIO;
        }else{
            Nodo<T> nodo=primero;
            while (nodo!=null) {
                resultado+=nodo.toString();
                nodo=nodo.getSiguiente();
            }
        }
        return resultado;
    }
    
}
