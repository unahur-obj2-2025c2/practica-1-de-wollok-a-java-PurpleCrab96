package ar.edu.contenido;

public class Serie extends Contenido {
    private String creador;

    public Serie(String titulo, String autor, String creador) {
        super(titulo, autor);
        this.creador = creador;
    }

    public String getCreador() {
        return this.creador;
    }

    @Override
    protected double doCosto() {
        return Idra.getInstance().getValor();
    }
}
