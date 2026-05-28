package suita;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PachetTuristicTestStub;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestStub.class})
//daca nu vreau sa iau toate testele dintr-un pachet, fac categorii
public class SuitaCompleta {
}
