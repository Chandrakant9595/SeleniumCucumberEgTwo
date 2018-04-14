$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/nadsoft/workspace/ExampleOfCucumber/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "DrievOn Login Feature",
  "description": "",
  "id": "drievon-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "DriveOn Login Test scenario",
  "description": "",
  "id": "drievon-login-feature;driveon-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify the URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefination.admin_is_on_login_page()"
});
formatter.result({
  "duration": 20581304720,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.verify_the_URL()"
});
formatter.result({
  "duration": 18887009,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.enter_username_and_password()"
});
formatter.result({
  "duration": 237664439,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.click_on_login_button()"
});
formatter.result({
  "duration": 10816240945,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.verify_the_home_page()"
});
formatter.result({
  "duration": 18627612,
  "status": "passed"
});
});