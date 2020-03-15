import java.util.Comparator;

public class Ronda implements Comparator<Equipo> {
    private Premio premio;
    private Equipo[] equipos;

    public Ronda(Premio premio, Equipo[] equipos) {
        this.premio = premio;
        this.equipos = equipos;

    }

    public Equipo[] obtenerListaOrdenada(){
        SelectionSort.sort(equipos,this);
        return equipos;
    }

    @Override
    public int compare(Equipo e1, Equipo e2) {
        int comp = Integer.compare(Utilities.obtenerAproximacion(premio, e1) , Utilities.obtenerAproximacion(premio, e2));

        if(comp == 0){
            comp = Long.compare(e1.getTiempo(), e2.getTiempo());
        }

        if(comp == 0){
            comp = e1.getNombre().compareTo(e2.getNombre());
        }
        return comp;
    }
}
