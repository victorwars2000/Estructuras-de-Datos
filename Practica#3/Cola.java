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

    //M >= N
    //{a0, a1, a2, ... , aN}
    //{a1, a2, ... , aN, a0, a0}
    //{a3, ..., aN, a1, a1, a2, a2}
    
    //Entrada: {Amy, Joe, Luis}, 6
    /** 
     *1 { Joe, Luis, Amy, Amy }
     *2 { Luis, Amy, Amy, Joe, Joe }
     *3 { Amy, Amy, Joe, Joe, Luis, Luis }
     *4 { Amy, Joe, Joe, Luis, Luis, Amy, Amy }
     *5 { Joe, Joe, Luis, Luis, Amy, Amy, Amy, Amy }
     *6 { Joe, Luis, Luis, Amy, Amy, Amy, Amy, Joe, Joe }
    */
    //Salida: Joe

    //descolar
    //encolar
    

    public void pocionMagica(int numPociones){
        
        while(obtenerTamanio() <= numPociones){
            

        }
    }

    
    

}