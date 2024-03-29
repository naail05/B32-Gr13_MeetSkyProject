package net.meetsky.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetsky.pages.BasePage;
import net.meetsky.pages.DeckPage;
import net.meetsky.utilities.BrowserUtils;
import net.meetsky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeckMervatStepDef extends BasePage {
    DeckPage deckPage = new DeckPage();
    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Given("user is on the Deck module")
    public void user_is_on_the_deck_module() {
        deck.click();

    }
    @Then("user should see upcoming cards")
    public void user_should_see_upcoming_cards() {
        System.out.println("User should see Upcoming cards");
        deckPage.openNavigation.click();

    }
    @Then("user should see add board")
    public void user_should_see_add_board() {
        System.out.println("User should see add board");

    }
    @Then("user clicks on add board")
    public void user_clicks_on_add_board() {
        BrowserUtils.sleep(3);
        deckPage.addBoard.click();

    }
    @Then("user creat a {string}")
    public void user_creat_a(String string) {
        BrowserUtils.sleep(3);
       deckPage.boardName.sendKeys("School"  + Keys.ENTER);

    }
    @Given("user on the School")
    public void user_on_the_School() {
        BrowserUtils.sleep(2);
        deckPage.openNavigation.click();
        deckPage.School.click();

    }


    @When("the user creates a new list {string}")
    public void the_user_creates_a_new_list(String sprint2) {
        BrowserUtils.waitFor(2);
        deckPage.listName.sendKeys("sprint2" + Keys.ENTER);


    }
    @Then("the user should see the new list created")
    public void the_user_should_see_the_new_list_created() {
        System.out.println("Use sees sprint2 in the new list");

    }
   // @Given("user on the sprint2")
   // public void user_on_the_sprint2() {
      //  deckPage.sprint2.click();

    //}
    @Given("user clicks on Add card button")
    public void user_clicks_on_add_card_button() {
        deckPage.boardPersonal.click();
        deckPage.addCard.click();

    }

    String expectedCardName;
    @Then("user types {string}")
    public void user_types(String cardName) {
        Faker faker = new Faker();
        cardName = String.valueOf(faker.name());
        deckPage.cardName.sendKeys(cardName + Keys.ENTER);
        expectedCardName = cardName;

    }

    @Then("user should see the {string}")
    public void user_should_see_the(String project2) {
        System.out.println("User sees project2 created successfully");

    }

    @And("user should see the card name created")
    public void userShouldSeeTheCardNameCreated() {
        BrowserUtils.waitFor(3);
        String actualCardName = deckPage.newCreatedCard.getText();
        Assert.assertEquals(expectedCardName,actualCardName);

    }

    @And("user opens the navigation board menu")
    public void userOpensTheNavigationBoardMenu() {
        deckPage.openNavigation.click();
    }
}


