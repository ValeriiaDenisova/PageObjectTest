import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
/**
 * Created by Валерия on 17.04.2015.
 */
public class GoogleTestPage {
    private FirefoxDriver driver;
    @Before
    public  void  setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
    }

    @After
    public void tearDown(){
        driver.close();
    } //hello

    @Test
    public void testSearch(){
        HomePage home = new HomePage(driver);
        RezultPage rezult = home.search("automated testing info");
        assertTrue(rezult.getFirstLink().contains("automated"));
    }
}
