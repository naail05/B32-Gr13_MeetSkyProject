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




    public void findGroupName(String text){
        String locator = "//span[@title='\"+text+\"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
    }

    @FindBy(id = "new-contact-button")
    public WebElement addNewContactLink;

    @FindBy(xpath = "//span[@class='multiselect__tag']")
    public WebElement groupsList;









}
