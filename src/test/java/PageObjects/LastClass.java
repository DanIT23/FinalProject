package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastClass {


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement clickReturnHomepage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private  WebElement successPageHeader;




public LastClass(WebDriver driver){
    PageFactory.initElements(driver,this);
}





public void ClickReturnHomepage(){
    clickReturnHomepage.click();
}
 public String successPageHeaderText(){
    return successPageHeader.getText();
 }
}