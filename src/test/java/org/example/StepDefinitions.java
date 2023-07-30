package org.example;

import PageObjects.*;
import io.cucumber.java.en.*;

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
    public void i_am_on_the_personal_information() {
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on personal information")
    public void i_am_on_personal_information() {
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }


    @Given("Next for personal information is clicked")
    public void click_next_for_information_personal (){
        Utils.waitForElementToLoad(2);
        personalInformation.NextForPersonalInformation();
    }

    @Given("I am on contact information")
    public void i_am_on_contact_information(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
    }

    @Given("Next for CI is clicked")
    public void click_next_for_CI(){
        contactInformation.ClickNextForCI();
    }

    @Given("Next for course option")
    public void clik_next_for_course_option(){
        contactInformation.NextForCourseOption();
    }

    @Given("I am on Payment Information")
    public void i_am_on_payment_information(){
        driver.get("file:///C:/Users/DjANIEL/Downloads/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformation();
        contactInformation.fillInContactInformation();
    }
    @Given("Next for payment information is clicked")
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










    @When("The email value of {string} is inputted")
    public void input_email_to_field(String string) {
        Utils.waitForElementToLoad(2);
        mainPage.inputValueInEmailField(string);
    }


    @When("The submit button is clicked")
    public void click_submit_button() {
        Utils.waitForElementToLoad(2);
        mainPage.clickOnSubmitButton();
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

    @When("Select button 2 for course option")
    public void select_button2_for_course_option(){
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

    @When("Select month")
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
}



