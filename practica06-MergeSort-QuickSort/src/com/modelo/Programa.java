package com.modelo;

import java.util.Scanner;

public class Programa {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        //int array[] = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        String in = "";
        in = validacionLinea1(in);
        String[] valores = in.split(" ");
        int elementos = Integer.parseInt(valores[0]);
        int dias = Integer.parseInt(valores[1]);
        int[] array = new int[elementos];
        System.out.println("\nIngrese " + elementos + " gastos, por favor:\n");
        String data = INPUT.nextLine();
        initArray(array, data, elementos);
        int numFraudes = Metodos.detectarFraudes(array, dias);
        System.out.println("Numero de fraudes: " + numFraudes);
    }

    public static String validacionLinea1(String in) {
        System.out.println("Ingrese por favor n y d.");
        in = INPUT.nextLine();
        String[] valores = in.split(" ");
        int elementos = Integer.parseInt(valores[0]);
        int dias = Integer.parseInt(valores[1]);
        if (elementos < 1 || elementos > 10000 || dias < 1 || dias > elementos) {
            System.out.println("ERROR... \nEl valor 1 (número días en el que se han realizado las transacciones) debe ser mayor a 0 y menor a 10000.");
            System.out.println("Y el valor 2 (número de días de prueba) debe ser mayor a 0 y menor o igual al valor 1.");
            System.out.println("Intente de nuevo, por favor.\n\n");
            in = validacionLinea1(in);
        }
        return in;
    }

    public static void initArray(int[] array, String input, int elementos) {

        try (Scanner scanner = new Scanner(input).useDelimiter(" ")) {
            int i = 0;
            while (scanner.hasNext()) {
                array[i] = scanner.nextInt();
                i++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 200) {
                System.out.println("ERROR... \nUno de los gastos no cumple con los requisitos...");
                System.out.println("Los gastos deben ser mayor o igual a 0 y menor o igual a 200.");
                System.out.println("Intente de nuevo, por favor.\n\n");
                System.out.println("Ingrese " + elementos + " gastos, por favor:");
                input = INPUT.nextLine();
                initArray(array, input, elementos);
                i = array.length;
            }
        }
    }
}
