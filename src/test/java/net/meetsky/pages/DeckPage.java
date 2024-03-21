package net.meetsky.pages;

import net.meetsky.utilities.Driver;
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
    @FindBy(xpath = "//span[.='Assign to me']")
    public WebElement assignToMe;
    @FindBy(xpath = "//span[@title='School']")
    public WebElement School;

    @FindBy(xpath = "//div[@class='stack__header']/h3") ////h3[contains(text(),'sprint2')]
    public WebElement sprint2;



}
