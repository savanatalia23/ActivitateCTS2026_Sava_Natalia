package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import interfete.BicepCategory;
import interfete.RightCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.PersoanaFake;
import teste.dubluri.PersoanaStub;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTest {


    @Test
    @Category({RightCategory.class, BicepCategory.class})
    public void testNonAplicaDiscontFake()
    {
        IPersoana persoana = new PersoanaFake();
        ((PersoanaFake)persoana).setVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Mallorca", 500.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(500, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(RightCategory.class)
    public void testAplicaDiscontFake() {
        IPersoana persoana = new PersoanaFake();
        ((PersoanaFake)persoana).setVarsta(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bari", 500.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(450, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(BicepCategory.class)
    public void testAplicaDiscontBoundaryFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(65);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bari", 500.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(450, pachetTuristic.getPret(), 0.01);
    }
}