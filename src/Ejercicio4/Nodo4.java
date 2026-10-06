package Ejercicio4;

class Nodo4 {

    private int info;
    private Nodo4 seg;

    public Nodo4(int info) {
        this.info = info;
        this.seg = null;
    }

    public int getInfo() {
        return info;
    }

    public Nodo4 getSeg() {
        return seg;
    }

    public void setSeg(Nodo4 seg) {
        this.seg = seg;
    }
}

