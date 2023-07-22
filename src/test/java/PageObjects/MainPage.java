package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private  WebElement elementSubmitButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollmentButton;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/a")
    private WebElement readMoreTheFundamentals;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
    private WebElement readMoreLearnSelenium;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement readMorelHeaderHybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreInPersonButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMoreHybridButton;







    public MainPage(WebDriver driver){                  //constructor//
        PageFactory.initElements(driver,this);

    }

    public void inputValueInEmailField(String string) {
        inputEmailField.sendKeys(string);
    }

    public void clickOnSubmitButton() {
        elementSubmitButton.click();
    }

    public void clickStartTheEnrollmentButton() {
        startTheEnrollmentButton.click();
    }


    public void clickReadMoreTheFundamentals(){
        readMoreTheFundamentals.click();
    }


    public void clickReadMoreInPerson(){
        readMoreInPersonButton.click();
    }

    public void clickOnReadMoreHybrid() {
        readMoreHybridButton.click();
    }
    public WebElement getReadMorelHeaderHybrid(){
        return readMorelHeaderHybrid;
    }


}



