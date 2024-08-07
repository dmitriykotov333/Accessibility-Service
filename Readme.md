# Accessibility Service

## About App

Android application that tracks user
requests in the browser and adds in the database. After
opening the application, the user sees a list of such requests.

The user enters a query either in the URL bar or the search bar, 
and the request is saved to the database after click enter in keyboard. 
It is possible to track multiple browsers. The application displays a list of all saved queries.

The number of duplicate links is displayed because there may be identical requests, and to avoid duplicates in the list,
the application combines them and shows the number of duplicates. 
When clicked, you can view the last ten items. 
The list is sorted by request date and time.
There is an option to delete requests from the list. 
Supports both light and dark themes.

| Service off(Text clickable)  | Service on |  
| ------------- | ------------- |   
| <img src = "https://github.com/user-attachments/assets/fbc4e568-8550-4c8d-9d26-739765454dee" width="300"/>  | <img src = "https://github.com/user-attachments/assets/fee6573d-ce2d-4b84-9f4d-7fa78efd97aa" width="300"/>  |  
 


| Link clickable  | Fake data Example                                                                                                              |
| ------------- |--------------------------------------------------------------------------------------------------------------------------------|
| <video src="https://github.com/user-attachments/assets/b9c85d40-cc5b-4180-a22a-90a887044c3f" width="352" height="720"></video> | <video src="https://github.com/user-attachments/assets/0e5ca29f-9d87-4132-8f0c-45435c3e906a" width="352" height="720"></video> |


| Light theme  | Dark theme |
| ------------- | ------------- |
| <img src = "https://github.com/user-attachments/assets/5186cc90-f012-4592-ad42-37f6ad2eec40" width="300"/>  | <img src = "https://github.com/user-attachments/assets/3aa807fc-a6e4-400c-860b-3ae59d20e874" width="300"/>  |


## Libraries and Tools  
  - MVI
  - Jetpack Compose
  - Dagger Hilt
  - Coroutines
  - Room
  - Convention gradle plugin
  - Compose Navigation
  - Lottie
  - SQLCipher(Safety for Room)
  - Design pattern: Factory
 