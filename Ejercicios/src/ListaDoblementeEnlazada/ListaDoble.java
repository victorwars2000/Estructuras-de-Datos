package ListaDoblementeEnlazada;

public class ListaDoble<T extends Comparable<T>> {

    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int numNodos;

    public void agregatAlInicio(T coeficiente, T exponente) {

        NodoDoble<T> nvoNodo = new NodoDoble<>(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nvoNodo;
            cola = nvoNodo;
        } else {
            cabeza.setAnterior(nvoNodo);
            nvoNodo.setSiguiente(cabeza);
            cabeza = nvoNodo;

        }
        numNodos++;
    }

    public void agregarAlFinal(T coeficiente, T exponente) {

        NodoDoble<T> nvoNodo = new NodoDoble<>(coeficiente, exponente);
        if (cola == null) {
            cabeza = nvoNodo;
            cola = nvoNodo;
        } else {
            cola.setSiguiente(nvoNodo);
            nvoNodo.setAnterior(cola);
            cola = nvoNodo;
            numNodos++;
        }
    }

    public void agregarEnUnIndice(int indice, T coeficiente, T exponente) {

        if (indice < 1 || indice > numNodos) System.out.println("EL indice fuera de rango");
        else {
            NodoDoble<T> nvoNodo = new NodoDoble<>(coeficiente, exponente);
            int contador = 1;
            NodoDoble<T> actual = cabeza;
            NodoDoble<T> anterior = null;
            while (actual != null && contador < indice) {
                anterior = actual;
                actual = actual.getSiguiente();
                contador++;
            }

            if (anterior == null) agregatAlInicio(coeficiente, exponente);
            else {
                nvoNodo.setSiguiente(actual);
                assert actual != null;
                actual.setAnterior(nvoNodo);
                nvoNodo.setAnterior(anterior);
                anterior.setSiguiente(nvoNodo);
            }
            numNodos++;
        }
    }

    public void agregarOrdenado(T coeficiente, T exponente) {

        NodoDoble<T> nvoNodo = new NodoDoble<>(coeficiente, exponente);
        NodoDoble<T> actual = cabeza;
        NodoDoble<T> anterior = null;

        if (actual == null) {
            cabeza = nvoNodo;
            cola = nvoNodo;
        } else {

            while (actual != null && (actual.getExponente().compareTo(exponente)) < 0) {
                anterior = actual;
                actual = actual.getSiguiente();
            }

            if (anterior == null) {
                nvoNodo.setSiguiente(actual);
                actual.setAnterior(nvoNodo);
                cabeza = nvoNodo;
            } else if (actual == null) agregarAlFinal(coeficiente, exponente);
            else {
                nvoNodo.setSiguiente(actual);
                actual.setAnterior(nvoNodo);
                nvoNodo.setAnterior(anterior);
                anterior.setSiguiente(nvoNodo);
            }
            numNodos++;
        }

    }

    public void imprimirLista() {
        NodoDoble<T> temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getCoeficiente() + "x^" + temp.getExponente());
            temp = temp.getSiguiente();
        }
    }

    public int tamanio() {
        return numNodos;
    }

}
