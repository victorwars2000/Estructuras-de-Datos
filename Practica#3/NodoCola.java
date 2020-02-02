public class NodoCola{
    private NodoCola anterior;
    private NodoCola siguiente;
    private Object dato; 
    
    public NodoCola(Object dato){
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoCola getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }
}