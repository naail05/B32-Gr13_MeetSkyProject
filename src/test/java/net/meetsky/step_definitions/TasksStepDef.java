package net.meetsky.step_definitions;

import io.cucumber.java.en.And;
import net.meetsky.pages.TasksPage;

public class TasksStepDef {


    TasksPage tasksPage = new TasksPage();

    @And("user navigates to the {string} module")
    public void userNavigatesToTheModule(String moduleName) {
        tasksPage.clickMenuByText(moduleName);

    }
}
