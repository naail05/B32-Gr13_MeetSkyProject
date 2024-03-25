package net.meetsky.pages;

import net.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoPage {

    public ProfileInfoPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//div[@id='expand']")
    public WebElement logoutButton;


    @FindBy(xpath = "//a[@class='primary profile__header__container__edit-button']")
    public WebElement linkEditProfile;
    //  @FindBy(xpath = "//a[contains(@class, 'edit')]")
    //public WebElement linkEditProfile;

    @FindBy(xpath = "//div[@class='user-status-menu-item__header-content-displayname']")
    public WebElement profileView;

    // @FindBy(xpath = "(//div[contains(.,'View profile')])[4]")
    //public WebElement profileView;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullName;

    @FindBy(xpath = "//span[.='sayed Habib']")
    public WebElement UserName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;


    @FindBy(xpath = "//select[@id='language']")
    public WebElement language;


}
