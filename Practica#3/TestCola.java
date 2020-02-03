import java.util.Scanner;

public class TestCola {
    public static Scanner CADENA = new Scanner(System.in);
    public static Scanner ENTERO = new Scanner(System.in);

    public static final int SALIR = 4;
    public static String nombre;
    public static final Cola cola = new Cola();

    public static void main(String[] args) {
        int op = Integer.parseInt(menu());
        while (op != SALIR) {
            limpiarPantalla();
            switch (op) {
                case 1:
                    llenarCola();
                    break;
                case 2:
                    cola.imprimirCola();
                    break;
                case 3:
                    System.out.println("Ingrese posicion: ");
                    cola.iterarDuplicados(ENTERO.nextInt());
                    System.out.println("Resultado: " + cola.obtenerFrente().getDato() + "\n");
                    break;
                case 4:

                default:
                    System.out.println("Opción incorrecta!");
                    break;
            }
            op = Integer.parseInt(menu());
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void llenarCola() {
        boolean salir = true;
        do {
            System.out.println("Ingrese elemento: ");
            nombre = CADENA.nextLine();
            cola.encolar(nombre);
            System.out.println("¿Desea continuar? 1.-SI, 2.-No");
            salir = ENTERO.nextInt() != 1;
            limpiarPantalla();
        } while (!salir);
    }

    public static String menu() {
        String linea = String.format("%-35s|\n%-35s|\n%-35s|\n%-35s|\n%-35s|",
                "1.-Ingresar elementos ",
                "2.-Imprimir Cola: ",
                "3.-obtener elemento ",
                "4.-Salir",
                "Ingrese opcion: ");
        System.out.println(linea);
        String op = CADENA.nextLine();
        return op.matches("\\d*") ? op : "-1";
    }

}
