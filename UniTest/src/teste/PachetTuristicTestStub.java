package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import interfete.BicepCategory;
import interfete.RightCategory;
import org.junit.experimental.categories.Category;
import teste.dubluri.PersoanaStub;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTestStub {

    @org.junit.Test
    @Category(RightCategory.class)
    public void testAplicaDiscountStub()
    {
        IPersoana peroana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(peroana, "Italia", 200.00);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(180, pachetTuristic.getPret(), 0.01);
    }

    @org.junit.Test
    @Category(BicepCategory.class)
    public void testAplicaDiscountStub2()
    {
        IPersoana peroana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(peroana, "Italia", 200.00);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(180, pachetTuristic.getPret(), 0.01);
    }
}