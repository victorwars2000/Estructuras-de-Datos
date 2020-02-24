import java.util.Comparator;

public class Comparar implements Comparator<Equipo> {
    @Override
    public int compare(Equipo e1, Equipo e2) {
        int comp = Integer.compare(e1.getAproximacion(), e2.getAproximacion());
        if(comp == 0){
            comp = Integer.compare(e1.getTiempo(), e2.getTiempo());
        }

        if(comp == 0){
            comp = e1.getNombre().compareTo(e2.getNombre());
        }
        return comp;
    }
}
