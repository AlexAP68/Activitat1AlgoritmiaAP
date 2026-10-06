package Ejercicio2;

// Clase que representa cada nodo
class Nodo2 {

    private int info;
    private Nodo2 seg;

    public Nodo2(int info) {
        this.info = info;
        this.seg = null;
    }

    public int getInfo() {
        return info;
    }

    public Nodo2 getSeg() {
        return seg;
    }

    public void setSeg(Nodo2 seg) {
        this.seg = seg;
    }
}
