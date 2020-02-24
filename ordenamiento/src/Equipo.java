import java.sql.Time;

public class Equipo{
    private String nombre;
    private int tiempo;
    private int aproximacion;

    public Equipo(String nombre, int tiempo, int aproximacion) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aproximacion = aproximacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAproximacion() {
        return aproximacion;
    }

    public void setAproximacion(int aproximacion) {
        this.aproximacion = aproximacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", aproximacion=" + aproximacion +
                '}';
    }
}

