# Author: Marcela Lasso

  @stories
  Feature: Academy Utest
    As a user, I want to register a new user in Utest.com plataform

    @scenario1
    Scenario Outline: Create a new user
      Given than Mathew wants to login at Utest
        | strNameUser   | strLastName   | strEmail   | strPassword   | strConfirmPassword   |
        | <strNameUser> | <strLastName> | <strEmail> | <strPassword> | <strConfirmPassword> |



      When he register for the Utest
        | strWelcomeTitle   |
        | <strWelcomeTitle> |

      Then He can in to the Utest plataform
        | strWelcomeTitle   |
        | <strWelcomeTitle> |


      Examples:

        | strNameUser | strLastName  | strEmail       | strPassword      | strConfirmPassword | strWelcomeTitle                                                         |
        | yourName    | yourLastName | your@gmail.com | yourPassword@123 | yourPassword@123   | Welcome to the world's largest community of freelance software testers! |


