package pages;

import elements.SauceDemoElements;
import scripts.commons;

public class SauceDemoPage extends commons{


    public static void navigateToLoginPage(){
        navigateTo(SauceDemoElements.url);
    }
    public static void clickLoginButton(){
        click(SauceDemoElements.loginButton);
    }

    public static void enterCredentials(String mail , String pass){
        writeText(SauceDemoElements.inputEmail,mail);
        writeText(SauceDemoElements.inputPassword,pass);
    }
}
