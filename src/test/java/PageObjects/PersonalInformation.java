package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement insertFirstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement insertLastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement insertUserName;

     @FindBy(xpath = "//*[@id=\"password\"]")
     private WebElement insertPassword;

     @FindBy(xpath = "//*[@id=\"cpassword\"]")
     private WebElement insertConfirmPassword;

     @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
     private WebElement nextForPersonalInformation;


     @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
     private WebElement clickNextForPersonalInformation;



    public PersonalInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void insertFirstNameField(String string) {insertFirstName.sendKeys(string);
    }
    public void insertLastName(String string) {insertLastName.sendKeys(string);
    }
    public void insertUserName(String string){insertUserName.sendKeys(string);
    }
    public void insertPassword(String string){insertPassword.sendKeys(string);
    }
    public void insertConfirmPassword(String string){insertConfirmPassword.sendKeys(string);
    }
    public void NextForPersonalInformation (){nextForPersonalInformation.click();
    }
    public void clickNextForPersonalInformation(){clickNextForPersonalInformation.click();}

    public void fillInPersonalInformation() {
        insertFirstNameField("AAA");
        insertLastName("AAAA");
        insertUserName("AAA");
        insertPassword("AAA");
        insertConfirmPassword("AAA");
        NextForPersonalInformation();
    }
}
