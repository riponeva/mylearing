Feature: User wants to Sign in & Sign Off from amazon


Scenario Outline: Positive login and logout with valid E-Mail Address and Password

Given user visits homepage amazon
And clicks sign in button
When users enters  "<E-Mail Address>" and "<password>"
And user click continue button
Then user successfully signin to the amazon
And user click on sign off Button for logout

Examples:

| E-Mail Address       | password |
| eva@mail.com        | Eva@123   | 
