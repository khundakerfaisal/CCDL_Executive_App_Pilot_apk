import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginScreenPage {
    @FindBy(className = "android.widget.EditText")
    List<WebElement> enterUserId;

    public LoginScreenPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterLogin() {
        enterUserId.get(0).sendKeys("17005");
    }
}
