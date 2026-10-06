package Ejercicio2;

import java.util.Scanner;

// Programa principal
public class Actividad1Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Lista2 lista = new Lista2();

        int opcion = -1;
        int dato;


        while (opcion != 0) {

            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Crear lista inicial");
            System.out.println("2. Anadir numero");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Mostrar listas");
            System.out.println("0. Salir");

            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextInt();


            if (opcion == 1) {

                lista.crearLista(teclado);

            } else if (opcion == 2) {

                System.out.print(
                        "Introduce un numero entero: "
                );

                dato = teclado.nextInt();

                lista.agregarFinal(dato);

            } else if (opcion == 3) {

                System.out.print(
                        "Valor que quieres eliminar: "
                );

                dato = teclado.nextInt();

                lista.eliminarElemento(
                        dato, teclado
                );

            } else if (opcion == 4) {

                lista.mostrarLista();
                lista.mostrarLliures();

            } else if (opcion == 0) {

                System.out.println(
                        "Saliendo del programa..."
                );

            } else {

                System.out.println(
                        "Opcion incorrecta."
                );
            }
        }


        teclado.close();
    }
}
