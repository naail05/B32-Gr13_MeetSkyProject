package net.meetsky.pages;

import com.github.javafaker.Faker;
import net.meetsky.utilities.BrowserUtils;
import net.meetsky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {


    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addList;

    @FindBy(id = "newListInput")
    public WebElement AddNewListInput;



    @FindBy(css = ".transparent.reactive")
    public WebElement addTaskInput;

    @FindBy(xpath = "//div[@class='task-checkbox']")
    public WebElement taskCheckbox;



    @FindBy(xpath = "(//div[@type='COMPLETED'])[1]")
    public WebElement isCompleted;



    @FindBy(xpath = "(//span[@class='material-design-icon star-icon'])[3]")
    public WebElement starIcon;

    @FindBy(xpath = "//div[@class='task-body__info']")
    public WebElement important;

    @FindBy(xpath = "//span[@title='Current']")
    public WebElement currentTab;


    @FindBy(xpath = "(//a[@class='app-navigation-entry-link'])[4]")
    public WebElement linkAll;



    public WebElement newAddedTaskList(String addedTaskList){
        String locator = "//span[contains(.,'"+addedTaskList+"')]";
       return Driver.getDriver().findElement(By.xpath(locator));}


    public WebElement newAddedTask(String addedTask){
        String locator = "//span[.='"+addedTask+"']";
        return Driver.getDriver().findElement(By.xpath(locator));}

    public WebElement allTasks(String expectedTask){
        String locator = "//span[contains(.,'"+expectedTask+"')]";
        return Driver.getDriver().findElement(By.xpath(locator));}



@FindBy(xpath = "(//span[@aria-hidden='true'])[2]")
public WebElement navigationButton;

    @FindBy (xpath = "(//div[@class='app-navigation-entry__counter'])[5]")
    public WebElement uncompletedTasksNumber;

    public WebElement importantTask(String task){
        String locator = "//span[.='"+task+"']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }


    @FindBy(xpath = "(//div[@class='trigger'])[12]")
    public WebElement editArea;

    @FindBy(xpath = "(//div[@class='trigger'])[11]")
    public WebElement editArea2;

    @FindBy(xpath = "//span[.='Delete task']")
    public WebElement deleteAddedTask;
    public void clearEntry() {
        BrowserUtils.waitForVisibility(editArea,5);
        editArea.click();
        BrowserUtils.waitFor(5);
        deleteAddedTask.click();
    }

    public void clearEntry2() {
        BrowserUtils.waitForVisibility(editArea2,5);
        editArea2.click();
        BrowserUtils.waitFor(5);
        deleteAddedTask.click();
    }


    public void clearEntries(int numEntriesToClear) {
        for (int i = 0; i < numEntriesToClear; i++) {
            // Call the clearEntry() method to clear one entry
            clearEntry();
            BrowserUtils.waitFor(10);
        }}

    public void newListForAddingTasks(){
       addList.click();
       BrowserUtils.waitFor(2);
        AddNewListInput.sendKeys(randomData()+ Keys.ENTER);
        //navigationButton.click();
    }

    public String randomData(){
        Faker faker = new Faker();
        return faker.lorem().word();
    }


    @FindBy(xpath = "(//a[@class='app-navigation-entry-link'])[7]")
    public WebElement folder;

    @FindBy(xpath = "(//span[@role='img'])[18]")
    public WebElement editFolder;

    @FindBy(xpath = "(//button[@type='button'])[22]")
    public WebElement deleteFolder;


    public void clearFolder() {;
       // BrowserUtils.waitFor(5);
        folder.click();
        editFolder.click();
        BrowserUtils.waitFor(5);
        deleteFolder.click();
      //  BrowserUtils.waitFor(5);

    }


    public void clearFolders(int numEntriesToClear) {
        for (int i = 1; i < numEntriesToClear; i++) {
            // Call the clearEntry() method to clear one entry
            clearFolder();
            BrowserUtils.waitFor(10);
        }}

    


    


}
