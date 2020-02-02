import java.util.Scanner;

public class DemoListaDoble {
    public static final Scanner INPUT = new Scanner(System.in);
    public static final int SALIR = 3;
    public static int coeficiente;
    public static int exponente;
    public static void main(String[] args) {

        int opcion = menu();
        do {
            switch (opcion) {
                case 1:
                    ListaDoble lista1 = llenarLista("LLENAR LISTA 1: ");
                    ListaDoble lista2 = llenarLista("LLENAR LISTA 2: ");

                    NodoDoble head1 = lista1.obtenerCabeza();
                    NodoDoble head2 = lista2.obtenerCabeza();

                    System.out.println("LISTA 1: ");
                    lista1.imprimirLista();
                    System.out.println("LISTA 2: ");
                    lista2.imprimirLista();

                    ListaDoble lista3 = new ListaDoble();
                    NodoDoble head3 = lista3.unirDosListas(head1, head2);
                    lista3.setCabeza(head3);

                    System.out.println("LISTA 3: ");
                    lista3.imprimirLista();

                    System.out.println("RESULTADO DE LA SUMA: ");
                    NodoDoble head4 = lista3.sumarListas(head3);
                    lista3.setCabeza(head4);
                    lista3.imprimirLista();
                    break;
                case 2:
                    ListaDoble lista01 = llenarLista("LLENAR LISTA 1");
                    ListaDoble lista02 = llenarLista("LLENAR LISTA 2");

                    System.out.println("LISTA 1: ");
                    lista01.imprimirLista();
                    System.out.println("LISTA 2: ");
                    lista02.imprimirLista();

                    NodoDoble head01 = lista01.obtenerCabeza();
                    NodoDoble head02 = lista02.obtenerCabeza();
                    ListaDoble lista03 = new ListaDoble();
                    NodoDoble head03 = lista03.multiplicarDosListas(head01,head02);
                    lista03.setCabeza(head03);

                    System.out.println("PRODUCTO SIN SUMAR EXPONENTES REPETIDOS: ");
                    lista03.imprimirLista();
                    lista03.sumarListas(head03);

                    System.out.println("LISTA 3 RESULTADO: ");
                    lista03.imprimirLista();
                    break;
                default:
                    System.out.println("Error, ingrese una opcion valida!");
                    break;
            }
            opcion = menu();
        }while (opcion != SALIR);
    }

    public static int menu(){
        System.out.printf("\n%s\n%s\n%s\n%s\n",
                "1.-Sumar polinomios",
                "2.-Multiplicar polinomios",
                "3.-Salir",
                "Ingrese opcion: ");
        return INPUT.nextInt();
    }


    public static int pedirDatos(String informacion){
        System.out.println(informacion);
        return INPUT.nextInt();
    }

    public static ListaDoble llenarLista(String mensaje){
        System.out.println(mensaje);
        ListaDoble lista = new ListaDoble();
        int opcion = 0;
        while (opcion != 1){
            coeficiente = pedirDatos("Ingrese coeficiente");
            exponente = pedirDatos("Ingrese exponente");
            lista.agregarOrdenado(coeficiente, exponente);
            System.out.println("Ingrese [1] para salir ó cualquier otro numero para continuar: ");
            opcion = INPUT.nextInt();
        }
        return lista;
    }
}
