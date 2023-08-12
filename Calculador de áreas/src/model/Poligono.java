package model;


public class Poligono {

    private String poligono;
    private int lados;
    private double tamanhoLado;

    public Poligono() {
    }

    public Poligono(String poligono, int lados, double tamanhoLado) {
        this.poligono = poligono;
        this.lados = lados;
        this.tamanhoLado = tamanhoLado;
    }

    public String getPoligono() {
        return poligono;
    }

    public void setPoligono(String poligono) {
        this.poligono = poligono;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }


}
