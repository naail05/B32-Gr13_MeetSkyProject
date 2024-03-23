package net.meetsky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetsky.pages.ProfileInfoPage;
import net.meetsky.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Profile_infoStepDefinition {

  ProfileInfoPage infoPage = new ProfileInfoPage();



    @And("user navigates to the logoutButton module")
    public void userNavigatesToTheLogoutButtonModule() {


        infoPage.logoutButton.click();
    }
    @When("user click the view profile  link")
   public void userClickTheViewProfileLink() {
        BrowserUtils.waitForClickablility(infoPage.profileView,10);
    infoPage.profileView.click();

   }
    @And("user click to edit profile")
    public void userClickToEditProfile() {
        BrowserUtils.waitForClickablility(infoPage.linkEditProfile,10);
        infoPage.linkEditProfile.click();
    }

    @When("user enter full name")
    public void user_enter_full_name() {
        infoPage.fullName.clear();

        infoPage.fullName.sendKeys("sayed Habib");

    }
    @And("user verify the user name and full name should be same")
    public void userVerifyTheUserNameAndFullNameShouldBeSame() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("sayed Habib",infoPage.UserName.getText());

    }


 @Then("user enter email ID")
    public void user_enter_email_id() {

        infoPage.email.sendKeys("sayed@gmail.com");

    }

    @Then("user select language")
    public void userSelectLanguage() {

        Select languageDropdown = new Select(infoPage.language);
        languageDropdown.selectByValue("nl");

    }

    @Then("the mentioned language should be selected")
    public void theMentionedLanguageShouldBeSelected() {
        BrowserUtils.waitForVisibility(infoPage.language,5);

       // Assert.assertEquals("Nederlands",infoPage.language.getText());
        Assert.assertTrue(infoPage.language.getText().contains("Nederlands"));

    }



}
