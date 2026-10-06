package Ejercicio1;

import java.util.Scanner;

public class Actividad1Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Lista lista = new Lista();

        int opcion = -1;
        int dato;

        while (opcion != 0) {

            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = teclado.nextInt();

            if (opcion == 1) {

                System.out.print("Introduce un numero entero: ");
                dato = teclado.nextInt();

                lista.agregarAlFinal(dato);

            } else if (opcion == 2) {

                lista.mostrarLista();

            } else if (opcion == 0) {

                System.out.println("Saliendo del programa...");

            } else {

                System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }
}
