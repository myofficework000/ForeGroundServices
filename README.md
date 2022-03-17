# 🔥ForeGroundServices Simple App using koltin 🔥  

[![Abhishek LinkedIn](https://img.shields.io/badge/Abhishek-LinkedIn-blue.svg?style=for-the-badge)](https://www.linkedin.com/in/abhishek-pathak-b735018b/) 

## ForeGroundServices
Simple App to demonstrate Foreground Service using KOTLIN

Foreground service example for targeting Android Oreo or above (8.0, API level 26)
## What is Foreground services?
A foreground service performs some operation that is noticeable to the user. For example,
an audio app would use a foreground service to play an audio track. Foreground services must display a Notification. 
Foreground services continue running even when the user isn’t interacting with the app.

### Creating a Foreground Service takes the following steps.
Start a Service, a Sticky Service that sticks to the Application.
Display a notification to let Android know about the foreground service
Once your notification is displayed, implement the logic for the Foreground Service. This is where you stream the music or map directions
Update the notification respectively. Note: Until the Foreground service is completely killed, notification has to be displayed
Once the work is done, kill your Service.
