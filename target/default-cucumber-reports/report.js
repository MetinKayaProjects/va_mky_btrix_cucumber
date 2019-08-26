$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/btrix/features/NavigationMenu.feature");
formatter.feature({
  "name": "Navigation menu options",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Go to Chat and Calls as a helpdesk",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.step({
  "name": "I login as a \"\u003cuser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to \"\u003ctab\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the page title should be \"\u003cpageTitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "helpdesk",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "tab",
        "pageTitle"
      ]
    },
    {
      "cells": [
        "helpdesk",
        "Activity Stream",
        "Portal"
      ]
    },
    {
      "cells": [
        "helpdesk",
        "Task",
        "My tasks"
      ]
    },
    {
      "cells": [
        "helpdesk",
        "Chat and Calls",
        "Chat and Calls"
      ]
    },
    {
      "cells": [
        "helpdesk",
        "Applications",
        "All applications"
      ]
    },
    {
      "cells": [
        "helpdesk",
        "Workflows",
        "Assignments"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Go to Chat and Calls as a helpdesk",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"helpdesk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for title to be \"Portal\". Current title: \"EULA violation\" (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Metins-MacBook-Pro-2.local\u0027, ip: \u00272600:8806:6202:3600:7473:10b:2d40:3f67%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.100, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /var/folders/38/wpb6_p291t3...}, goog:chromeOptions: {debuggerAddress: localhost:60682}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9ce36bc61b3a2444d151a5e7b055b4a6\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.btrix.pages.LoginPage.login(LoginPage.java:52)\n\tat com.btrix.step_definitions.LoginStepDefs.i_login_as_a(LoginStepDefs.java:20)\n\tat ✽.I login as a \"helpdesk\"(file:src/test/resources/com/btrix/features/NavigationMenu.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "I navigate to \"Activity Stream\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.i_navigate_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the page title should be \"Portal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to Chat and Calls as a helpdesk",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"helpdesk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Task\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.i_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"My tasks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to Chat and Calls as a helpdesk",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"helpdesk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Chat and Calls\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.i_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Chat and Calls\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to Chat and Calls as a helpdesk",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"helpdesk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Applications\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.i_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"All applications\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to Chat and Calls as a helpdesk",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"helpdesk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Workflows\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.i_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Assignments\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});