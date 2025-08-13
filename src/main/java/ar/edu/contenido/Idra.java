package ar.edu.contenido;

public class Idra {
    private static Idra instance = new Idra();
    private Idra(){}
    private double valor = 0.5;
    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}
    public static Idra getInstance() {return instance;}
}
