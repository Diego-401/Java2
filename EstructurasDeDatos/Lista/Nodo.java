package EstructurasDeDatos.Lista;

public class Nodo<T> {
    private T elemento;
    private Nodo<T> siguiente;
    private Nodo<T> anterior;

    public Nodo(T elemento, Nodo<T> sigiente,Nodo<T> anterior){
        this.siguiente=sigiente;
        this.anterior=anterior;
        this.elemento=elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return elemento + "\n";
    }
}
