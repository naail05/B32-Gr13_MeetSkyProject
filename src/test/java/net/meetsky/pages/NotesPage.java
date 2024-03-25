package net.meetsky.pages;

import net.meetsky.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.List;

public class NotesPage extends BasePage {

    public NotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Notes']")
    public WebElement noteButton;

    @FindBy(xpath = "//*[@id='notes_new_note']")
    public WebElement newNoteButton;

    @FindBy(xpath = "//pre[@class=' CodeMirror-line ']/span/span")
    public WebElement noteAreaLine1;

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon']/following-sibling::span")
    public List<WebElement> actualNoteTitle;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]")
    public WebElement lastNoteEntry;

    @FindBy(xpath = "//span[@title='New note']")
    public WebElement leftNoteMenu;

    @FindBy(xpath = "(//button[@aria-label='Actions'])[3]")
    public WebElement threeDotsLeftSide;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavorite;

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement headMenuFilesModule;

    @FindBy(xpath = "//a[text()='Favorites']")
    public WebElement favoritesMenu;

    @FindBy(css = "a[href*='/files?dir=/Notes']")
    public WebElement lastAddedFavoritesNotes;

    @FindBy(xpath = "//span[@class='action-buttons']")
    public WebElement threeDotsRightSide;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement numberOfLetters;

    @FindBy(xpath = "//span[@class='action-button__icon icon-delete']")
    public WebElement deleteNoteButton;


    @FindBy(xpath = "//span[@class ='deletedLabel']")
    public WebElement deleteMessage;


    /**
     * Locators for delete Notes under Files Module
     */

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement fileRighThreeDots;

    @FindBy(xpath = "//a[@class='menu-option option-delete']")
    public WebElement fileRithDeleteFile;

    /**
     * helper method to locate menu for last entered note
     *
     * @param text
     * @return WebElement
     */
    public WebElement getThreeDots1ByText(String text) {
        return Driver.getDriver().findElement(By.cssSelector("a.app-navigation-entry-link span[title='" + text + "']"));
    }

    /**
     * Method for count the number of letters and words in the Note
     *
     * @param input
     * @return String
     */
    public String sumOfIntegersAndLetters(String input) {
        String[] words = input.split("\\s+");
        int wordCount = words.length;
        int charCount = input.length();
        return String.format("%d words, %d characters", wordCount, charCount);
    }
}
