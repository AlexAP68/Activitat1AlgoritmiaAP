package Ejercicio4;

import java.util.Scanner;

class Lista4 {

    private Nodo4 cabeza;
    private Nodo4 cola;


public Lista4() {
    cabeza = null;
    cola = null;
}


// Añade un nodo al final de la lista
public void agregarFinal(int dato) {

    Nodo4 nuevo = new Nodo4(dato);

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
    int cantidad = teclado.nextInt();

    int i = 1;

    while (i <= cantidad) {

        System.out.print("Introduce un numero: ");
        int valor = teclado.nextInt();

        agregarFinal(valor);

        i = i + 1;
    }
}


// Elimina el elemento que ocupa la posicion k
public void eliminarKesimo(int k) {

    Nodo4 actual;
    Nodo4 anterior;

    int posicion;


    if (k < 1) {

        System.out.println("La posicion no es valida.");

    } else {

        actual = cabeza;
        anterior = null;
        posicion = 1;


        // Avanzamos hasta la posicion k
        while (actual != null && posicion < k) {

            anterior = actual;
            actual = actual.getSeg();

            posicion = posicion + 1;
        }


        // Si actual es null, no hay suficientes elementos
        if (actual == null) {

            System.out.println(
                    "La lista tiene menos de " + k + " elementos."
            );

        } else {

            // Si eliminamos el primer nodo
            if (anterior == null) {

                cabeza = actual.getSeg();

            } else {

                anterior.setSeg(actual.getSeg());
            }


            // Si eliminamos el ultimo nodo
            if (actual == cola) {

                cola = anterior;
            }


            System.out.println(
                    "Elemento de la posicion " + k + " eliminado."
            );
        }
    }
}


// Muestra la lista completa
public void mostrarLista() {

    Nodo4 actual = cabeza;

    System.out.print("Lista: ");

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

