package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

@FindBy(xpath = "//*[@id=\"email\"]")
private  WebElement insertEmailForCI;

@FindBy(xpath = "//*[@id=\"phone\"]")
private WebElement insertPhoneForCI;

@FindBy(xpath = "//*[@id=\"country\"]")
private  WebElement insertCountryForCI;


@FindBy(xpath = "//*[@id=\"city\"]")
private  WebElement insertCityForCI;


@FindBy(xpath = "//*[@id=\"postCode\"]")
private  WebElement insertPostCodeForCI;


@FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
private  WebElement clickNextForCI;

@FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
private WebElement selectButton2ForCourseOption;


@FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
private WebElement nextForCourseOption;

@FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
private  WebElement contactInformationHeader;




public ContactInformation (WebDriver driver) {
    PageFactory.initElements(driver,this);
}



  public void insertEmailForCI (String string){
   insertEmailForCI.sendKeys(string);
}

    public void insertPhoneForCI(String string){
    insertPhoneForCI.sendKeys(string);
}
    public void InsertCountryForCI(String string){
    insertCountryForCI.sendKeys(string);
}

    public void InsertCityForCI(String string){
     insertCityForCI.sendKeys(string);
    }

    public void InsertPostCodeForCI(String string){
    insertPostCodeForCI.sendKeys(string);
    }
    public void ClickNextForCI(){
    clickNextForCI.click();
    }
    public void SelectButton2ForCourseOption(){
    selectButton2ForCourseOption.click();
    }

    public void NextForCourseOption(){
    nextForCourseOption.click();
    }

    public void fillInContactInformation(){
    insertEmailForCI("BBB");
    insertPhoneForCI("BBB");
    InsertCountryForCI("BBB");
    InsertCityForCI("BBB");
    InsertPostCodeForCI("BBB");
    ClickNextForCI();
    SelectButton2ForCourseOption();
    NextForCourseOption();

    }

    public String contactInformationHeaderText(){
    return contactInformationHeader.getText();
    }    // for Then//

    }

