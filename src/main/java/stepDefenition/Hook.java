package stepDefenition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    WebDriver driver =null;
    @Before
 public void beformethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazmul\\Desktop\\CucumberWithJenkins\\driver\\chromedriver.exe");

       driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/radio.html");




    }
 @After
    public void aftermethod() throws InterruptedException {
Thread.sleep(3000);
     driver.quit();
    }

}
