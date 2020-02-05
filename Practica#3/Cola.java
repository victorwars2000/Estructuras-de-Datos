public class Cola {
    private static final int MAX = 100;
    private NodoCola frente;
    private NodoCola ultimo;
    private int numNodos;

    public boolean estaVacio() {
        return frente == null;
    }

    public int obtenerTamanio() {
        return numNodos;
    }

    public boolean encolar(Object dato) {
        NodoCola nvoNodo = new NodoCola(dato);
        if (frente == null) {
            ultimo = nvoNodo;
            frente = nvoNodo;
            numNodos++;
            return true;
        } else if (numNodos >= MAX) {
            System.out.println("Cola llena");
            return false;
        } else {
            ultimo.setAnterior(nvoNodo);
            nvoNodo.setSiguiente(ultimo);
            ultimo = nvoNodo;
            numNodos++;
            return true;
        }
    }

    public Object descolar() {
        if (estaVacio()) {
            System.out.print("La cola esta vacia: ");
            return null;
        } else if (ultimo.getSiguiente() == null) {
            Object dato = ultimo.getDato();
            frente = ultimo = null;
            numNodos--;
            return dato;
        } else {
            Object dato = frente.getDato();
            frente = frente.getAnterior();
            frente.setSiguiente(null);
            numNodos--;
            return dato;
        }
    }

    public NodoCola obtenerFrente() {
        return this.frente;
    }

    public void limpiarCola() {
        frente = null;
    }

    public void imprimirCola() {
        NodoCola temp = ultimo;
        while (temp != null) {
            System.out.print("-->" + temp.getDato());
            temp = temp.getSiguiente();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////////////////////////////
    // Problema #1
    public void duplicarDatos() {
        if (estaVacio()) {
            System.out.println("La cola esta vacia");
        } else {
            Object obj = frente.getDato();
            descolar();
            encolar(obj);
            encolar(obj);
        }
    }

    public void iterarDuplicados(int posicion) {
        for (int i = 0; i < posicion; i++) {
            duplicarDatos();
        }
    }

    //////////////////////////////////////////////////////////////////////////////////
    // Problema #2

    public int obtenerTiempoProceso(Cola ordenIdeal) {

        NodoCola temp = frente;
        int cont = 0;
        NodoCola ordenI = ordenIdeal.obtenerFrente();
        while (temp != null) {
            if (temp.getDato() == ordenI.getDato() || compararCola(ordenIdeal.obtenerCadena()))
                break;
            cont++;
            encolar(frente.getDato());
            descolar();
        }

        while (ultimo != null) {
            descolar();
            cont++;
        }

        return cont;
    }

    public boolean compararCola(String cadena) {
        return this.obtenerCadena().equals(cadena);
    }

    public String obtenerCadena() {
        String c = "";
        NodoCola temp = ultimo;
        while (temp != null) {
            c += temp.getDato() + "";
            temp = temp.getSiguiente();
        }
        return c;
    }
}
