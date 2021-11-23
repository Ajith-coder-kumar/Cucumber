Feature: Validating Adactin Application


Scenario Outline: Validating Hotel booking 


Given Launcing Browser
When User Login with "<Username>" and "<Password>"
And User Searching Hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>"and"<ChildrenPerRoom>"
And User Selecting Hotel
And User Booking Hotel "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNumber>","<CreditCardType>","<SelectMonth>","<SelectYear>" and "<CvvNumber>"
And Order Number Generated
Then User Successfully Booked Ticket

Examples:
|Username|Password|Location|Hotels|RoomType|NumberOfRooms|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerRoom|FirstName|LastName|BillingAddress|CreditCardNumber|CreditCardType|SelectMonth|SelectYear|CvvNumber|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar1|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar2|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar3|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar4|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar5|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar6|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar7|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar8|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar9|1234567890123456|Master Card|January|2022|123|
|SuguAravind|sugu@3005|Sydney|Hotel Sunshine|Super Deluxe|1 - One|16/11/2021|17/11/2021|2 - Two|0 - None|Ajith|kumar|Anna Nagar10|1234567890123456|Master Card|January|2022|123|



































