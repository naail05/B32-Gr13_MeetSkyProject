package net.meetsky.pages;

import net.meetsky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactGroupFunctionalityUnderContactsPage {

    public ContactGroupFunctionalityUnderContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='newgroup']")
    public WebElement addGroupButton;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement inputNewGroupName;


    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[3]")
    public WebElement groupListUnderGroup;



    public void findGroupName(String text){
        String locator = "//span[@title='\"+text+\"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
    }


    @FindBy(id = "new-contact-button")
    public WebElement addNewContactLink;

    @FindBy(xpath = "(//input[@class='multiselect__input'])[5]")
    public WebElement addGroups;

    @FindBy(xpath = "(//ul[@class='multiselect__content'])[6]")
    public WebElement groupsListUnderNewContact;

    @FindBy(xpath = "(//input[@class='multiselect__input'])[6]")
    public WebElement newProperty;

    @FindBy(xpath = "//span[.='Annive']")
    public WebElement addAnniversary;

    @FindBy(xpath = "(//div[@class='property__row'])[11]")
    public WebElement anniversaryProperty;

    @FindBy(xpath = "//*[@id='submit-form']")
    public WebElement inputSubmitForm;

    @FindBy(xpath = "//button[@aria-controls='menu-dywpj']")
    public WebElement buttonActions;









}
