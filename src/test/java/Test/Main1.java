package Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;
public class Main1 {
    SoftAssert soft = new SoftAssert();
    WebDriver driver;
    B obj = new B();
    c loc = new c();
    A loc1 = new A();
    Select days;
    Select month;
    Select Years;
    Select State;
    Select United_States;

    @Given("User Open Browser Navigate the website Page Login")
    public void open_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_(1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        obj.Sign_In_Click(driver).click();

    }

    @When("user Press Sign In user name and password")
    public void valid_scenario_Account() {

        //     driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        loc.Email_Confirm1(driver).sendKeys("antonsair656@gmail.com");
    }
    @And("user Input All InValid Data")
    public void Invalid_scenario_Account_login_Button() {
        loc.Click(driver).click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loc1.id_gender2(driver).click();
        loc1.First_Name(driver).sendKeys("Anton");
        loc1.Last_Name(driver).sendKeys("Samir");
        //loc1.Email(driver).sendKeys("antonsamir882@gmail.com");
        loc1.Password_Confirm(driver).sendKeys("Lfj4QMc6TBa8@$f");
        days = new Select(loc1.days(driver));
        days.selectByValue("2");
        month = new Select(loc1.month(driver));
        month.selectByValue("1");
        Years = new Select(loc1.Years(driver));
        Years.selectByValue("2000");
        loc1.button1(driver).click();
        loc1.button2(driver).click();
        loc1.First_Name1(driver).sendKeys("Canada");
        loc1.Last_Name1(driver).sendKeys("wqewqe");
        loc1.Company_Address(driver).sendKeys("ALtaoon Haram");
        loc1.Address_Address(driver).sendKeys("12Haram");
        loc1.Address_Line(driver).sendKeys("Haram2");
        loc1.City_Address(driver).sendKeys("sddfdf");
        State = new Select(loc1.State(driver));
        State.selectByIndex(1);
        loc1.Postal_Code(driver).sendKeys("0000");
        United_States = new Select(loc1.United_States(driver));
        United_States.selectByIndex(1);
        loc1.Additional_information(driver).sendKeys("01287090732");
        loc1.Home_phone(driver).sendKeys("01287090732");
        loc1.Mobile_phone(driver).sendKeys("01287090732");
        loc1.Assign_an(driver).sendKeys("My addraasasess");
        loc1.Register(driver).click();
    }
    @Then("user Unsuccessfully Login")
    public void Invalid_scenario_Account_login_Submit(){
        soft.assertTrue(loc1.Alert1(driver).isDisplayed());
        soft.assertTrue(loc1.Alert1(driver).isDisplayed());
    }

    @And("user Input All Valid Data")
    public void valid_scenario_Account_login_Button() {
        loc.Click(driver).click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loc1.id_gender2(driver).click();
        loc1.First_Name(driver).sendKeys("Anton");
        loc1.Last_Name(driver).sendKeys("Samir");
        //loc1.Email(driver).sendKeys("antonsamir882@gmail.com");
        loc1.Password_Confirm(driver).sendKeys("Lfj4QMc6TBa9@$f");
        days = new Select(loc1.days(driver));
        days.selectByValue("2");
        month = new Select(loc1.month(driver));
        month.selectByValue("1");
        Years = new Select(loc1.Years(driver));
        Years.selectByValue("2000");
        loc1.button1(driver).click();
        loc1.button2(driver).click();
        loc1.First_Name1(driver).sendKeys("Canada");
        loc1.Last_Name1(driver).sendKeys("wqewqe");
        loc1.Company_Address(driver).sendKeys("ALtaoon Haram");
        loc1.Address_Address(driver).sendKeys("12AHaram");
        loc1.Address_Line(driver).sendKeys("Haram2");
        loc1.City_Address(driver).sendKeys("sddfdf");
        State = new Select(loc1.State(driver));
        State.selectByIndex(1);
        loc1.Postal_Code(driver).sendKeys("00000");
        United_States = new Select(loc1.United_States(driver));
        United_States.selectByIndex(1);
        loc1.Additional_information(driver).sendKeys("01287090732");
        loc1.Home_phone(driver).sendKeys("01287090732");
        loc1.Mobile_phone(driver).sendKeys("01287090732");
        loc1.Assign_an(driver).sendKeys("My addraasasess");
        loc1.Register(driver).click();
    }
    @Then("user successfully Login")
    public void valid_scenario_Account_login_Submit(){
        soft.assertTrue(loc1.Alert(driver).isDisplayed());
        soft.assertTrue(loc1.Alert(driver).isDisplayed());
    }
}

