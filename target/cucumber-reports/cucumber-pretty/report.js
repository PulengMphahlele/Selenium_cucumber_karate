$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "feature name",
  "description": "",
  "id": "feature-name",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Authentication",
  "description": "",
  "id": "feature-name;authentication",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Application and Enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify Message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.open_Application_and_Enter_url()"
});
formatter.result({
  "duration": 6785972337,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_username()"
});
formatter.result({
  "duration": 309030818,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_password()"
});
formatter.result({
  "duration": 4538088647,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.verify_Msg()"
});
formatter.result({
  "duration": 591401101,
  "status": "passed"
});
});