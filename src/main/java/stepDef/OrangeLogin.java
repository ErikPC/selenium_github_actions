package stepDef;

import elements.OrangeElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangeLoginPage;

public class OrangeLogin {

    @Given("the user visits Orange page")
    public void navigateToLoginPage(){
        OrangeLoginPage.navigateToLoginPage();
    }

    @When("the user clicks on the login button")
    public void clickOnLoginButon(){
        OrangeLoginPage.clickLoginButton();
    }

    @Then("an error message is displayed")
    public void verifyErrorMessage(){
        Assert.assertTrue(OrangeLoginPage.verifyErrormessageIsDisplayed());
    }

    @When("^user use credentials '(.*)' and '(.*)'$")
    public void enterCredentials(String user, String pass){
        OrangeLoginPage.enterCredentials(user,pass);
    }

    @Then("login successful")
    public void verifyLogin(){
        Assert.assertTrue(OrangeLoginPage.verifyLogin());
    }

    @Given("^the user login with credentials '(.*)' and '(.*)'$")
    public void login(String user, String pass){
        OrangeLoginPage.navigateToLoginPage();
        OrangeLoginPage.enterCredentials(user, pass);
        OrangeLoginPage.clickLoginButton();
    }

    @When("click element of dashboard")
    public void clickDashboard(){
        OrangeLoginPage.clickMyInfo();
    }

    @Then("the element has been clicked")
    public void verifyMyInfo(){
        Assert.assertTrue(OrangeLoginPage.verifyMyInfo());
    }
}
