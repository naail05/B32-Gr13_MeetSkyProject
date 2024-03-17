package net.meetsky.pages;




import net.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement submit;





    public void loginFromFeature(String username, String pass){
       userName.sendKeys(username);
        password.sendKeys(pass);
        submit.click();
    }




    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
