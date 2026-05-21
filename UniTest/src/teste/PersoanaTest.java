package teste;

import clase.Persoana;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getVarsta() {

        Persoana persoana = new Persoana("Natalia", "6050128403678");
        assertEquals(21, persoana.getVarsta());
    }

    @org.junit.Test
    public void  testBoundariesGetVarsta()
    {
     Persoana persoana2 = new Persoana("Andreea", "1991231567894");
     assertEquals(26,persoana2.getVarsta());
    }

    @org.junit.Test
    public void testBoundariesZiuaCurenta()
    {
        Persoana persoana3 = new Persoana("Andreea", "6000521450101");
        assertEquals(26,persoana3.getVarsta());

    }

    @org.junit.Test
    public void testCrossCheckGetSex()
    {
        Persoana persoana4 = new Persoana("Andreea", "6000521450101");
        String cnp = "6000521450101";
        assertEquals(cnp.charAt(0)%2 == 0 ? "F" : "M", persoana4.getSex());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCNPInvalid()
    {
        Persoana persoana4 = new Persoana("Andreea", "600052145101");
        persoana4.checkCNP();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCNPCaractere() {
        Persoana persoana4 = new Persoana("Andreea", "6000rs52145101");
        persoana4.checkCNP();
    }

    @org.junit.Test(timeout =  10)
    public void testTimeOut()
    {
        Persoana persoana = new Persoana("Andreea", "6050125035682");
        persoana.getVarsta();
    }

    @org.junit.Test
    public void testOrdineVarste()
    {
        Persoana persoana = new Persoana("Andreea", "6040125035682");
        Persoana persoana2 = new Persoana("Andreea", "6050125035682");

        assertTrue(persoana.getVarsta() > persoana2.getVarsta());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testDataViitor()
    {
        Persoana persoana = new Persoana("Natalia", "6270228450101");
        persoana.getVarsta();
    }
}