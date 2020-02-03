public class Problema2 {
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.encolar(4);
        cola.encolar(3);
        cola.encolar(2);
        cola.encolar(1);

        Cola colaIdeal = new Cola();
        colaIdeal.encolar(1);
        colaIdeal.encolar(4);
        colaIdeal.encolar(3);
        colaIdeal.encolar(2);

        System.out.println("Proceso ingresado: ");
        cola.imprimirCola();
        System.out.println("Proceso ideal: ");
        colaIdeal.imprimirCola();

        System.out.println("Orden original: "+cola.obtenerCadena());
        System.out.println("Orden Ideal: "+colaIdeal.obtenerCadena());

        int tiempo = cola.obtenerTiempoProceso(colaIdeal);
        System.out.println("Unidad de tiempo: "+ tiempo);

        System.out.println("original: "+cola.obtenerCadena());
        System.out.println("Ideal: "+colaIdeal.obtenerCadena());
    }
}