public class Equipo{
    private String nombre;
    private long tiempo;
    private int valorPropuesto;

    public Equipo(String nombre, long tiempo, int valorPropuesto) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.valorPropuesto = valorPropuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public int getValorPropuesto() {
        return valorPropuesto;
    }

    public void setValorPropuesto(int valorPropuesto) {
        this.valorPropuesto = valorPropuesto;
    }

    @Override
    public String toString() {
        return String.format("NOMBRE EQUIPO : %-15s TIEMPO(ms) : %-10s PROPUESTA : %-10s",nombre,tiempo, valorPropuesto);
    }
}

