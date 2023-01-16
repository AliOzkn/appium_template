package testcomponents;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import utilities.DeviceFarmUtility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    String androidS;
    public static AppiumDriver driver;

    DesiredCapabilities capabilities;


    public BaseTest() {
        androidS = DeviceFarm.ANDROID_S.path;
    }

    @BeforeTest
    public void setUp() {
        try {
            capabilities = new DesiredCapabilities();
            capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.androidS);
            // capabilities.setCapability("app", new File("src/test/resources/apps/...-.apk").getAbsolutePath());
            driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);

        } catch (MalformedURLException e) {
            System.out.println("Please check URL. \n Error:" + e.getCause());
        } catch (SessionNotCreatedException e) {
            System.out.println("Please check server \n Error:" + e.getCause());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
}
