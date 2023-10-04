# EmailNotification
This repository is an Email Notification system which takes the email from which we want to sent and to whom we want to send also it takes two more parameters subject and email text .
In this project I have not used any frontend . 
In this proejct I have used spring boot starter mail dependency .


Note : 
If you are using this project for execution make sure that you change username as sender mail and password (for getting this password -> 
1. go to gmail account 
2. click on your profile
3. click on manage your google account
4. select security from the left pane
5. complete the two sept verification process
![image](https://github.com/pratik1507/EmailNotification/assets/110710381/6a377070-0b01-4004-bbc9-a6ffbbe3e042)

6. once you get that green tick on 2 step verification click on the arrow beside.
7. enter your password
8. go to app passwords
9. create new app by giving any app name
10. once you create app you will get one app password for your device copy that password and save it somewhere .
11. now in application.properties keep spring.mail.password as the password obtained by removing spaces in middle.
)
from the application.properties under src/main/resources.

Also change the sender mail, reciever mail, subject and message as requried from com.klu.controller under src/main/java

Hope this infromation will help you to execute the code successfully.

