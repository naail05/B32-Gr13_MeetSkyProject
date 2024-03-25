package net.meetsky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetsky.pages.ContactGroupFunctionalityUnderContactsPage;
import net.meetsky.utilities.BrowserUtils;
import net.meetsky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ContactGroupFunctionalityUnderContactsStepDefs {

    ContactGroupFunctionalityUnderContactsPage functionalityUnderContactsPage = new ContactGroupFunctionalityUnderContactsPage();

    @When("user click on add new group")
    public void user_click_on_add_new_group() {
        functionalityUnderContactsPage.addGroupButton.click();
    }

    String expectedGroupList;

    @When("user add {string} for new group")
    public void user_add_for_new_group(String groupName) {
        expectedGroupList += groupName;
        functionalityUnderContactsPage.inputNewGroupName.sendKeys(groupName + Keys.ENTER);

    }

    @Then("user should see {string} under groups")
    public void user_should_see_under_groups(String createdGroupName) {

        Assert.assertTrue(functionalityUnderContactsPage.groupListUnderGroup.isDisplayed());
    }

    @Given("user created {string} under groups")
    public void userCreatedUnderGroups(String newGroup) {
        functionalityUnderContactsPage.addGroupButton.click();
        functionalityUnderContactsPage.inputNewGroupName.sendKeys(newGroup + Keys.ENTER);
    }


    @When("user go to new contact")
    public void userGoToNewContact() {
        functionalityUnderContactsPage.addNewContactLink.click();
    }

    @And("user click on groups option")
    public void userClickOnGroupsOption() {
        BrowserUtils.sleep(5);
        functionalityUnderContactsPage.addGroups.click();
    }

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    

    @Then("list of group names should be matching with group's dropdown menu")
    public void listOfGroupNamesShouldBeMatchingWithGroupSDropdownMenu() {
            List<String> expectedGroupList = BrowserUtils.getElementsText(functionalityUnderContactsPage.allGroupsList);
        System.out.println("expectedGroupList = " + expectedGroupList);

            List<String> actualGroupList = BrowserUtils.getElementsText(functionalityUnderContactsPage.groupsListUnderNewContact);
        System.out.println("actualGroupList = " + actualGroupList);

        Assert.assertEquals(expectedGroupList,actualGroupList);


        }



    @And("user click on add new property")
    public void userClickOnAddNewProperty() {
        functionalityUnderContactsPage.newProperty.click();
    }

    @And("user add {string}")
    public void userAdd(String newProperty) {
        functionalityUnderContactsPage.newProperty.click();
    }

    @Then("user should see {string} in new contact properties.")
    public void userShouldSeeInNewContactProperties(String expectedNewProperty) {
        Assert.assertTrue(functionalityUnderContactsPage.anniversaryProperty.isDisplayed());
    }


    @Given("user creates test data under contact groups")
    public void userCreatesTestDataUnderContactGroups() {
        functionalityUnderContactsPage.addGroupButton.click();

        for (int i = 1; i <= 3; i++){
            String groupName = "Group" + i ;
            functionalityUnderContactsPage.inputNewGroupName.sendKeys( groupName + Keys.ENTER);
        }
    }
}





