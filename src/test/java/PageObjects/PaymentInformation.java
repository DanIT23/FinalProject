package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformation {


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement insertHolderNameInCard;


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement insertCardNumber;


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement insertCVC;


    @FindBy(xpath = "//*[@id=\"month\"]/option[11]")
    private WebElement selectMonth;


    @FindBy(xpath = "//*[@id=\"year\"]/option[7]")
    private WebElement selectYear;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextForPaymentInformation;


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement clickReturnToHomepage;


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformationHeader;


    public PaymentInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void InsertHolderNameInCard(String string) {
        insertHolderNameInCard.sendKeys(string);
    }

    public void InsertCardNumber(String string) {
        insertCardNumber.sendKeys(string);
    }

    public void InsertCVC(String string) {
        insertCVC.sendKeys(string);
    }

    public void SelectMonth() {
        selectMonth.click();
    }

    public void SelectYer() {
        selectYear.click();
    }

    public void NextForPaymentInformation() {
        nextForPaymentInformation.click();
    }


    public void fillInPaymentInformation(){
        InsertHolderNameInCard("CCC");
        InsertCardNumber("CCC");
        InsertCVC("CCC");
        SelectMonth();
        SelectYer();
        NextForPaymentInformation();

    }

    public String paymentInformationHeaderText(){
        return paymentInformationHeader.getText();
    }

}