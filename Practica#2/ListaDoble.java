public class ListaDoble{

    private NodoDoble cabeza;
    private NodoDoble cola;
    private int numNodos;

    public void agregatAlInicio(int coeficiente, int exponente) {

        NodoDoble nvoNodo = new NodoDoble(coeficiente, exponente);
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

    public void agregarAlFinal(int coeficiente, int exponente) {

        NodoDoble nvoNodo = new NodoDoble(coeficiente, exponente);
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

    public void agregarEnUnIndice(int indice, int coeficiente, int exponente) {

        if (indice < 1 || indice > numNodos) System.out.println("Índice fuera de rango");
        else {
            NodoDoble nvoNodo = new NodoDoble(coeficiente, exponente);
            int contador = 1;
            NodoDoble actual = cabeza;
            NodoDoble anterior = null;
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

    public void agregarOrdenado(int coeficiente, int exponente) {

        NodoDoble nvoNodo = new NodoDoble(coeficiente, exponente);
        NodoDoble actual = cabeza;
        NodoDoble anterior = null;

        if (actual == null) {
            cabeza = nvoNodo;
            cola = nvoNodo;
        } else {

            while (actual != null && actual.getExponente() < exponente) {
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

    public NodoDoble obtenerCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public NodoDoble unirDosListas(NodoDoble cabeza1, NodoDoble cabeza2) {
        if (cabeza1 == null)
            return cabeza2;
        if (cabeza2 == null)
            return cabeza1;

        if (cabeza1.getExponente() <= cabeza2.getExponente() ) {
            cabeza1.setSiguiente(unirDosListas(cabeza1.getSiguiente(), cabeza2));
            return cabeza1;
        }else{
            cabeza2.setSiguiente(unirDosListas(cabeza2.getSiguiente(), cabeza1));
            return cabeza2;
        }
    }

    public NodoDoble sumarListas(NodoDoble head){
        if(head == null || head.getSiguiente() == null)
            return head;

        head.setSiguiente(sumarListas(head.getSiguiente()));

        if(head.getExponente() == head.getSiguiente().getExponente()){
            int res = head.getCoeficiente() + head.getSiguiente().getCoeficiente();
            head.getSiguiente().setCoeficiente(res);
            return head.getSiguiente();
        }else{
            return head;
        }
    }

    public NodoDoble multiplicarDosListas(NodoDoble cabeza1 , NodoDoble cabeza2){
        NodoDoble aux1 = cabeza1;
        NodoDoble aux2 = cabeza2;
        ListaDoble lista = new ListaDoble();
        while (aux1 != null){
            while (aux2 != null){
                int coeficiente = aux1.getCoeficiente() * aux2.getCoeficiente();
                int exponente = aux1.getExponente() + aux2.getExponente();
                lista.agregarOrdenado(coeficiente, exponente);
                aux2 = aux2.getSiguiente();
            }
            aux2 = cabeza2;
            aux1 = aux1.getSiguiente();
        }
        return lista.obtenerCabeza();
    }

    public void imprimirLista() {
        NodoDoble temp = cabeza;
        while (temp.getSiguiente() != null) {
            System.out.print(temp.getCoeficiente() + "x^" + temp.getExponente()+" + ");
            temp = temp.getSiguiente();
        }
        System.out.println(temp.getCoeficiente() + "x^"+temp.getExponente());
    }

    public int tamanio() {
        return numNodos;
    }

}
