package org.example;

import PageObjects.MainPage;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
    private WebDriver driver;

    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;

    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");   //extensie pt chrome
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }


    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/index.html");
    }

    @Given("I am on the personal information")
    public void i_am_on_the_personal_information(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }

    @Given("Sign the Software Testing")
    public void sign_the_software_testing(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }


    @When("the email value of {string} is inputted")
    public void  input_email_to_field(String string){
        Utils.waitForElementToLoad(2);
        mainPage.inputValueInEmailField(string);
    }


    @When("the submit button is clicked")
    public void  click_submit_button(){
        Utils.waitForElementToLoad(2);
        mainPage.clickOnSubmitButton();
    }

    @When("the Enrollment button is clicked")
    public void the_button_read_more_is_clicked(){
        Utils.waitForElementToLoad(2);
        mainPage.clickStartTheEnrollmentButton();
    }



    @When("the read more for the fundamentals is clicked")
    public void click_read_more_for_the_fundamentals(){
        Utils.scrollToElement(driver,mainPage.getReadMorelHeaderHybrid());
        mainPage.clickReadMoreTheFundamentals();
    }

    @And("button read more for in person is clicked")
    public void click_button_read_more_for_in_person(){
        Utils.scrollToElement(driver,mainPage.getReadMorelHeaderHybrid());
        mainPage.clickReadMoreInPerson();
    }

    @When("the read more button for hybrid section is clicked")
    public void theReadMoreButtonForHybridSectionIsClicked() {
        Utils.scrollToElement(driver, mainPage.getReadMorelHeaderHybrid());
        mainPage.clickOnReadMoreHybrid();
    }
}





