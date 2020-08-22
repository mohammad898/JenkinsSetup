package stepDefenition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginSteps  {
    WebDriver driver =null;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {

        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio2.click();

    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page()  {
        // Selecting CheckBox
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));

        // This will Toggle the Check box
        option1.click();


    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password(){

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        radio1.click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully(){
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio2.click();
    }

    }






