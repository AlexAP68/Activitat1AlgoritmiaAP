package Ejercicio1;

// Clase que representa un nodo de la lista
class Nodo {

    private int info;
    private Nodo seg;

    // Constructor
    public Nodo(int dato) {
        info = dato;
        seg = null;
    }

    // Devuelve el valor almacenado en INFO
    public int getInfo() {
        return info;
    }

    // Devuelve la referencia al siguiente nodo
    public Nodo getSeg() {
        return seg;
    }

    // Cambia la referencia al siguiente nodo
    public void setSeg(Nodo siguiente) {
        seg = siguiente;
    }
}
