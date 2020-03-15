public class Principal {
    public static final int SALIR = 3;

    public static void main(String[] args) {
        int opcion = Metodos.menu();
        do{
            switch (opcion){
                case 1:
                    int numeroDeRondas = Utilities.enterInteger("Ingrese el numero de rondas: ");
                    int valorPremio = Utilities.enterInteger("Ingrese el valor del premio: ");
                    Premio premio = new Premio(valorPremio);
                    Metodos.generarRonda(numeroDeRondas, premio);
                    break;
                case 2:
                    Metodos.generarRondasAleatorias();
                    break;
                default:
                    System.out.println("opcion incorrecta!");
                    break;
            }
            opcion = Metodos.menu();
        }while (opcion != SALIR);
    }
}
