import org.junit.Assert;
import org.junit.Test;

public class AccountTests {

    @Test
    public void stringValidation(){
        Account account= new Account("Artem");
        Assert.assertTrue(account.checkNameToEmboss("Artem"));
    }
}