import java.util.Scanner;

public class Utilities {
    private static final Scanner STRING = new Scanner(System.in);
    private static final Scanner INTEGER = new Scanner(System.in);

    public static final String[] nombreEquipos = {"Wolves", "Horses", "Lions", "Tigers", "Octopus", "Piranha",
            "Crocs", "Boars", "Hams", "Gorillas", "Eagles", "Goats", "Bears", "Cobra", "Phanters",
            "Rhinos", "Deers", "Pitbulls", "Roosters", "Bulls", "Foxes"};
    public static int random(){
        return (int)Math.floor(Math.random()*1000 + 1);
    }

    public static long randomMilisegundos(){
        return (long)Math.floor(Math.random()*600000 + 1000);
    }

    public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
    public static int obtenerAproximacion(Premio p , Equipo e){
        return  Math.abs(p.getPrecio() - e.getValorPropuesto());
    }

    public static String obtenerNombres(int index){
        return nombreEquipos[generarNumeroAleatorio(0,20)]+index;
    }

    public static char letraAleatoria(){
            return(char)Math.floor(Math.random()*(88 - 65)+65);
    }

    public static String enterString(String str) {
        System.out.print(str);
        return STRING.nextLine();
    }

    public static int enterInteger(String str) {
        System.out.print(str);
        return INTEGER.nextInt();
    }

    public static void clearConsole() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
