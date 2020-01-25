package ListaDoblementeEnlazada;

public class DemoListaDoble {
    public static void main(String[] args) {
        ListaDoble lista1 = new ListaDoble();
        lista1.agregarOrdenado(2, 2);
        lista1.agregarOrdenado(8, 3);
        lista1.agregarOrdenado(5, 1);
        lista1.agregarOrdenado(1, 5);

        ListaDoble lista2 = new ListaDoble();
        lista2.agregarOrdenado(4, 2);
        lista2.agregarOrdenado(2, 0);
        lista2.agregarOrdenado(2, 1);
        lista2.agregarOrdenado(2, 5);

        NodoDoble head1 = lista1.obtenerCabeza();
        NodoDoble head2 = lista2.obtenerCabeza();

        System.out.println("Lista 1");
        lista1.imprimirLista();
        System.out.println("\nLista 2");
        lista2.imprimirLista();

        ListaDoble lista3 = new ListaDoble();
        NodoDoble head3 = lista3.unirDosListas(head1, head2);
        lista3.setCabeza(head3);
        System.out.println("\nLista3");
        lista3.imprimirLista();
        System.out.println("\nSuma");
        NodoDoble head4 = lista3.sumarDosListas(head3);
        lista3.setCabeza(head4);
        lista3.imprimirLista();

    }
}
