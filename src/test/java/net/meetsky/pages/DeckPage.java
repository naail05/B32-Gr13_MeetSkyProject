package net.meetsky.pages;

import net.meetsky.utilities.BrowserUtils;
import net.meetsky.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage{

    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoard;

    @FindBy(xpath = "//span[@title='All boards']")
    public WebElement allBoards;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardName;

    @FindBy(xpath = "(//*[@class='material-design-icon__svg'])[2]")
    public WebElement openNavigation;

    @FindBy(xpath = "//input[@placeholder='List name']")
    public WebElement listName;

    @FindBy(xpath = "(//div[@class='smooth-dnd-container vertical']//div[@class='smooth-dnd-draggable-wrapper'][last()])[1]//h3/span")
    public WebElement newCreatedCard;
    @FindBy(xpath = "//span[@title='Personal']")
    public WebElement boardPersonal;

    @FindBy(xpath = "(//button[@rel='nofollow noreferrer noopener'])[5]")
    public WebElement addCard;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement cardName;

    @FindBy(xpath = "(//div[@class='card-menu'])[3]")
    public WebElement cardMenu;
    @FindBy(xpath = "//span[contains(.,'Assign to me')]")
    public WebElement assignToMe;
    @FindBy(xpath = "//span[@title='School']")
    public WebElement School;

    @FindBy(xpath = "//div[@class='stack__header']") ////h3[contains(text(),'sprint2')]
    public WebElement sprint2;

    @FindBy(xpath ="(//div[@class='card-upper'])[3]" )
    public WebElement newCard2;


    @FindBy(xpath = "//a[@class='app-sidebar__close has-tooltip']")
    public WebElement closePage;

    @FindBy(xpath = "(//img)[6]")
    public WebElement profileImg;

    @FindBy(xpath = "//span[.='Unassign myself']")
    public WebElement unAssign;

    @FindBy(id ="stack-add")
    public WebElement addList;



    @FindBy(xpath ="(//img[contains(@src,'Employee60')])[2]")
    public WebElement assigneeIcon;
    public void resetElementStateIfUnassigned() {

        if (assignToMe.isEnabled() ) {
            BrowserUtils.waitFor(5);
           // BrowserUtils.waitFor(5);
            assignToMe.click();}
        else {
            BrowserUtils.waitFor(7);
            unAssign.click();
            assignToMe.click();
        }



        }
    public void resetElementStateIfUnassigned2() {
        try {

            if (unAssign.isDisplayed()) {
                // Click unAssign to reset the state
                unAssign.click();
                assignToMe.click();
            }else
            assignToMe.click();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    }




