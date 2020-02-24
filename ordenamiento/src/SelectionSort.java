public class SelectionSort {
    public static void selectionSort(Equipo[] array, int n){
        Comparar comparar = new Comparar();
        int minimo;
        for(int i = 0; i < n ; i++ ){
           minimo = i;
           for(int j = i + 1; j < n; j++){
               if(comparar.compare(array[j], array[minimo]) < 0){
                   minimo = j;
               }
           }
           swap(i, minimo, array);
        }
    }

    public  static void selectionSort(int[] array, int n){
        int minimo;

        for(int i = 0; i < n; i++){
            minimo = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[minimo]){
                    minimo = j;
                }
            }
            swap(i, minimo, array);
        }
    }

    private static void swap(int index1, int index2, int[] array){
        int valor = array[index1];
        array[index1] = array[index2];
        array[index2] = valor;
    }

    private static void swap(int index1, int index2, Equipo[] array){
        Equipo equipo = array[index1];
        array[index1] = array[index2];
        array[index2] = equipo;
    }

}
