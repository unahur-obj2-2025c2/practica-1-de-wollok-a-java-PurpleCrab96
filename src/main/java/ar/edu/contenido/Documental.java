package ar.edu.contenido;

public class Documental extends Contenido{
    private String director;


    public Documental(String titulo, String autor, String director) {
        super(titulo, autor);
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    @Override
    protected double doCosto() {
        return Idra.getInstance().getValor();
    }
}