package Ejercicio3;

class Nodo3 {

    private int info;
    private Nodo3 seg;

    public Nodo3(int info) {
        this.info = info;
        this.seg = null;
    }

    public int getInfo() {
        return info;
    }

    public Nodo3 getSeg() {
        return seg;
    }

    public void setSeg(Nodo3 seg) {
        this.seg = seg;
    }
}
