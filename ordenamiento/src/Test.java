import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Equipo[] equipos = {
                new Equipo("Wolves", Utilities.random(), Utilities.random()),
                new Equipo("Horses", Utilities.random(), Utilities.random()),
                new Equipo("Lions", Utilities.random(), Utilities.random()),
                new Equipo("Tigers", Utilities.random(), Utilities.random()),
                new Equipo("Octopus", Utilities.random(), Utilities.random()),
                new Equipo("Piranha", Utilities.random(), Utilities.random()),
                new Equipo("Crocs", Utilities.random(), Utilities.random()),
                new Equipo("Boars", Utilities.random(), Utilities.random()),
                new Equipo("Hams", Utilities.random(), Utilities.random()),
                new Equipo("Gorillas", Utilities.random(), Utilities.random()),
                new Equipo("Eagles", Utilities.random(), Utilities.random()),
                new Equipo("Goats", Utilities.random(), Utilities.random()),
                new Equipo("Cobra", Utilities.random(), Utilities.random()),
                new Equipo("Phanters", Utilities.random(), Utilities.random()),
                new Equipo("Rhinos", Utilities.random(), Utilities.random()),
                new Equipo("Deers", Utilities.random(), Utilities.random()),
                new Equipo("Pitbulls", Utilities.random(), Utilities.random()),
                new Equipo("Bears", Utilities.random(), Utilities.random()),
                new Equipo("Roosters", Utilities.random(), Utilities.random()),
                new Equipo("Bulls", Utilities.random(), Utilities.random()),
                new Equipo("Foxes", Utilities.random(), Utilities.random())
        };
        SelectionSort.selectionSort(equipos, equipos.length);
        for(Equipo e: equipos )
            System.out.println(e  + " ");

    }
}
