import org.junit.Test;
import static org.junit.Assert.*;

package ar.edu.planes;


public class PlanPremiumTest {

    // Dummy Usuario implementation for testing
    static class DummyUsuario implements Usuario {}

    @Test
    void testCostoPlanReturnsCorrectValue() throws Exception {
        Usuario usuario = new DummyUsuario();
        PlanSuscribible plan = new PlanPremium(12.0);
        assertEquals(12.0, plan.costoPlan(usuario), 0.001);
    }
}