# DeltaZ-Notes
## Overview
This is an Android application that allows you to create notes. I use [Google Keep](https://www.google.com/keep/) a lot, and after watching this [video](https://www.youtube.com/shorts/aFmRL34-Auk) by Philipp Lackner, I thought it would be a pretty cool idea to create my own version of a note-taking app. The version Philipp suggests would be made offline first, then focus on online functionality (where data can be synced - similar to Google Keep) and this would help me to better understand and use local databases (Room), authentication and remote APIs (Retrofit, most likely). To segment things, v1.0 would focus on offline mode first, setting the base for everything, then the online functionalites would see v2.0 being complete.  
It is built using the Kotlin programming language and developed in Android Studio and is tested on an emulator of the Google Pixel 3A and a physical Samsung Galaxy Tab A 8.0 (2019) SM-T290.  

## Usage
To use this project:  
- Download and install [Android Studio](https://developer.android.com/studio) (the version currently being used in development is Flamingo but I expect any other, at least recent, version will work).
- Clone this repository to your machine.
- Open Android Studio and click on File in the menu bar at the top of Android Studio, click Open and navigate to the directory where you cloned the project.
- Open the project. 

## Deliverables
For v1.0:

| Functional Requirements | Non-Functional Requirements |
| ----------------------- | --------------------------- |
| <ul><li>- [ ] The app shall allow the user to make a note which consists of a heading, and the note details (the body of the note)</ul></li> | <ul><li>- [ ] The app shall save the user's data persistently, even after the app is closed </ul></li> | 
| <ul><li>- [ ] The app shall allow the user to select the app theme from a selection of standard themes</ul></li> | |
| <ul><li>- [ ] The app shall store the details about each note locally (such as heading, time created and time last updated)</ul></li> | |
| <ul><li>- [ ] The app shall separate notes into pinned and unpinned sections.</ul></li> | |
| <ul><li>- [ ] The app shall allow the user to move around notes (only within their section: pinned notes can only be moved around in the pinned section and the same for unpinned notes in the unpinned section)</ul></li> | |
| <ul><li>- [ ] The app shall allow the user to delete a note and its related details</ul></li> | |
