import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AccountTests {

    private String input;
    private Boolean expected;

    public AccountTests(String input, Boolean expected) {
        this.expected = expected;
        this.input = input;
    }

    @Parameterized.Parameters(name = "name {0}")
    public static Object[][] inputNames() {
        Faker faker = new Faker();
        return new Object[][]{
                {faker.name().firstName() + " " + faker.name().lastName(), true},
                {faker.name().firstName(), false},
                {" " + faker.name().firstName() + " " + faker.name().lastName(), false},
                {faker.name().firstName() + " " + faker.name().lastName() + " ", false},
                {" " + faker.name().firstName() + faker.name().lastName()+ " ", false},
                {(faker.letterify("?????????? ?????????")), false},
                {faker.letterify("??"), false},
                {"", false},
                {"Тимоти Шаламе", true},
                {null, false},
        };
    }

    @Test
    public void checkNameValidation() {
        Account account = new Account(input);
        Assert.assertEquals(expected, account.checkNameToEmboss());
    }
}