package ar.edu.contenido;

public class Pelicula extends Contenido {
    
    public Pelicula(String titulo, double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    protected double doCosto() {
        return 0;
    }

}
