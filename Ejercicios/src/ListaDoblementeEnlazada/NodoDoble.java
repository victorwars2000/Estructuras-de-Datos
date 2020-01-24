package ListaDoblementeEnlazada;

public class NodoDoble<T extends Comparable<T>> {
    private T coeficiente;
    private T exponente;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;

    public NodoDoble(T coeficiente, T exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public T getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(T coeficiente) {
        this.coeficiente = coeficiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getExponente() {
        return exponente;
    }

    public void setExponente(T exponente) {
        this.exponente = exponente;
    }
}
