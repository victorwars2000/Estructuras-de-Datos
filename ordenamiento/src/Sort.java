public class Sort {
    public static void selectionSort(Equipo[] array, Ronda ronda){
        int minimo;
        for(int i = 0; i < array.length ; i++ ){
           minimo = i;
           for(int j = i + 1; j < array.length; j++){
               if(ronda.compare(array[j], array[minimo]) < 0){
                   minimo = j;
               }
           }
           swap(i, minimo, array);
        }
    }

    private static void swap(int index1, int index2, Equipo[] array){
        Equipo equipo = array[index1];
        array[index1] = array[index2];
        array[index2] = equipo;
    }

}
