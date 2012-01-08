Narrative:
As a user
I want to see product list filtered by name so that I can have an overvire of goods

Scenario: User can open home page

Given browser
When I open http://amazon.com
Then I see home page contains Amazon.com in title

Scenario: User search by product name

Given search box
When I search by Kindle
Then I see a product list
Then there are some items present

