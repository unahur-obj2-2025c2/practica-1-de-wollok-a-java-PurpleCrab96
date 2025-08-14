package ar.edu.contenido;

public class Episodio {
    private final Integer numero;
    private final String titulo;
    private double costo;

    public Episodio(Integer numero, String titulo, double costo) {
        this.numero = numero;
        this.titulo = titulo;
        this.costo = costo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
