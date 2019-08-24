$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/btrix/features/Login.feature");
formatter.feature({
  "name": "Tasks menu",
  "description": "  Agile Story:\n  As a user I should be able to create a task from activity stream.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Create new task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_am_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"helpdesk\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the tasks button",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefs.i_click_on_the_tasks_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the new task button",
  "keyword": "And "
});
formatter.match({
  "location": "MyTasksStepDefs.i_click_on_the_new_task_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I write in the thingsToDo title box",
  "keyword": "And "
});
formatter.match({
  "location": "MyTasksStepDefs.i_write_in_the_thingsToDo_title_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I write in the bodyBox below the thingsToDo title box",
  "keyword": "And "
});
formatter.match({
  "location": "MyTasksStepDefs.i_write_in_the_bodyBox_below_the_thingsToDo_title_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click addTaskButton",
  "keyword": "And "
});
formatter.match({
  "location": "MyTasksStepDefs.i_click_addTaskButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Our task should appear on the tasks page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTasksStepDefs.our_task_should_appear_on_the_tasks_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});