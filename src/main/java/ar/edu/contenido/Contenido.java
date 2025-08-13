package ar.edu.contenido;

public abstract class Contenido {
    private String titulo;
    private double costoBase;

    public Contenido(String titulo, double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCostoBase() {
        return costoBase;
    
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double costo(){
        return this.costoBase + this.doCosto();
    }

    protected abstract double doCosto();
}