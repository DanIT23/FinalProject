package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
    private WebDriver driver;

    ChromeOptions options = new ChromeOptions();


    MainPage mainPage;
    PersonalInformation personalInformation;
    ContactInformation contactInformation;
    PaymentInformation paymentInformation;
    LastClass lastClass;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");   //extensie pt chrome
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        mainPage = new MainPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        personalInformation = new PersonalInformation(driver);
        paymentInformation = new PaymentInformation(driver);
        lastClass = new LastClass(driver);

    }


    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/index.html");
    }

    @Given("I am on the personal information")
    public void i_am_on_the_personal_information() {   //
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on personal information")
    public void i_am_on_personal_information() {
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }


    @And("Next for personal information is clicked")
    public void click_next_for_information_personal (){
        Utils.waitForElementToLoad(2);
        personalInformation.NextForPersonalInformation();
    }

    @Given("I am on contact information")
    public void i_am_on_contact_information(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
    }

    @And("Next for CI is clicked")
    public void click_next_for_CI(){
        contactInformation.ClickNextForCI();
    }

    @And("Next for course option")
    public void click_next_for_course_option(){
        contactInformation.NextForCourseOption();
    }

    @Given("I am on Payment Information")
    public void i_am_on_payment_information(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
        contactInformation.fillInContactInformation();
    }
    @And("Next for payment information is clicked")
    public void next_for_payment_information_is_clicked(){
        paymentInformation.NextForPaymentInformation();
    }

    @Given("I am on last class")
    public void i_am_on_last_class(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
        contactInformation.fillInContactInformation();
        paymentInformation.fillInPaymentInformation();
    }






    @When("I click on Instructor")
    public void iClickOnInstructor() {
        mainPage.clickOnInstructor();
    }

    @When("The email value of {string} is inputted")
    public void input_email_to_field(String string) {
        Utils.waitForElementToLoad(2);
        mainPage.inputValueInEmailField(string);
    }

    @When("The email value of {string} is insert")
    public void the_email_value_of_is_insert(String string){
        mainPage.insertEmailNoLimit(string);
    }

    @And("The submit button is clicked")
    public void click_submit_button() {
        Utils.waitForElementToLoad(2);
        mainPage.clickOnSubmitButton();
    }

    @And("The button is clicked")
    public void click_button_is_clicked(){
        Utils.waitForElementToLoad(5);
        mainPage.clickEmailSubmitButton();
    }

    @When("The Enrollment button is clicked")
    public void the_button_read_more_is_clicked() {
        Utils.waitForElementToLoad(2);
        mainPage.clickStartTheEnrollmentButton();
    }


    @When("The read more for the fundamentals is clicked")
    public void click_read_more_for_the_fundamentals() {
        Utils.scrollToElement(driver, mainPage.getReadMorelHeaderHybrid());
        mainPage.clickReadMoreTheFundamentals();
    }


    @When("Click button read more for learn selenium")
    public void click_button_read_more_for_learn_selenium(){
        Utils.scrollToElement(driver,mainPage.getReadMoreHeaderLearnSelenium());
        mainPage.clickReadMoreLearnSelenium();
    }



    @When("Select second button  for course option")
    public void select_second_button_for_course_option(){
        contactInformation.SelectButton2ForCourseOption();
    }

    @When("Button read more in person is clicked")
    public void click_button_read_more_for_in_personal(){
        Utils.scrollToElement(driver, mainPage.getReadMorelHeaderHybrid());
        mainPage.clickReadMoreInPerson();
    }


    @When("The read more button for hybrid section is clicked")
    public void theReadMoreButtonForHybridSectionIsClicked() {
        Utils.scrollToElement(driver, mainPage.getReadMorelHeaderHybrid());
        mainPage.clickOnReadMoreHybrid();
    }

    @When("The first name value of {string} is insert")
    public void insert_first_name_to_field(String string) {
        personalInformation.insertFirstNameField(string);
    }


    @When("The email for CI {string} is insert")
    public void the_email_for_ci_is_insert(String string){
        contactInformation.insertEmailForCI(string);
    }



    @When("The holder name {string} insert in card")
    public void the_holder_name_is_insert_in_card(String string){
        paymentInformation.InsertHolderNameInCard(string);
    }

    @And("Select month")
    public void select_month(){
        paymentInformation.SelectMonth();
    }










    @And("The phone for CI {string} is insert")
    public void the_phone_for_ci_is_insert(String string){
        contactInformation.insertPhoneForCI(string);
    }

    @And("The country for CI {string} is insert")
    public void the_country_for_ci_is_insert(String string){
        contactInformation.InsertCountryForCI(string);
    }

    @And("The city for CI {string} is insert")
    public void the_city_for_ci_is_insert(String string){
        contactInformation.InsertCityForCI(string);
    }

    @And("The pas code for CI {string} is insert")
    public void the_pas_code_for_ci_is_insert(String string){
        contactInformation.InsertPostCodeForCI(string);
    }





    @And("The last name value of {string} is insert")
    public void insert_last_name_to_field(String string) {
        personalInformation.insertLastName(string);
    }

    @And("The user name value of {string} is insert")
    public void insert_user_name_to_field(String string) {
        personalInformation.insertUserName(string);
    }

    @And("The password value of {string} is insert")
    public void insert_password_to_field(String string) {
        Utils.waitForElementToLoad(2);
        personalInformation.insertPassword(string);
    }
    @And("The confirm password value of {string} is insert")
    public void insert_confirm_password_to_field(String string) {
        Utils.waitForElementToLoad(2);
        personalInformation.insertConfirmPassword(string);
    }


    @And("The card number {string} is insert")
    public void the_card_number_is_insert(String string){
        paymentInformation.InsertCardNumber(string);
    }


    @And("Number cvc {string} is insert")
    public void number_cvc_is_insert(String string){
        paymentInformation.InsertCVC(string);
    }
    @And("Select year")
    public void select_year(){
        paymentInformation.SelectYer();
    }


    @And("Return in main page")
    public void return_in_main_page(){
        lastClass.ClickReturnHomepage();
    }

    @Then("the newsletter pop-up appears")
    public void theNewsletterPopUpAppears() {
        Utils.waitForElementToLoad(5);
        driver.switchTo().alert().accept();
    }

        @Then("the newsletter pop-up appears is failed")
        public void theNewsletterPopUpAppearsIsFailed() {
            Utils.waitForElementToLoad(5);
            driver.switchTo().alert().accept();
        }




    @Then("Contact information is open")
    public void contactInformationIsOpen() {
        Assertions.assertEquals("Contact information", contactInformation.contactInformationHeaderText());
    }


    @Then("{string} page is open")
    public void pageIsOpen(String string) {
        Assertions.assertEquals(string,driver.getTitle());
    }


    @Then("Personal information is open")
    public void personalInformationIsOpen() {
        Assertions.assertEquals("Personal information", personalInformation.personalInformationHeaderText());
    }


    @Then("{string} page is the next page")
    public void learnSeleniumPageIsTheNextPage(String string){
        Assertions.assertEquals(string, driver.getTitle());
    }

    @Then("Payment Information is open")
    public void paymentInformationIsOpen() {
        Assertions.assertEquals("Payment information", paymentInformation.paymentInformationHeaderText());
    }

    @Then("Registration has been made successfully")
    public void registrationHasBeenMadeSuccessfully() {
        Assertions.assertEquals("Success!", lastClass.successPageHeaderText());
    }


    @Then("Main page is return")
    public void mainPageIsReturn() {
        Assertions.assertEquals("Software testing course", mainPage.softwareTestingCourseHeaderText());
    }


    @Then("Our instructors header should appear")
    public void ourInstructorHeaderShouldAppear() {
        Assertions.assertEquals("Our Instructors", mainPage.ourInstructorsHeaderText());
    }


    @Then("{string} does is not open")
    public void doesIsNotOpen(String arg0) {
        Assertions.assertEquals(arg0,driver.getTitle());
    }

    @And("I click on Jane Doe Twitter page")
    public void iClickOnJaneDoeTwitterPage() {
        Utils.scrollToElement(driver,mainPage.getOurInstructorsHeader());
        mainPage.clickTwitterJane();
    }

    @Then("I will redirected to Twitter page")
    public void iWillRedirectedToTwitterPage() {
        Assertions.assertEquals("Happening now",mainPage.nextPageTwitterText()  );
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpg", "");
        }
        driver.quit();
    }
}





