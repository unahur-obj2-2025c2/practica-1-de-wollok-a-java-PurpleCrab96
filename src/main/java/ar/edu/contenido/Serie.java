package ar.edu.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase, List<Temporada> temporadas) {
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase, autor);
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    protected double doCosto() {
        return temporadas.stream().mapToDouble(Temporada::costo).average().orElse(0.0);
    }
}
