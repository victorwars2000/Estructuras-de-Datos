public class Cola{
    private static final int MAX = 10;
    private NodoCola frente;
    private NodoCola ultimo;
    private int numNodos;

    public boolean estaVacio(){
        return frente == null;
    }

    public int obtenerTamanio(){
        return numNodos;
    }

    public boolean encolar(Object dato){
        NodoCola nvoNodo = new NodoCola(dato);
        if(frente == null){
            ultimo = nvoNodo;
            frente = nvoNodo;
            numNodos ++;
            return true;
        }else if(numNodos >= MAX){
            System.out.println("Cola llena");
            return false;    
        }else{
            ultimo.setAnterior(nvoNodo);
            nvoNodo.setSiguiente(ultimo);
            ultimo = nvoNodo;
            numNodos++;
            return true;
        }
    }

    public Object descolar(){
        if(estaVacio()){
            System.out.print("La cola esta vacia: ");
            return null;
        }else if(ultimo.getSiguiente() == null){
            Object dato = ultimo.getDato();
            frente = ultimo = null;
            return dato;     
        }else{
            Object dato = frente.getDato();
            frente = frente.getAnterior();
            frente.setSiguiente(null);
            return dato;
        }
    }

    public void imprimirCola(){
        NodoCola temp = ultimo;
        System.out.print("null");
        while(temp != null){
            System.out.print("-->"+temp.getDato());
            temp = temp.getSiguiente();
        }
        System.out.println("\n");
    }
}