Feature: I as a user
  I need complete the form
  in the page toolsqa

  Scenario Outline: complete form
    Given I enter the page toolsqa
    When complete the fields firstname:<firstName> lastName:<lastName> email:<email> gender:<gender> mobile:<mobile> Date of Birth:<DateofBirth> subjects:<subjects> Hobbies:<Hobbies> picture:<picture> Current Address:<CurrentAddress> State:<State> City:<City>
    Then View the entered information

    Examples:
      | firstName    |lastName  |email              |gender|mobile    |DateofBirth|subjects  |Hobbies|picture        |CurrentAddress   |State  |City  |
      | Pedro manuel |picapiedra|picapiedra@test.com|Male  |5555115251|28 Dec 1990|Maths     |Sports | texto_pendient|Cll 20 3 Medellin|haryana|karnal|