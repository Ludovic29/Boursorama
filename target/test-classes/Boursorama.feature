
Feature: Test boursorama
  #-------------------------bug 1513---------------------------------------------------------------------------
Scenario: grease the button I subscribe
Given user is on page **je m'inscris**
When  the user is on the page I subscribe
Then  check if the button I subscribe is grayed out

#-----------------------bug 1233------------------------------------------------------------------------------
Scenario Outline:  Check if we can add a comment on a news
Given  User in on homepage
 When  User click on espace_membre
 And the user connects to his account with his <login> and <password>
 And the user click on news and eco and select a news
 Then the user tries to <comment> on the news

 Examples:
 | login | password         | comment          |
 | SIDO1 | Mathematiques29* | Bonjour le monde |





 #-----------------bug 1232---------------------------------------------------------------------------------

Scenario: Check if we can post
Given user is on website on rubrique **Ma fiche  de membre***
When user click on **poster**
Then  user be able to post a news
