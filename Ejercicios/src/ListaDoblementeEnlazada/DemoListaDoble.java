package ListaDoblementeEnlazada;

public class DemoListaDoble {
    public static void main(String[] args) {
        ListaDoble<Integer> listaDoble = new ListaDoble<>();
        listaDoble.agregarOrdenado(2, 2);
        listaDoble.agregarOrdenado(8, 3);
        listaDoble.agregarOrdenado(5, 1);
        listaDoble.agregarOrdenado(1, 5);

        listaDoble.imprimirLista();

    }
}
