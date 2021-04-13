package hillel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    WebDriver driver;
    @Test
    public void checkMethod(){
        System.setProperty("webdriver.chrome.driver", "c:/testing/chromedriver.exe");
        driver  = new ChromeDriver();
    driver.get("http://research.mawashi.tools:8080/");
    }
}
