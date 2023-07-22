package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement insertFirstName;


    public PersonalInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void firstNameField(String string){
        insertFirstName.sendKeys();
    }
}
