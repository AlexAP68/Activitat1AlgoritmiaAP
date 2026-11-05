package Ejercicio2;

import java.util.Scanner;

// Clase que gestiona la lista principal y la lista lliures
class Lista2 {

    private Nodo2 cabeza;
    private Nodo2 cola;

    private Nodo2 lliures;
    private Nodo2 colaLliures;


    public Lista2() {
        cabeza = null;
        cola = null;

        lliures = null;
        colaLliures = null;
    }


    // Añade un nodo al final de la lista principal
    public void agregarFinal(int dato) {

        Nodo2 nuevo = new Nodo2(dato);

        if (cabeza == null) {

            cabeza = nuevo;
            cola = nuevo;

        } else {

            cola.setSeg(nuevo);
            cola = nuevo;
        }
    }


    // Crea inicialmente la lista
    public void crearLista(Scanner teclado) {

        if (cabeza != null) {

            System.out.println("La lista ya esta creada.");
            return;
        }

        System.out.print("Cuantos elementos quieres introducir?: ");
        int cantidad = Actividad1Ejercicio2.leerEntero(
                teclado);

        int i = 1;

        while (i <= cantidad) {

            System.out.print("Introduce un numero: ");
            int valor = Actividad1Ejercicio2.leerEntero(
                    teclado);

            agregarFinal(valor);

            i = i + 1;
        }
    }


    // Elimina una coincidencia elegida por el usuario
    public void eliminarElemento(int valor, Scanner teclado) {

        Nodo2 actual;
        Nodo2 anterior;

        int coincidencias;
        int elegida;
        int contador;
        int posicion;


        // Contamos cuántos nodos tienen ese valor
        coincidencias = 0;
        posicion = 1;
        actual = cabeza;

        while (actual != null) {

            if (actual.getInfo() == valor) {

                coincidencias = coincidencias + 1;

                System.out.println(
                        "Coincidencia " + coincidencias +
                                ": posicion " + posicion
                );
            }

            actual = actual.getSeg();
            posicion = posicion + 1;
        }


        // Si no existe el valor
        if (coincidencias == 0) {

            System.out.println(
                    "No existe ningun nodo con ese valor."
            );

        } else {

            // Si hay varios iguales, el usuario elige cuál
            if (coincidencias > 1) {

                System.out.println(
                        "Hay " + coincidencias +
                                " nodos con ese valor."
                );

                System.out.print(
                        "Que coincidencia quieres eliminar?: "
                );

                elegida = Actividad1Ejercicio2.leerEntero(
                        teclado);


                while (elegida < 1 ||
                        elegida > coincidencias) {

                    System.out.println(
                            "Valor incorrecto."
                    );

                    System.out.print(
                            "Que coincidencia quieres eliminar?: "
                    );

                    elegida = Actividad1Ejercicio2.leerEntero(
                            teclado);
                }

            } else {

                elegida = 1;
            }


            // Buscamos la coincidencia elegida
            actual = cabeza;
            anterior = null;
            contador = 0;

            while (contador < elegida) {

                if (actual.getInfo() == valor) {
                    contador = contador + 1;
                }

                if (contador < elegida) {

                    anterior = actual;
                    actual = actual.getSeg();
                }
            }


            // Eliminamos el nodo de la lista principal
            if (anterior == null) {

                // Estamos eliminando el primer nodo
                cabeza = actual.getSeg();

            } else {

                anterior.setSeg(actual.getSeg());
            }


            // Si era el último nodo
            if (actual == cola) {
                cola = anterior;
            }


            // Separamos el nodo
            actual.setSeg(null);


            // Lo añadimos al final de lliures
            if (lliures == null) {

                lliures = actual;
                colaLliures = actual;

            } else {

                colaLliures.setSeg(actual);
                colaLliures = actual;
            }


            System.out.println("Elemento eliminado.");
        }
    }


    // Muestra la lista principal
    public void mostrarLista() {

        Nodo2 actual = cabeza;

        System.out.print("Lista principal: ");

        if (actual == null) {

            System.out.println("vacia");
            return;
        }

        while (actual != null) {

            System.out.print(actual.getInfo());

            if (actual.getSeg() != null) {
                System.out.print(" -> ");
            }

            actual = actual.getSeg();
        }

        System.out.println();
    }


    // Muestra la lista de fems
    public void mostrarLliures() {

        Nodo2 actual = lliures;

        System.out.print("Lista de fems: ");

        if (actual == null) {

            System.out.println("vacia");
            return;
        }

        while (actual != null) {

            System.out.print(actual.getInfo());

            if (actual.getSeg() != null) {
                System.out.print(" -> ");
            }

            actual = actual.getSeg();
        }

        System.out.println();
    }
}
