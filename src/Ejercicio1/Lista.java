package Ejercicio1;

// Clase que representa la lista enlazada
class Lista {

    private Nodo cabeza;
    private Nodo cola;

    // Constructor de una lista vacía
    public Lista() {
        cabeza = null;
        cola = null;
    }

    // Inserta un nuevo nodo al final de la lista
    public void agregarAlFinal(int dato) {

        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía
        if (cabeza == null) {

            cabeza = nuevoNodo;
            cola = nuevoNodo;

        } else {

            // El último nodo apunta al nuevo nodo
            cola.setSeg(nuevoNodo);

            // El nuevo nodo pasa a ser el último
            cola = nuevoNodo;
        }
    }

    // Muestra todos los elementos de la lista
    public void mostrarLista() {

        Nodo actual = cabeza;

        // Comprobamos si la lista está vacía
        if (actual == null) {
            System.out.println("La lista esta vacia.");
            return;
        }

        System.out.print("Ejercicio1.Lista: ");

        // Recorremos la lista desde el principio
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
