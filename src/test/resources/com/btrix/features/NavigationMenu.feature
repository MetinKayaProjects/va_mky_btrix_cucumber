Feature: Navigation menu options


  @navigation
  Scenario Outline: Go to Chat and Calls as a helpdesk
    Given I login as a "<user>"
    When I navigate to "<tab>"
    Then the page title should be "<pageTitle>"


    Examples:helpdesk
      | user     | tab             | pageTitle        |
      | helpdesk | Activity Stream | Portal           |
      | helpdesk | Task            | My tasks         |
      | helpdesk | Chat and Calls  | Chat and Calls   |
#      | helpdesk | Workgroups       | Workgroups and projects                 |
#      | helpdesk | Drive            | My Drive                                |
#      | helpdesk | Calendar         | helpdesk71@cybertekschool.com: Calendar |
#      | helpdesk | Mail             | Mailbox Integration                     |
#      | helpdesk | Contact Center   | Contact Center                          |
#      | helpdesk | Time and Reports | Absence Chart                           |
#      | helpdesk | Employees        | Company Structure                       |
#      | helpdesk | Services         | Meeting Rooms                           |
#      | helpdesk | Company          | Company                                 |
      | helpdesk | Applications    | All applications |
      | helpdesk | Workflows       | Assignments      |
