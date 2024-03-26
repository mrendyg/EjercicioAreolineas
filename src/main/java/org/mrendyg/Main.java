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
        int destino = 0, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            do {
                do {
                    System.out.println("Ingrese el número de destino:");
                    while (!teclado.hasNextInt()) {
                        System.out.println("------------------------------------");
                        System.out.println("Por favor, ingrese un número válido.");
                        System.out.println("------------------------------------");
                        teclado.next(); // Descartar la entrada no válida
                    }
                    destino = teclado.nextInt();
                    if (destino < 0 || destino > 5) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Por favor, ingrese un número válido (entre 0 y 5 inclusive).");
                        System.out.println("------------------------------------------------------------");
                    }
                } while (destino < 0 || destino > 5);
            } while (destino > 5);


            do {
                do {
                    System.out.println("Ingrese el horario de vuelo");
                    while (!teclado.hasNextInt()) {
                        System.out.println("-----------------------------------");
                        System.out.println("Por favor, ingrese un numero valido.(entre 0 y 2 inclusive).");
                        System.out.println("-----------------------------------");
                        teclado.next();
                    }
                    horario = teclado.nextInt();
                    if (horario < 0 || horario > 2) {
                        System.out.println("-------------------------");
                        System.out.println("Ingresa un numero valido. (entre 0 y 2 inclusive).");
                        System.out.println("-------------------------");
                    }
                } while (horario <0 || horario > 2);
            } while (horario > 2);


            System.out.println("Ingrese la cantidad de asientos");
            while (!teclado.hasNextInt()) {
                System.out.println("-----------------------------------");
                System.out.println("Por favor, ingrese un numero valido.");
                System.out.println("-----------------------------------");
                teclado.next();
            }
            asientos = teclado.nextInt();


            if (vuelos[destino][horario] >= asientos){
                System.out.println("Su reserva fue realizada con exito");
                vuelos[destino][horario] = vuelos[destino][horario] - asientos;
            }
            else {
                System.out.println("No hay asientos disponibles");
            }

            System.out.println("Desea continuar reservando?. Ingrese \"finish\" para " +
                    "terminar o cualquier valor para seguir");
            bandera = teclado2.next();

        }

    }


}