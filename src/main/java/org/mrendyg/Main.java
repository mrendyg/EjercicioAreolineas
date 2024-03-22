package org.mrendyg;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creacion de la matriz
        int vuelos[][] = new int [6][3];

        //cargamos la matriz
        Scanner teclado = new Scanner(System.in);

        for (int f=0; f<6; f++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        while (bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el numero de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = teclado.nextInt();

            if (vuelos[destino][horario] >= asientos){
                System.out.println("Su reserva fue realizada con exito");
                vuelos[destino][horario] = vuelos[destino][horario] - asientos;
            }
            else {
                System.out.println("No hay asientos disponibles");
            }

        }

    }
}