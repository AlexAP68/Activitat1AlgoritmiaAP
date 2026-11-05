package Ejercicio4;

import java.util.Scanner;

public class Actividad1Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Lista4 lista = new Lista4();

        int opcion = -1;
        int dato;
        int k;


        while (opcion != 0) {

            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Crear lista inicial");
            System.out.println("2. Anadir numero");
            System.out.println("3. Eliminar elemento k");
            System.out.println("4. Mostrar lista");
            System.out.println("0. Salir");

            System.out.print("Selecciona una opcion: ");
            opcion = leerEntero(teclado);


            if (opcion == 1) {

                lista.crearLista(teclado);

            } else if (opcion == 2) {

                System.out.print("Introduce un numero entero: ");
                dato = leerEntero(teclado);

                lista.agregarFinal(dato);

            } else if (opcion == 3) {

                System.out.print(
                        "Introduce la posicion k que quieres eliminar: "
                );

                k = leerEntero(teclado);

                lista.eliminarKesimo(k);

            } else if (opcion == 4) {

                lista.mostrarLista();

            } else if (opcion == 0) {

                System.out.println("Saliendo del programa...");

            } else {

                System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }

    public static int leerEntero(Scanner teclado) {

        while (true) {



            if (teclado.hasNextInt()) {
                return teclado.nextInt();
            }

            System.out.println("Error: debes introducir un numero entero.");

            teclado.next(); // Descartamos la entrada incorrecta
        }
    }
}
