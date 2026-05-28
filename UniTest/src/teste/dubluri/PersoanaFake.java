package teste.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {

    private  String sex;
    private int varsta;
    private boolean checkCnp;

    public void setCheckCnp(boolean checkCnp) {
        this.checkCnp = checkCnp;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return checkCnp;
    }
}
