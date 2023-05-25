package pages;

import elements.OrangeElements;
import scripts.commons;

public class OrangeProfilePage extends commons {

    public static void clickContactDetails(){
        click(OrangeElements.myInfoContactDetails);
    }

    public static boolean verifyContactDetails(){
        return elementIsDisplayed(findElementByXpath(OrangeElements.myInfoContactDetailsTittle));
    }

    public static void completeForm(String street1, String city, String province,String postalCode){
        writeText(OrangeElements.inputStreet1,street1);
        writeText(OrangeElements.inputCity, city);
        writeText(OrangeElements.inputProvince, province);
        writeText(OrangeElements.inputPostalCode, postalCode);
    }

    public static void selectCountry(){
        click(OrangeElements.inputCountry);
        click(OrangeElements.countryName);
    }

    public static void clickSave(){
        click(OrangeElements.saveButton);
    }
    public static boolean confirmSave(){
            return elementIsDisplayed(findElementByXpath(OrangeElements.confirmSave));
    }
}
