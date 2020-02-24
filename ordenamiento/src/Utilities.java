public class Utilities {

    public static int random(){
        return (int)Math.floor(Math.random()*1000 + 1);
    }

    public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
