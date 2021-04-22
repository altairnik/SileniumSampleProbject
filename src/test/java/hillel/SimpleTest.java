package hillel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
    WebDriver driver;
    @Test
    public void checkMethod(){
        System.setProperty("webdriver.chrome.driver", "c:/testing/chromedriver.exe");
        driver  = new ChromeDriver();
    driver.get("http://research.mawashi.tools:8080/");
    driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("username");
    driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("password");
    driver.findElement(By.cssSelector("input.btn")).click();
    }
}
