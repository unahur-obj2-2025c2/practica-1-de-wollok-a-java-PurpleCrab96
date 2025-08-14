package ar.edu.planes;

public class PlanBasico implements PlanSuscribible {
    private Integer limite;
    private double costoBasico;

    public PlanBasico(Integer limite, double costoBasico) {
        this.limite = limite;
        this.costoBasico = costoBasico;
    }

    @Override
    public double costoPlan(Usuario usuario) {
        List<Contenido> contenido = usuario.getContenido();
        List<Contenido> excedente = contenido.subList(limite, contenido.size());
        if(limite >= contenido.size()) {
            return costoBasico;
        } else {
            return costoBasico + excedente.stream().mapToDouble(Contenido::getCosto).sum();
        }
    }
}
