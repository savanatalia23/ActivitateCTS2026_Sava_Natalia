package suita;


import interfete.BicepCategory;
import interfete.RightCategory;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PachetTuristicTestStub;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestStub.class})
@Categories.IncludeCategory(BicepCategory.class) //aici aleg ce categorie vreau sa imi ruleze
//@Categories.ExcludeCategory(RightCategory.class) //aici aleg ce categorie nu vreau sa imi ruleze
// pot s pun un test sa imi apartiana in mai multe categorii;
// daca sunt in 2 categorii, rulez Right si exclud Bicep -> nu imi pune testul care e in ambele categorii
public class Suitapersonalizata {
}
