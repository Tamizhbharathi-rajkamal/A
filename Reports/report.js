$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "To validate Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify username and password with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User has to naviagte to login attempt page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "tamizh",
        "12345"
      ]
    },
    {
      "cells": [
        "bharathi",
        "67890"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to be in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_be_in_facebook_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To verify username and password with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"tamizh\" and invalid \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to naviagte to login attempt page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_naviagte_to_login_attempt_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to be in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_be_in_facebook_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To verify username and password with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"bharathi\" and invalid \"67890\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to naviagte to login attempt page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_naviagte_to_login_attempt_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to be in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_be_in_facebook_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To verify facebook signup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters firstname and surname",
  "rows": [
    {
      "cells": [
        "tamizhdatatable",
        "24680"
      ]
    },
    {
      "cells": [
        "sahashra",
        "33333"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_firstname_and_surname(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User able to Sign up",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_able_to_Sign_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to be in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_be_in_facebook_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To verify forgot password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click forgotten account",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_forgotten_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User navigate to password recover page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_navigate_to_password_recover_page()"
});
formatter.result({
  "status": "skipped"
});
});