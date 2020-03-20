package com.modelo;

import java.util.Scanner;

public class Programa {
    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        //int array[] = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        String in = INPUT.nextLine();
        String[] valores = in.split(" ");
        int elementos = Integer.parseInt(valores[0]);
        int dias = Integer.parseInt(valores[1]);
        int[] array = new int[elementos];
        String data = INPUT.nextLine();
        initArray(array, data);
        int numFraudes = Metodos.detectarFraudes(array, dias);
        System.out.println("Numero de fraudes: "+ numFraudes);
    }
    
    public static void initArray(int[] array, String input){
        
        try(Scanner scanner = new Scanner(input).useDelimiter(" ")){
            int i = 0;
            while (scanner.hasNext()) {
                array[i] = scanner.nextInt();
                i++;
            }
        }
    }
}
