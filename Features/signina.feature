Feature: customer wants to signin to amazon

@signin_happypath
Scenario Outline: Positive- User wants to Login

Given User visits home page of amazon
When User insert valid “<E-mail address>” and valid “<password>”
And click on Login button
Then User can successfully Login to Facebook

Examples:
|E-Mail Address          |Password    |
|rose@gmail.com       |Genia#12    |


@signin_neg
Scenario Outline: Negative- User wants to Login

Given User visits home page of amazon
When User insert valid “<E-mail address>” and valid “<password>”
And click on Login button
Then User can successfully Login to Facebook

Examples:
|E-Mail Address          |Password    |
|rose@gmail.com       |           |

