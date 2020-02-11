package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Steps {
    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("This Step open the Firefox and launch the application.");
        System.out.println("This step enter the Username and Password on the login page.");
        System.setProperty("webdriver.ie.driver", "C://Tools//IEDriverServer_x64_3.150.1//IEDriverServer.exe");
        driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {

        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
        driver.findElement(By.name("btnReset")).click();
    }

}