package pages;

import scripts.commons;

public class SauceDemoHomePage extends commons {

    private static String urlExpected = "https://www.saucedemo.com/inventory.html1";

    public static boolean checkUrl(){
        return getUrl().matches(urlExpected);
    }
}
