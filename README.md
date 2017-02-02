# Vibe
Music App Structure

 
 Vibe - Complete Music App 

Description  
 
Stylish , Powerful and Fast Music Player with elegant design . Music Player lets you manage all your music files quickly and easily .This audio player supports almost all types of mp3 , midi ,wav , flac raw aac files and other audio formats . Easily browse and play music songs by genres , albums , artists , songs and folder . Features : 
- Plays all audio files 
- Color theme select option 
- Plays song by folder 
- Support for Playlist 
- Android  lock screen playback 
 
Intended User 
 
Every Person on the face of the planet, because everybody loves music. 
 
Features 
 
● Listen to music  ● Create Playlist 
 
Key Considerations 
 
How will the app handle data persistence?  
 
To show the list of music, the app will query the Android MediaStore​ ​and populate a ListView​ with the obtained ​Cursor​.  
 
Describe any corner cases in the UX. 
When the user hits back button from Now Playing screen an intent is passed back to the Home screen which shows the current playing song and also the list of other songs on the device. 
 
 
Describe how you will implement Google Play Services. I’ll use Google Analytics to keep monetize my app, to track the no. of users, how they use the app and to analyze how the app is being used. Another Service i’ll be using is AdMob to display ads. 
 
 
Next Steps: Required Tasks 
 
 
Task 1: Project Setup 
  
● Choose the libraries and add them to gradle ● Decide the versions of Android the app will support. 
 

Task 2: Implement UI for Each Activity and Fragment 
 
 
● Build UI for Home Screen ● Build UI for Now Playing  
 
Task 3: Work on Functionality 
 
● Get the list of music on the device. ● App implements a ContentProvider to access locally stored data. ● Implement music operations like play,pause ● To pull or send data to/from a web service or API only once, or on a per request basis (such as a search application), app uses a Retrofit Intent Service to do so.  ● The app will use a loader to move its data to its views. 
 
 
