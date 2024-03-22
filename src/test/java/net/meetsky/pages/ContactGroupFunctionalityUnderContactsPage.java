package net.meetsky.pages;

import net.meetsky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContactGroupFunctionalityUnderContactsPage extends BasePage{

    public ContactGroupFunctionalityUnderContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='newgroup']")
    public WebElement addGroupButton;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement inputNewGroupName;


    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[3]")
    public WebElement groupListUnderGroup;

    @FindBy(xpath = "//li[@id='newgroup']//following-sibling::li//span[@title]")
    public List<WebElement> allGroupsList;



    @FindBy(id = "new-contact-button")
    public WebElement addNewContactLink;

    @FindBy(xpath = "(//div[@class='multiselect__tags-wrap'])[6]")
    public WebElement addGroups;

    @FindBy(xpath = "(//ul[@class='multiselect__content'])[6]//li//span[starts-with(@class,'name-parts')]")
    public List<WebElement> groupsListUnderNewContact;

    @FindBy(xpath = "(//input[@class='multiselect__input'])[6]")
    public WebElement newProperty;


    @FindBy(xpath = "(//div[@class='property__row'])[11]")
    public WebElement anniversaryProperty;












}
