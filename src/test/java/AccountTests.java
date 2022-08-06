import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;

public class AccountTests {

    Faker faker = new Faker();

    @Test
    public void validName() throws Exception {
        Account account = new Account(faker.name().firstName() + " " + faker.name().lastName());
        Assert.assertTrue((account.checkNameToEmboss()));
    }

    @Test
    public void oneWord() throws Exception {
        Account account = new Account(faker.name().firstName());
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void spaceBeginning() throws Exception {
        Account account = new Account(" " + faker.name().firstName() + " " + faker.name().lastName());
        Assert.assertFalse((account.checkNameToEmboss()));
    }

    @Test
    public void spaceEnd() throws Exception {
        Account account = new Account(faker.name().firstName() + " " + faker.name().lastName() + " ");
        Assert.assertFalse((account.checkNameToEmboss()));
    }

    @Test
    public void noSpaceMiddle() throws Exception {
        Account account = new Account(" " + faker.name().firstName() + faker.name().lastName());
        Assert.assertFalse((account.checkNameToEmboss()));
    }

    @Test
    public void moreThan19() throws Exception {
        Account account = new Account(faker.letterify("?????????? ?????????"));
        Assert.assertFalse((account.checkNameToEmboss()));
    }

    @Test
    public void lessThan2() throws Exception {
        Account account = new Account(faker.letterify("??"));
        Assert.assertFalse((account.checkNameToEmboss()));
    }

    @Test
    public void blankName() throws Exception {
        Account account = new Account("");
        Assert.assertFalse((account.checkNameToEmboss()));
    }

    @Test
    public void russianLettersName() throws Exception {
        Account account = new Account("Тимоти Шаламе");
        Assert.assertTrue((account.checkNameToEmboss()));
    }
}