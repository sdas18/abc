Feature: Registartion Feature
	 this feature helps user to register
	 
Scenario: user is trying to register using invalid set of details
 
 Given  User is accessing RegistrationPage on Browser
 
 When User has filled correct url of registration page
 Then Page Title Should be "Welcome to JobsWorld" 
 
 	When  user is trying to submit data without entring 'User Id'
 	 Then  'User Id should not be empty / length be between 5 to 12' alert message should display
 	 
 	 When User is trying to enter wrong 'User Id'
 	 Then 'User Id should not be empty / length be between 5 to 12' alert message should display on invalid 'user Id'
 	 
 	 When  User is trying to submit request without entring 'Password'
 	 Then  'Password should not be empty / length be between 7 to 12' alert message should display
 	 
 	 When  User is trying to submit request by entring wrong 'Password'
 	 Then  'Password should not be empty / length be between 7 to 12' alert message should display on invalid 'Password'
 	 
 	 When  User is trying to submit request without entering 'Name'
 	 Then  'Username should not be empty and must have alphabet characters only' alert message should display
 	 
 	 When  User is trying to submit request by entering non alphabet characters in 'Name'
 	 Then  'Username should not be empty and must have alphabet characters only' alert message should display on invalid 'Name'
 	 
 	When  User is trying to submit request without entring  'address'
 	 Then  'User address must have alphanumeric characters only' alert message should display
 	 
 	 	When  User is trying to submit request by entering invalid 'address'
 	 Then  'User address must have alphanumeric characters only' alert message should display on invalid address
 	 
 	 	When  User is trying to submit request without selecting  valid 'country'
 	 Then  'Select your country from the list' alert message should display
 	 
 	 	When  User is trying to submit request without entring valid 'zipCode'
 	 Then  'ZIP code must have numeric characters only' alert message should display
 	 
 	 	When  User is trying to submit request without entring valid 'email'
 	 Then  'You have entered an invalid email address!' alert message should display
 	 
 	 When  User is trying to submit request without entring valid 'gender'
 	 Then  'Please Select gender' alert message should display
 	 
 	 
Scenario: user is trying to register using valid set of details
 	  Given   User is accessing RegistrationPage on Browser
 	  When  User is trying to submit request after entring valid set of information 
 	  Then 'Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile' alert message should display