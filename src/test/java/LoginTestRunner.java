import org.testng.annotations.Test;

public class LoginTestRunner extends Setup{
    @Test
    public void doLoginWithValidCred(){
        LoginScreenPage loginScreenPage=new LoginScreenPage(driver);
        loginScreenPage.enterLogin();

    }
}
