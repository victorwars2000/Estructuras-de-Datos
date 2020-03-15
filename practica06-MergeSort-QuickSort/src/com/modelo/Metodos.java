package com.modelo;

public class Metodos {
    public static int detectarFraudes(int array[], int dias){
        int contadorFraudes = 0;
        int low = 0;
        int high = dias-1;
        for(int i = dias; i < array.length; i++){
            QuickSort.sort(array, low, high);
            double mediana = calcularMediana(array,dias,low);
            double x = 2*mediana;
            if(x <= array[i]){
                System.out.println("Mediana: "+ x + "  Gasto del dia: "+array[i]);
                contadorFraudes++;
            }
            low++;
            high++;
        }
        
        return contadorFraudes;
    }
    
    public static double calcularMediana(int[] array, int dias, int low){
        double mediana;
        int numElementos = dias;
        if(numElementos % 2 == 0){
            int index = low + numElementos/2;
            int sumaMedios = array[index] + array[index - 1];
            mediana = sumaMedios / 2.0;
        }else{
            mediana = (array[(numElementos/2)+low]);
        }
        
        return mediana;
    }
}
