package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangeProfilePage;

public class OrangeProfile {

    @When("click on Contact Details")
    public void clickContactDetails(){
        OrangeProfilePage.clickContactDetails();
    }

    @Then("enter on Contact Details")
    public void verifyContactDetails(){
        Assert.assertTrue(OrangeProfilePage.verifyContactDetails());
    }

    @When("^user complete de form with parameters '(.*)', '(.*)', '(.*)', '(.*)' and select country$")
    public void completeForm(String street1, String city, String province,String postalCode){
        OrangeProfilePage.completeForm(street1, city, province, postalCode);
        OrangeProfilePage.selectCountry();
    }

    @When("click on save")
    public static void clickSave(){
        OrangeProfilePage.clickSave();
    }
    @Then("confirm is displayed")
    public static void clickOnSave(){
        Assert.assertTrue("Confirm message not displayed",OrangeProfilePage.confirmSave());
    }

}
