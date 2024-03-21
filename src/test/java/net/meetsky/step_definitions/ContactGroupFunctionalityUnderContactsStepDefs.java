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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    public void userCreatedUnderGroups(String groupName) {
        functionalityUnderContactsPage.addGroupButton.click();
        expectedGroupList += groupName;
        functionalityUnderContactsPage.inputNewGroupName.sendKeys(groupName + Keys.ENTER);
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

    @Then("list of group names should be matching with group's dropdown menu")
    public void listOfGroupNamesShouldBeMatchingWithGroupSDropdownMenu() {
        Assert.assertTrue(functionalityUnderContactsPage.groupsListUnderNewContact.isDisplayed());
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


}
