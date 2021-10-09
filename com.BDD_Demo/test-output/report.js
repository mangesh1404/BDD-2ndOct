$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/features/dash.feature");
formatter.feature({
  "line": 1,
  "name": "dashborad of JBK application",
  "description": "",
  "id": "dashborad-of-jbk-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21809270200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify courses",
  "description": "",
  "id": "dashborad-of-jbk-application;verify-courses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@dash"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should be on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user will mak a list of courses",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user verify course list",
  "keyword": "Then "
});
formatter.match({
  "location": "DashSetpdef.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 3006060400,
  "status": "passed"
});
formatter.match({
  "location": "DashSetpdef.user_will_mak_a_list_of_courses()"
});
formatter.result({
  "duration": 3715207400,
  "status": "passed"
});
formatter.match({
  "location": "DashSetpdef.user_verify_course_list()"
});
formatter.result({
  "duration": 10080500,
  "status": "passed"
});
formatter.after({
  "duration": 869986700,
  "status": "passed"
});
});