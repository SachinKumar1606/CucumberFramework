package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;

    @Given("^User is on Login Page$")
    public void User_is_on_Login_Page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("User enter {string} and {string}")
    public void User_enter_username_and_password(String uname, String pass){
        driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    @And("^User click on login button$")
    public void User_click_on_login_button(){
        driver.findElement(By.id("login-button")).click();
    }

    @Then("^User is on Inventory page$")
    public void User_is_on_Inventory_page(){
        String act = driver.getCurrentUrl();
        String ext = "https://www.saucedemo.com/inventory.html";
        driver.close();
        Assert.assertEquals(ext,act);
    }
}
