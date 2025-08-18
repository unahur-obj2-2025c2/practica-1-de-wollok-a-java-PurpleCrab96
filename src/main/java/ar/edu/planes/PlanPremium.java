package ar.edu.planes;

import ar.edu.usuario.Usuario;

public class PlanPremium implements PlanSuscribible {
    private double costoPlan;

    private PlanPremium(double costoPlan) {
        this.costoPlan = costoPlan;
    }

    @Override
    public double costoPlan(Usuario usuario) {
        return costoPlan;
    }

}
