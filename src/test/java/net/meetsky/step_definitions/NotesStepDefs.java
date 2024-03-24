package net.meetsky.step_definitions;

import io.cucumber.java.en.*;
import net.meetsky.pages.NotesPage;
import net.meetsky.utilities.BrowserUtils;
import net.meetsky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NotesStepDefs {
    NotesPage notesPage = new NotesPage();

    @When("user clicks the {string} App Navigation button")
    public void user_clicks_the_app_navigation_button(String menuPlaceHolder) {
        notesPage.newNoteButton.click();
    }

    @When("user writes {string} inside note area")
    public void user_writes_inside_note_area(String message) {
        BrowserUtils.waitForTitleContains("New note - Notes - QA - Meetsky");
        BrowserUtils.waitForVisibility(notesPage.noteAreaLine1, 5);
        notesPage.noteAreaLine1.sendKeys(message);
    }

    @Then("Today top App Navigation Entry Title is {string}")
    public void today_top_app_navigation_entry_title_is(String expectedMessage) {
        BrowserUtils.waitFor(3);
        List<WebElement> actualMessageList = notesPage.actualNoteTitle;
        BrowserUtils.waitFor(1);
        List<String> actualTitleText = BrowserUtils.getElementsText(actualMessageList, "title");
        Assert.assertEquals(expectedMessage, actualTitleText.get(0));
    }

    @When("user clicks on the App Navigation Latest Entry threeDots menu button")
    public void user_clicks_on_the_app_navigation_Latest_Entry_three_dots_menu_button() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(notesPage.threeDotsLeftSide);
    }

    @When("user clicks on Favorites button")
    public void user_clicks_on_favorites_button() {
        notesPage.addToFavorite.click();
        BrowserUtils.waitFor( 3 );
    }

    @When("user switch to the {string} App Menu link")
    public void ser_switch_to_the_app_menu_link(String menuItemHolder) {
        notesPage.headMenuFilesModule.click();
    }


    @When("user clicks the {string} App Navigation sublist button")
    public void user_clicks_the_app_navigation_sublist_button(String buttonNameHolder) {
        notesPage.favoritesMenu.click();
    }

    @Then("user should see newly added {string} inside the file list")
    public void userShouldSeeNewlyAddedInsideTheFileList(String expectedFileName) {
        BrowserUtils.waitForTitleContains("Favorites - QA - Meetsky");
        String actualFileName = notesPage.lastAddedFavoritesNotes.getText().replace("\n", "");
        Assert.assertEquals(expectedFileName, actualFileName);
    }

    @When("user clicks on the Note Container {string} menu button")
    public void user_clicks_on_the_note_container_menu_button(String actionButtonHolder) {
        notesPage.threeDotsRightSide.click();
    }

    @When("user clicks on the {string} menu button")
    public void user_clicks_on_the_menu_button(String detailsButton) {
        notesPage.detailsButton.click();
    }

    @Then("displayed word and char count match actual {string} message")
    public void displayed_word_and_char_count_match_actual_message(String actualEntry) {
        BrowserUtils.waitForVisibility(notesPage.numberOfLetters, 3);
        String expectedCount = notesPage.sumOfIntegersAndLetters(actualEntry);
        String actualCount = notesPage.numberOfLetters.getText();
        Assert.assertEquals("Expected and Actual Count did not match:", expectedCount, actualCount);
    }

    @When("user clicks on the {string} button")
    public void user_clicks_on_the_button(String deleteButton) {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(notesPage.deleteNoteButton);
    }

    @Then("the {string} message is displayed")
    public void theMessageIsDisplayed(String expectedText) {
        String actualMessage = notesPage.deleteMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedText));
    }

    @And("user deletes the latest note entry")
    public void userDeletesTheLatestNoteEntry() {
        if (Driver.getDriver().getTitle().contains("Notes")) {
            BrowserUtils.clickWithJS(notesPage.threeDotsLeftSide);
            BrowserUtils.waitFor(2);
            BrowserUtils.clickWithJS(notesPage.deleteNoteButton);
        } else if (Driver.getDriver().getTitle().contains("Favorites")) {
            notesPage.clickMenuByText("Notes");
            BrowserUtils.clickWithJS(notesPage.threeDotsLeftSide);
            BrowserUtils.waitFor(2);
            BrowserUtils.clickWithJS(notesPage.deleteNoteButton);
        }
        String actualMessage = notesPage.deleteMessage.getText();
        Assert.assertTrue(actualMessage.contains("Deleted"));
    }
}
