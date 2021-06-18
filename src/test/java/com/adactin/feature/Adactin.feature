Feature: Application Used For Booking Hotels 

Scenario Outline:
Given launch The Browser
When enter Your"<Username>" UserName
And enter Your"<Password>" Password
Then click On the Login Button
Examples:
|Username|Password|
|rte|gghkj|
|thiyaguraja1995|thiyagu|
Scenario:
When select The Location of the hotel
And select The Hotel
And select The Type Of Room
And select The Number Of Rooms
And enter The Check In Date 
And enter The Check Out Date
And enter The Adults Per Room
And enter The Children per Room
Then click On The Search Button

Scenario:
When click On The Selected Hotel
Then click On The Continue Button
 
Scenario:
When enter Your "Thiyagu" First Name
And enter Your "rajamani" Second Name
And enter Your Address
And enter Your Sixteen Diget Credit Card Number
And select Your credit Card Expiry Month
And select Your credit Card Expiry Year
And enter Your Cvv Number
Then click On The Book Now Button

Scenario:
Then click On The My Itinerary Button

Scenario:
Then click On The Logout Button





















