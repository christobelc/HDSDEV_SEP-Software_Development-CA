# HDSDEV_SEP-Software_Development-CA

Question 1:
An airline company has hired you to develop an application to determine the
rewards offered to the customers who joined their Fly Club loyalty program. The
application prompts the user to provide the customer’s Fly Club membership status,
and to specify whether the flight is within Europe. Next, the application computes
the rewards, namely reward points earned and whether the customer has priority
boarding according to the rules from the following table:
Membership
Status
Is the flight within
Europe?

-------------------------------Rewards-------------------------------

green yes • Receives 10 additional points
• Priority boarding – no
no • Receives 20 additional points
• Priority boarding – no
gold yes • Receives 30 additional points
• Priority boarding – no
no • Receives 50 additional points
• Priority boarding – yes
platinum yes • Receives 70 additional points
• Priority boarding – yes
no • Receives 90 additional points
• Priority boarding – yes
--------------------------------------------------------------
(a). Develop an instantiable class for this application which contains:
A class definition
Suitable data members (instance variables)
A constructor
All necessary setter methods to set the details provided by the user
A compute method to determine the rewards (according to the rules in the
previous table)
All necessary getter methods to return the possible rewards
Name the instantiable class FlyMembership.

(b). Develop an application that uses the instantiable class FlyMembership (the
instantiable class previously developed) to calculate the rewards the airline
company offers to a customer. The application will display the customer’s rewards
on the screen in the following format
reward points
priority boarding
In the application class, please add a short comment for each method of the
FlyMembership class that you use/call in the application to explain why that
method is needed.
Name the application class FlyMembershipApp.



Question 2:
The Programming Society asks for your help to create an application to encode
sentences. The application prompts the user to enter one piece of text (at least one
sentence). The text can contain only letters, spaces (i.e. ‘ ‘) and dots (i.e. ‘.’). Each
sentence ends with a dot. (Please note that you are not required to validate the
input). Next, the application uses the given text to create the corresponding
encoded text. The encoded text is created using the following rules:
• Replace every 6th character of the initial text with a question mark (i.e. ‘?’),
unless the character is a space (i.e.’ ‘ ) or a dot (i.e. ‘.’ )
• Each space is replaced by an asterisk character (i.e. ‘*’)
• Each dot is replaced by an exclamation mark (i.e. ‘!’)
1. Develop an instantiable class for this application which contains:
A class definition
Suitable data members (instance variables)
A constructor
A setter method to set the given text
A compute method to create the encoded text
A getter method to return the encoded text
Name the instantiable class SentenceEncoder.

(a). Develop an instantiable class for this application which contains:
A class definition
Suitable data members (instance variables)
A constructor
A setter method to set the given text
A compute method to create the encoded text
A getter method to return the encoded text
Name the instantiable class SentenceEncoder.
For example, if the instantiable class receives:
• The text “YOU are your best thing.” then the compute method should create
the encoded text “YOU*a?e*you?*best*thing!”
• The text “Omar learned Java. John learned C.” then the compute method
should generate the encoded text “Omar*?earne?*Java!*John*learn?d*C!”

(b). Develop an application that uses the instantiable class SentenceEncoder (the
instantiable class previously developed) to encode a piece of text. The application
will display the encoded text on the screen. In the application class, please add a
short comment for each method of the SentenceEncoder class that you use/call in
your application to explain why that method is needed.
Name the application class SentenceEncoderApp.
