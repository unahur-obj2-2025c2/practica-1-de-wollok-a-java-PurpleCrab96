package ar.edu.usuario;

import java.util.ArrayList;
import java.util.List;
import ar.edu.contenido.Contenido;
import ar.edu.planes.PlanSuscribible;

public class Usuario {
    private PlanSuscribible plan;
    private List<Contenido> contenido = new ArrayList<>();

    public Usuario(PlanSuscribible plan) {
        this.plan = plan;
    }

    public Usuario(PlanSuscribible plan, List<Contenido> contenido) {
        this.plan = plan;
        this.contenido = contenido;
    }

    public List<Contenido> getContenido() {
        return contenido;
    }

    public PlanSuscribible getPlan() {
        return plan;
    }

    public void setPlan(PlanSuscribible plan) {
        this.plan = plan;
    }

    public void agregarContenido(Contenido contenido) {
        this.contenido.add(contenido);
    }
}