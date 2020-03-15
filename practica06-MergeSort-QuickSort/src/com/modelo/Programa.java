package com.modelo;

public class Programa {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int dias = 5;
        int numFraudes = Metodos.detectarFraudes(array, dias);
        System.out.println("Numero de fraudes: "+ numFraudes);
        for(int i : array)
            System.out.print(" "+i);
        System.out.println("");
    }
    
    
}
