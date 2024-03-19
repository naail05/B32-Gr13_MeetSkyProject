package net.meetsky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetsky.pages.ContactGroupFunctionalityUnderContactsPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ContactGroupFunctionalityUnderContactsStepDefs {

    ContactGroupFunctionalityUnderContactsPage functionalityUnderContactsPage = new ContactGroupFunctionalityUnderContactsPage();
    @When("user click on add new group")
    public void user_click_on_add_new_group() {
        functionalityUnderContactsPage.addGroupButton.click();
    }

    @When("user add {string} for new group")
    public void user_add_for_new_group(String groupName) {
        functionalityUnderContactsPage.inputNewGroupName.sendKeys(groupName + Keys.ENTER);

    }
    @Then("user should see {string} under groups")
    public void user_should_see_under_groups(String createdGroupName) {
        Assert.assertTrue(functionalityUnderContactsPage.groupsList.isDisplayed());
    }

    @When("user go to new contact")
    public void userGoToNewContact() {

    }

    @And("user click on groups option")
    public void userClickOnGroupsOption() {

    }

    @Then("group names should be matching with group's dropdown menu")
    public void groupNamesShouldBeMatchingWithGroupSDropdownMenu() {
        
    }
}
