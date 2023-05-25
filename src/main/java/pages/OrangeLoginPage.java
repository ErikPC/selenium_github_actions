package pages;

import elements.OrangeElements;
import org.openqa.selenium.WebElement;
import scripts.commons;

public class OrangeLoginPage extends commons {

    public static void navigateToLoginPage(){
        navigateTo(OrangeElements.urlLogin);
    }

    public static void clickLoginButton(){
        click(OrangeElements.loginButton);
    }

    public static boolean verifyErrormessageIsDisplayed(){
        return (elementIsDisplayed(findElementByXpath(OrangeElements.requiredMessage)));
    }
    public static void enterCredentials(String user, String pass){
        writeText(OrangeElements.inputUser,user);
        writeText(OrangeElements.inputPass,pass);
    }

    public static boolean verifyLogin(){
        click(OrangeElements.desplegableUser);
        if (findElementByXpath(OrangeElements.logout) != null){
            return true;
        }else{
            return false;
        }
    }

    public static void clickMyInfo(){
        WebElement myInfo = findElementByXpath(OrangeElements.dashboardMyInfo);
        if(elementIsDisplayed(myInfo)){
            click(OrangeElements.dashboardMyInfo);
        } else{
            click(OrangeElements.dashboard);
            click(OrangeElements.dashboardMyInfo);
        }
    }

    public static boolean verifyMyInfo(){
        return elementIsDisplayed(findElementByXpath(OrangeElements.myInfoNickname));
    }
}
