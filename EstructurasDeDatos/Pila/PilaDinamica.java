package EstructurasDeDatos.Pila;

public class PilaDinamica<T> {
    private static final String MENSAJE_PILA_VACIO="LA PILA ESTA VACIO";
    private Nodo<T> top;
    private int numElementos;

    public PilaDinamica(){
        this.top=null;
        this.numElementos=0;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public int size(){
        return this.numElementos;
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }else{
            T elemento=top.getElemento();
            Nodo<T> siguiente=top.getSiguiente();
            top=null; //Java colectro limpia el elemento
            top=siguiente;
            numElementos--;
            return elemento;
        }
    }

    public void push(T elemento){
        Nodo<T> nuevoNodo=new Nodo<T>(elemento, top);
        this.top=nuevoNodo;
        numElementos++;
    }

    public T top(){
        return isEmpty() ? null : this.top.getElemento();
    }

    public void clearPila(){
        while (top!=null) {
            pop();
        }
    }

    public String toString(){
        if(isEmpty()){
            return MENSAJE_PILA_VACIO;
        }
        Nodo<T> nodoTop=top;
        String pilaString="";
        while(nodoTop!=null){
            pilaString=pilaString+nodoTop.toString();
            nodoTop=nodoTop.getSiguiente();
        }
        return pilaString;
    }
}
