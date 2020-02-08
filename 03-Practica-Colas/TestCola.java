import java.util.Scanner;

public class TestCola {
    public static Scanner CADENA = new Scanner(System.in);
    public static Scanner ENTERO = new Scanner(System.in);

    public static final int SALIR = 3;
    public static String nombre;
    public static int numElementos;
    public static final Cola cola = new Cola();
    public static final Cola colaIdeal = new Cola();

    public static void main(String[] args) {
        int op = Integer.parseInt(menu());
        while (op != SALIR) {
            limpiarPantalla();
            switch (op) {
            case 1:
                cola.limpiarCola();
                llenarCola(cola);
                System.out.println("Ingrese la M-ésima posición que desea obtener: ");
                cola.iterarDuplicados(ENTERO.nextInt());
                System.out.println();
                System.out.println("Resultado: " + cola.obtenerFrente().getDato() + "\n");
                break;
            case 2:
                cola.limpiarCola();
                colaIdeal.limpiarCola();
                System.out.println("Ingrese el numero de elementos: ");
                numElementos = ENTERO.nextInt();
                System.out.println("Ingrese los procesos");
                llenarCola(cola, numElementos);
                limpiarPantalla();
                System.out.println("Ingrese orden del proceso ideal");
                llenarCola(colaIdeal, numElementos);
                int tiempo = cola.obtenerTiempoProceso(colaIdeal);
                System.out.println("Total de unidades: " + tiempo);
                break;
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

    public static void llenarCola(Cola cola) {
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

    public static void llenarCola(Cola cola, int numeroDeDatos) {
        int salir = 0;
        while (salir < numeroDeDatos) {
            System.out.print("Ingrese elemento[" + (salir + 1) + "]:");
            nombre = CADENA.nextLine();
            cola.encolar(nombre);
            limpiarPantalla();
            salir++;
        }
    }

    public static String menu() {
        String linea = String.format("\n%-35s|\n%-35s|\n%-35s|\n%-35s|", "1.-Problema 1 ", "2.-Problema 2", "3.-Salir",
                "Ingrese opcion: ");
        System.out.println(linea);
        String op = CADENA.nextLine();
        return op.matches("\\d*") ? op : "-1";
    }

}
