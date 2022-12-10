Feature: Adactin Hotel book Functionally
Scenario: Room Booking in Adactin Hotel
Given : User Launch the Url
When : User enter a Username
And : User enter the Password
And : User click the login button

Scenario: Booking a room
When : User select the Location
And  : User select the Hotels
And : User select the Room Type
And :User select the no of Rooms
And : User enter a check in Dates
And : User enter a check out Dates
And : User select Adult Rooms
And : User select child rooms
And : User click the search button

Scenario: Select Hotel
When : User select a Hotel
And : User click the continue button

Scenario: Book a Hotel
When : User enter a FirstName
And : User enter a Lastname
And : User enter a billing address
And : User enter a Credit card number
And : User select Credit card type
And : User select Expiry  month
And : User select Expiry year
And : User enter a cvv number
And : User click the Booknow button
  
Scenario: Booking Confirmation
When  :User click the Logout button


