public class Metodos {

    public static void generarRondasAleatorias(){
        int numeroRondas = Utilities.generarNumeroAleatorio(1,20);
        Premio premio = new Premio(Utilities.random());
        for(int i = 0 ; i < numeroRondas; i++){
            System.out.println("\n----------------------------------------------RONDA : "+(i+1)+"------------------------------------------------");
            int cantidadEquipos = Utilities.generarNumeroAleatorio(1, 50);
            Equipo[] equipos = registarEquiposAleatorios(cantidadEquipos);
            Ronda ronda = new Ronda(premio,equipos);
            System.out.println("\nEl valor del premio es: "+premio.getPrecio());

            Sort.selectionSort(equipos, ronda);
            System.out.println("El Ganador es: "+ronda.obtenerListaOrdenada()[0]+"\n");

            for(Equipo e: ronda.obtenerListaOrdenada())
                System.out.println(e + "APROXIMACION : "+Math.abs(premio.getPrecio() - e.getValorPropuesto()));
        }
    }

    public  static void generarRonda(int numeroRondas, Premio premio){
        for(int i = 0 ; i < numeroRondas; i++){
            System.out.println("\n----------------------------------------------RONDA : "+(i+1)+"------------------------------------------------");
            int cantidadEquipos = Utilities.enterInteger("Ingrese cantidad de equipos: ");
            Equipo[] equipos = registarEquipos(cantidadEquipos);
            Ronda ronda = new Ronda(premio,equipos);
            System.out.println("El valor del premio es: "+premio.getPrecio());

            Sort.selectionSort(equipos, ronda);
            System.out.println("El Ganador es: "+ronda.obtenerListaOrdenada()[0]+"\n");

            for(Equipo e: ronda.obtenerListaOrdenada())
                System.out.println(e + "APROXIMACION : "+Math.abs(premio.getPrecio() - e.getValorPropuesto()));
        }
    }

    public static Equipo[] registarEquipos(int cantidadEquipos){
        Equipo[] equipos = new Equipo[cantidadEquipos];
        for(int i = 0; i<equipos.length; i++){
            equipos[i] = pedirDatosEquipo();
        }
        return equipos;
    }
    public static Equipo[] registarEquiposAleatorios(int cantidadEquipos){
        Equipo[] equipos = new Equipo[cantidadEquipos];
        for(int i = 0; i<equipos.length; i++){
            equipos[i] = pedirDatosAleatorios();
        }
        return equipos;
    }

    public static Equipo pedirDatosEquipo(){
        String nombre = Utilities.enterString("Ingrese nombre del equipo: ");
        int precioPropuesto = Utilities.enterInteger("Ingrese precio estimado: ");
        long tiempo = Utilities.enterInteger("Ingrese tiempo en que se asigno el precio: ");

        return new Equipo(nombre,tiempo,precioPropuesto);
    }

    public static Equipo pedirDatosAleatorios(){
        String nombre = Utilities.obtenerNombres(Utilities.random());
        int precioPropuesto = Utilities.random();
        long tiempo = Utilities.randomMilisegundos();

        return new Equipo(nombre,tiempo,precioPropuesto);
    }


    public static int menu(){
        System.out.printf("%s%n%s%n%s%n",
                "1.-Crear Ronda",
                "2.-Generar Ronda Aleatoria",
                "3.-Salir");

        return Utilities.enterInteger("Ingrese opcion: ");
    }

}
