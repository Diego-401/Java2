package EstructurasDeDatos.Lista;

public class ListaDinamica<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int numeroElementos;
    private static final String LISTA_VACIA="LA LISTA SE ENCUENTRA VACIA"; 
    
    public ListaDinamica(){
        this.primero=null;
        this.ultimo=null;
        this.numeroElementos=0;
    }

    public boolean isEmpty(){
        return primero==null;
    }

    public int size(){
        return numeroElementos;
    }

    public Nodo<T> getNodo(int index){
        Nodo<T> seleccionado=null;
        if(index>-1 && index<numeroElementos && !isEmpty()){
            if(index==0){
                seleccionado=primero;
            }else if(index==numeroElementos-1){
                seleccionado=ultimo;
            }else{
                seleccionado=primero;
                int i=0;
                while(i < index){
                    i++;
                    seleccionado=seleccionado.getSiguiente();
                }
            }
        }
        return seleccionado;
    }
    
    public T getFirst(){
        T elemento=null;
        if(!isEmpty())
            elemento=this.primero.getElemento();
        return elemento;
    }

    public T getLast(){
        T elemento=null;
        if(!isEmpty())
            elemento=this.ultimo.getElemento();
        return elemento;
    }

    public T get(int index){
        T seleccionado=null;
        if(index>-1 && index<numeroElementos && !isEmpty()){
            if(index==0){
                seleccionado=getFirst();
            }else if(index==numeroElementos-1){
                seleccionado=getLast();
            }else{
                seleccionado=getNodo(index).getElemento();
            }
        }
        return seleccionado;
    }

    public T addFirst(T elemento){
        Nodo<T> nuevoNodo=new Nodo<T>(elemento, null, null);
        if(isEmpty()){
            primero=nuevoNodo;
            ultimo=nuevoNodo;
        }else{
            Nodo<T> aux=primero;
            aux.setAnterior(nuevoNodo);
            nuevoNodo.setSiguiente(aux);
            primero=nuevoNodo;

        }
        numeroElementos++;
        return primero.getElemento();
    }

    public T addLast(T elemento){
        Nodo<T> nuevoNodo=new Nodo<T>(elemento, null, null);
        if(isEmpty()){
            primero=nuevoNodo;
            ultimo=nuevoNodo;
        }else{
            Nodo<T> aux=ultimo;
            aux.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(aux);
            ultimo=nuevoNodo;
        }
        numeroElementos++;
        return ultimo.getElemento();
    }
    
    public T add(T elemento, int index){
        T elementoNuevo=null;
        if(index>-1 && index<numeroElementos && !isEmpty()){
            if(index==0){
               elementoNuevo=addFirst(elemento);
            }else if(index==size()-1){
               elementoNuevo=addLast(elemento);
            }else{
                Nodo<T> actual=getNodo(index);
                Nodo<T> anteriorActual=actual.getAnterior();
                Nodo<T> nuevoNodo= new Nodo<T>(elemento, actual, anteriorActual);
                if(anteriorActual!=null)
                    anteriorActual.setSiguiente(nuevoNodo);
                actual.setAnterior(nuevoNodo);
                elementoNuevo=nuevoNodo.getElemento();
            }
        }
        numeroElementos++;
        return elementoNuevo;
    }

    @Override
    public String toString(){
        String resultado="";
        if(!isEmpty()){
            Nodo<T> aux=primero;
            while (aux!=null) {
                resultado+=aux.getElemento().toString()+"\n";
                aux=aux.getSiguiente();
            }
        }else{
            resultado=LISTA_VACIA;
        }
        return resultado;
    }
}
