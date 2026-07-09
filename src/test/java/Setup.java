import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    AndroidDriver driver;
    public AndroidDriver startApps() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("platformVersion","15");
        caps.setCapability("appPackage","com.ccdl.employee.uat");
        caps.setCapability("appActivity","ccdl_pilot_executive.apk");
        caps.setCapability("app","E://apk//ccdl_pilot_executive.apk");
        caps.setCapability("automationName","UiAutomator2");
        URL url=new URL("http://127.0.0.1");

        driver=new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
