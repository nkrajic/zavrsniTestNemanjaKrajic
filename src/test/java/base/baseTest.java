package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest {
    public static WebDriver driver;
    public static WebDriverWait wdwait;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Actions hover = new Actions(driver);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, 60);
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @After
    public void tearDown(){
//        driver.close();
//        driver.quit();

    }
}
