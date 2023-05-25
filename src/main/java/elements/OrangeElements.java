package elements;

public class OrangeElements {

    public static String urlLogin = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public static String loginButton = "//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--main') and contains(@class, 'orangehrm-login-button')]";

    public static String requiredMessage = "//span[contains(@class, 'oxd-text') and contains(@class, 'oxd-text--span') and contains(@class, 'oxd-input-field-error-message') and contains(@class, 'oxd-input-group__message')]";

    public static String inputUser = "//input[@name='username']";

    public static String inputPass = "//input[@name='password']";

    public static String desplegableUser = "//p[@class='oxd-userdropdown-name']";

    public static String logout = "//a[@href='/web/index.php/auth/logout']";

    public static String dashboardMyInfo = "//span[contains(@class, 'oxd-text') and contains(@class, 'oxd-text--span') and contains(@class, 'oxd-main-menu-item--name') and text()='My Info']";

    public static String dashboard = "//i[contains(@class, 'oxd-icon') and contains(@class, 'bi-list') and contains(@class, 'oxd-topbar-header-hamburger')]";

    public static String myInfoNickname = "//label[contains(@class, 'oxd-label') and text()='Nickname']";
// ORANGE PAGE PROFILE XPATHs
    public static String myInfoContactDetails = "//a[text()='Contact Details']";

    public static String myInfoContactDetailsTittle = "//h6[text()='Contact Details']";

    public static String inputStreet1 = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input";

    public static String inputCity = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input";

    public static String inputProvince = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input";

    public static String inputPostalCode = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input";

    public static String inputCountry = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i";

    public static String countryName = "//span[text()='Antigua and Barbuda']";

    public static String saveButton = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button";

    public static String confirmSave = "//*[@id='oxd-toaster_1']";
}
