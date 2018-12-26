#Author: your.email@your.domain.com

@tag
Feature: Xpath Site Automation
  I want to use this template for my feature file

  @tag1
  Scenario: LifeTimeWebSiteAutomation
    Given Opening a brower and navigate into Lifetime site
    When Fetching all drown down title
    And Fetching sports drop down list items
    And Fetching Training drop down list items
    Then Store the data into variable

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
