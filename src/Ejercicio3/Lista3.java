package Ejercicio3;

class Lista3 {

    private Nodo3 cabeza;

    // Constructor
    public Lista3() {
        cabeza = null;
    }


    // Inserta un nuevo nodo manteniendo la lista ordenada
    public void insertarOrdenado(int dato) {

        Nodo3 nuevo = new Nodo3(dato);

        // Caso 1:
        // Lista vacia o el nuevo dato va al principio
        if (cabeza == null || dato < cabeza.getInfo()) {

            nuevo.setSeg(cabeza);
            cabeza = nuevo;

        } else {

            Nodo3 anterior = cabeza;
            Nodo3 actual = cabeza.getSeg();


            // Buscamos la posicion correcta
            while (actual != null &&
                    actual.getInfo() <= dato) {

                anterior = actual;
                actual = actual.getSeg();
            }


            // Insertamos nuevo entre anterior y actual
            nuevo.setSeg(actual);
            anterior.setSeg(nuevo);
        }
    }


    // Muestra toda la lista
    public void mostrarLista() {

        Nodo3 actual = cabeza;

        System.out.print("Lista ordenada: ");

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