package net.meetsky.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetsky.pages.TasksPage;
import net.meetsky.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;


public class TasksStepDef {

    //private Faker faker = new Faker();


    TasksPage tasksPage = new TasksPage();

    @And("user navigates to the {string} module")
    public void userNavigatesToTheModule(String moduleName) {
        tasksPage.clickMenuByText(moduleName);

    }

    String expectedNewList;
    String randomTaskList;
    @When("the user creates a new random task list")
    public void theUserCreatesANewRandomTaskList() {
        randomTaskList = tasksPage.randomData();
        BrowserUtils.waitFor(5);
        tasksPage.addList.click();
        tasksPage.AddNewListInput.sendKeys(randomTaskList+Keys.ENTER);
       // tasksPage.addTaskInput.sendKeys(randomImportantTask+Keys.ENTER);

    }


    @Then("the user should see the new task list  created")
    public void theUserShouldSeeTheNewTaskListCreated() {
        expectedNewList=randomTaskList;
        String actualList = tasksPage.newAddedTaskList(randomTaskList).getText();
       //BrowserUtils.sleep(5);
        Assert.assertEquals(expectedNewList,actualList);

    }


    private int additionalTaskCreatedForImportant;
    @When("user creates new tasks as follow:")
    public void user_creates_new_tasks_as_follow(List<String> tasks) {
       numberOfTasksCreated = tasks.size(); // Count the number of tasks to be created
       tasksPage.newListForAddingTasks();
        for (String eachTask : tasks) {
            tasksPage.addTaskInput.sendKeys(eachTask+Keys.ENTER);
        }


    }
    @Then("the user should see the newly created tasks as follow")
    public void the_user_should_see_the_newly_created_tasks_as_follow(List <String> addedTasks) {
//        for (String eachTask : addedTasks) {
//            Assert.assertEquals(eachTask,tasksPage.newAddedTask(eachTask).getText());
//        }
        for (String eachTask : addedTasks) {
            Assert.assertTrue(tasksPage.newAddedTask(eachTask).isDisplayed());

        }


    }


    @Given("the user is viewing a list of tasks")
    public void theUserIsViewingAListOfTasks() {

       //BrowserUtils.waitForVisibility(tasksPage.linkAll,5);
        tasksPage.linkAll.click();
       // tasksPage.navigationButton.click();

    }

    //String randomTask;
    //String expectedTask;
    @When("the user marks any random task as completed")
    public void theUserMarksAnyTaskRandomTaskAsCompleted() {
        String randomTask = tasksPage.randomData();

        tasksPage.addTaskInput.sendKeys(randomTask+Keys.ENTER);
        tasksPage.allTasks(randomTask).click();
        BrowserUtils.waitFor(10);
        tasksPage.taskCheckbox.click();
    }


    @Then("the task should be shown as completed in the details")
    public void theTaskShouldBeShownAsCompletedInTheDetails() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(tasksPage.isCompleted.isDisplayed());
    }


    String randomImportantTask;
    String expectedImportantTask;
    @When("the user marks a task as important")
    public void theUserMarksATaskAsImportant() {
        randomImportantTask = tasksPage.randomData();
        expectedImportantTask=randomImportantTask;
        tasksPage.addTaskInput.sendKeys(randomImportantTask+Keys.ENTER);
        BrowserUtils.waitFor(5);
        tasksPage.starIcon.click();


    }

    @Then("the task should be marked as important")
    public void theTaskShouldBeMarkedAsImportant() {
       tasksPage.navigationButton.click();
       tasksPage.important.click();
       tasksPage.navigationButton.click();

       String actualImportantTask = tasksPage.importantTask(randomImportantTask).getText();
       Assert.assertEquals(expectedImportantTask,actualImportantTask);

        //BrowserUtils.waitFor(5);


    }

    private int numberOfTasksCreated;
    @When("the user checks the number of uncompleted tasks next to the Current tab")
    public void theUserChecksTheNumberOfUncompletedTasksNextToTheCurrentTab() {
        tasksPage.currentTab.click();

    }

    @Then("the user should see the correct number of uncompleted tasks")
    public void theUserShouldSeeTheCorrectNumberOfUncompletedTasks() {
        int expectedNumOfUncompletedTasks =4;
        String actualUncompletedTasks=tasksPage.uncompletedTasksNumber.getText();
        Assert.assertEquals(expectedNumOfUncompletedTasks,Integer.parseInt(actualUncompletedTasks));

    }


//    @After(value = "@wip5", order = 100)
//    public void teardownMethod2(){
//
//        tasksPage.clearEntries(3);
//
//
//    }

    @After(value = "wip4",order = 200)
    public void teardownMethod1(){
        tasksPage.clearEntry2();
    }

//        @After(value = "@wip5", order = 100)
//    public void teardownMethod2(){
//
//        tasksPage.clearFolders(3);
//
//
//    }





}
