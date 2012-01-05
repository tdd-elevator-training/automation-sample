Narrative:
As a developer
I want to add and remove numbers from the list
So that I can use the basic list functionality

Scenario: A number can be added to the list

Given an empty list
When I add a number 123
Then size becomes 1 and the list contains 123

Scenario: A number can be removed from the list

When I remove number 123
Then the list is empty



